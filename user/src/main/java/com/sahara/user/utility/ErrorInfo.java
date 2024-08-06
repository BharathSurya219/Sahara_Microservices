package com.sahara.user.utility;

import java.time.LocalDateTime;

public class ErrorInfo {

	private String errormessage;
	private Integer errrorcode;
	private LocalDateTime timeStamp;

	public String getErrormessage() {
		return errormessage;
	}

	public Integer getErrrorcode() {
		return errrorcode;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public void setErrrorcode(Integer errrorcode) {
		this.errrorcode = errrorcode;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ErrorInfo [errormessage=" + errormessage + ", errrorcode=" + errrorcode + ", timeStamp=" + timeStamp
				+ "]";
	}

	
}
