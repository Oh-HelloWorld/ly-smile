package com.smile.contrallor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestFreeMarker {


		@RequestMapping("/fm")
		public String hello(ModelMap map){
			map.addAttribute("user", "刘秀");
			map.put("sex", 1);//1 男 0 女
			
			List<String> userList=new ArrayList<String>();
			userList.add("张三");
			userList.add("李四");
			userList.add("王五");
			userList.add("赵六");
			userList.add("刘七");
			map.addAttribute("userList", userList);
			return "hello";
		}
}
