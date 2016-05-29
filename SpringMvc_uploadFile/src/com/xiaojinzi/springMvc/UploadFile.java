package com.xiaojinzi.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("uploadFile")
public class UploadFile {

	@RequestMapping("test")
	public String testFileUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) {

		System.out.println("desc = " + desc);
		System.out.println("fileName = " + file.getOriginalFilename());
		System.out.println("contentType = " + file.getContentType());

		// 表示转发到:/WEB-INF/views/success.jsp 页面
		return "success";
	}

}
