package me.jay.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "jay");
		return "hello"; // view 이름 : hello
	}


}
