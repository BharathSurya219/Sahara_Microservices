package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleAPI {

	@GetMapping(name = "/ok",value = "/ok")
	public String name() {
		return "OK";
	}
}
