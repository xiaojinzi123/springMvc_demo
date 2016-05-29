package com.xiaojinzi.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloWorld {

	@RequestMapping("test")
	public String test() {
		System.out.println("请求到来");
		// 表示转发到:/WEB-INF/views/success.jsp 页面
		return "success";
	}

}
