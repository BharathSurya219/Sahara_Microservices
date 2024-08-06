package com.sahara.user.utility;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sahara.user.exception.UserException;

@RestControllerAdvice
public class ExceptionController {

	private Logger logger = LoggerFactory.getLogger(ExceptionController.class);
	
	@Autowired
	private Environment environment;
	
	@ExceptionHandler(Exception.class)
	public List<ErrorInfo> generalException(Exception exception) {
		List<ErrorInfo> errorInfos = new ArrayList<>();
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrormessage(exception.toString());
		errorInfo.setErrrorcode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorInfo.setTimeStamp(LocalDateTime.now());
		errorInfos.add(errorInfo);
		logger.debug(String.valueOf(errorInfos));
		return errorInfos;
	}
	
	@ExceptionHandler(UserException.class)
	public List<ErrorInfo> leaveExceptionHandler(UserException exception) {
		List<ErrorInfo> errorInfos = new ArrayList<>();
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrormessage(environment.getProperty(exception.getMessage()));
		errorInfo.setErrrorcode(HttpStatus.BAD_REQUEST.value());
		errorInfo.setTimeStamp(LocalDateTime.now());
		errorInfos.add(errorInfo);
		logger.debug("Error :"+errorInfo.toString());
		return errorInfos;
		
	}
}
