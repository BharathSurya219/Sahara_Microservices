package com.sahara.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahara.user.exception.UserException;
import com.sahara.user.utility.ExceptionController;

@RestController
@RequestMapping("/")
public class SampleAPI {

	private Logger logger = LoggerFactory.getLogger(SampleAPI.class);
	
	@GetMapping(name = "/ok", value = "/ok")
	public String name() throws UserException {
		logger.debug("debug");
		logger.info("info");
		logger.error("error");
		logger.trace("trace");
		logger.warn("warn");
		boolean boo = true;
		if (boo) {
			throw new UserException("throwing");
		}
		return "Ok ra";
	}
}
