package com.techment.exception;

public class TransactionException extends RuntimeException {
	
	String msg3;

	public TransactionException(String msg3) {
		super();
		this.msg3 = msg3;
	}

	public String getMsg3() {
		return msg3;
	}

	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}
	

}
