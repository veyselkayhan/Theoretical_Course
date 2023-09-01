package com.veysel.entity;

import java.io.Serializable;
import java.util.UUID;

public class Log implements Serializable {
	
	
	String uuid;
	String message;
	String className;
	String methodName;
	Long timestamp;
	String detail;
	
	
	
	@Override
	public String toString() {
		return "Log [uuid=" + uuid + ", message=" + message + ", className=" + className + ", methodName=" + methodName
				+ ", timestamp=" + timestamp + ", detail=" + detail + "]";
	}
	
	public Log(String message, String className, String methodName, Long timestamp, String detail) {
		this.uuid=UUID.randomUUID().toString();
		this.message = message;
		this.className = className;
		this.methodName = methodName;
		this.timestamp = timestamp;
		this.detail = detail;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	
}
