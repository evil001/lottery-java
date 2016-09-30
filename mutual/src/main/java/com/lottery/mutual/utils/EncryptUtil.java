package com.lottery.mutual.utils;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.springframework.util.DigestUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 加密工具类
 * 
 * @author tangxiaojun
 *
 */
public class EncryptUtil {

	private static String KEY_ALGORITHM = "RSA";

	private static String SIGNATURE_ALGORITHM = "MD5withRSA";

	private static String PRIVATE_KEY = "RSAPRIVATEKEY";

	private static String PUBLIC_KEY = "RSAPUBLICKEY";

	/**
	 * MD5加密
	 * 
	 * @param content
	 * @return
	 */
	public static final String MD5(String content) {
		return DigestUtils.md5DigestAsHex(content.getBytes());
	}

	public static final Map<String, Object> rsainitKey() throws NoSuchAlgorithmException {
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		keyPairGen.initialize(1024);
		KeyPair keyPair = keyPairGen.generateKeyPair();
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(PUBLIC_KEY, publicKey);
		map.put(PRIVATE_KEY, privateKey);
		return map;
	}

	public static final byte[] decryptBASE64(String key) throws Exception {
		return (new BASE64Decoder()).decodeBuffer(key);
	}

	public static final String encryptBASE64(byte[] key) throws Exception {
		return (new BASE64Encoder()).encodeBuffer(key);
	}

	public static final String getPublicKey(Map<String, Object> map) throws Exception {
		Key key = (Key) map.get(PUBLIC_KEY);
		return encryptBASE64(key.getEncoded());
	}

	public static final String getPrivateKey(Map<String, Object> map) throws Exception {
		Key key = (Key) map.get(PRIVATE_KEY);
		return encryptBASE64(key.getEncoded());
	}

	public static final String sign(byte[] data, String privateKey) throws Exception {
		byte[] keyBytes = Base64.decodeBase64(privateKey);
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		PrivateKey privateK = keyFactory.generatePrivate(pkcs8KeySpec);
		Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
		signature.initSign(privateK);
		signature.update(data);
		return Base64.encodeBase64String(signature.sign());
	}

	public static boolean verify(byte[] data, String publicKey, String sign) throws Exception {
		byte[] keyBytes = Base64.decodeBase64(publicKey);
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
		PublicKey publicK = keyFactory.generatePublic(keySpec);
		Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
		signature.initVerify(publicK);
		signature.update(data);
		return signature.verify(Base64.decodeBase64(sign));
	}

	public static void main(String[] args) throws Exception {
		System.out.println(EncryptUtil.MD5("000000"));
		Map<String, Object> map = EncryptUtil.rsainitKey();
		String publicKey = EncryptUtil.getPublicKey(map);
		String privateKey = EncryptUtil.getPrivateKey(map);
		System.out.println(publicKey);
		System.out.println(privateKey);
		String sign = EncryptUtil.sign("1".getBytes("UTF-8"), privateKey);
		System.out.println("签名：" + sign);
		// 签名校验
		boolean ver = EncryptUtil.verify("1".getBytes("UTF-8"), publicKey, sign);
		if (ver)
			System.out.println("签名校验:通过");
		else
			System.out.println("签名校验：失败");

	}
}
