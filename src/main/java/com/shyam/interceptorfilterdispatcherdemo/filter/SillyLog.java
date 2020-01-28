package com.shyam.interceptorfilterdispatcherdemo.filter;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SillyLog {

	private static final Logger log = LoggerFactory.getLogger(SillyLog.class);

	int sequence;
	String uuid;
	String message;

	public SillyLog() {
		uuid = UUID.randomUUID().toString();
		message = "";
		sequence = 1;
	}

	public void debug(String msg) {
		msg = "SillyLog: " + uuid + "/" + sequence + " " + msg;

		System.out.println(msg);
		sequence++;
		message += msg + "\n\r";
	}

	public String getMessage() {
		return message;
	}

	public void resetSequence() {
		sequence = 1;
		message = "";
	}

}
