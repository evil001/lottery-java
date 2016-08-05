package com.lottery.ba.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lottery.mutual.ClientMessage;
import com.lottery.mutual.constants.Constants;
import com.lottery.mutual.thread.UploadThread;

@Controller
public class MainController {

	@Autowired
	private UploadThread uploadThread;

	@Value("${file.windows}")
	private String windowUploadUrl;

	@Value("${file.linux}")
	private String linuxUploadUrl;

	@RequestMapping("/main")
	public String main() {
		return "main/main";
	}

	@RequestMapping("/index")
	public String test() {
		return "main/upload";
	}

	@ResponseBody
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ClientMessage handleUpload(@RequestParam("files") MultipartFile[] files) {
		String filePath = null;
		List<String> list = new ArrayList<String>();
		if (System.getProperties().getProperty("os.name").startsWith("Windows")) {
			filePath = windowUploadUrl;
		} else {
			filePath = linuxUploadUrl;
		}
		if (files != null && files.length > 0) {
			for (MultipartFile multipartFile : files) {
				String fileName = multipartFile.getOriginalFilename();
				if (!multipartFile.isEmpty()) {
					try {
						multipartFile.transferTo(new File(filePath + fileName));
						// 七牛上传
						System.out.println(filePath + "::::" + fileName);
						this.uploadThread.handleUpload(filePath, fileName);
						list.add(Constants.QINIU_URL.concat(fileName));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			return ClientMessage.faild();
		}
		return ClientMessage.success(list);
	}
}
