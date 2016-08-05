package com.lottery.mutual.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.lottery.mutual.constants.Constants;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

@Component
public class UploadThread {

	Logger log = LoggerFactory.getLogger(UploadThread.class);

	public void handleUpload(String filePath, String fileName) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(new Runnable() {

			@Override
			public void run() {
				// 密钥配置
				Auth auth = Auth.create(Constants.QINIU_AK, Constants.QINIU_SK);
				// 创建上传对象
				UploadManager uploadManager = new UploadManager();
				String upToken = auth.uploadToken(Constants.QINIU_BUCKETNAME);
				try {
					Response res = uploadManager.put(filePath.concat(fileName), fileName, upToken);
					log.info(res.bodyString());
				} catch (QiniuException e) {
					Response r = e.response;
					try {
						// 响应的文本信息
						log.error(r.bodyString());
						System.out.println(r.bodyString());
					} catch (QiniuException e1) {
						// ignore
					}
				}
			}

		});
		es.shutdown();
	}
}
