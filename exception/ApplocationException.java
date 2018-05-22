package com.calypso.java.exception;

public class ApplicationException extends Exception {

	private int statusCode;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public ApplicationException(String msg)
	{
		super(msg);
	}
	

}
