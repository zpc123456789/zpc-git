package com.atguigu.springboot.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*创建SpringBoot项目的步骤
 * 1、创建一个jar maven 工程
 * 2、在pom文件中引入 依赖 【继承 SpringBoot-parent 场景启动器 、 引入springBoot-web 场景启动器】
 * 3、创建Controller， 提供映射方法
 * 4、创建项目的主程序
 * 5、测试：运行 main 程序
 *

*/
@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String SayHello() {
		return "Hellow";	
	}

}
