package com.techment.exception;


	public class PaymentException extends RuntimeException {

		String msg2;

		public PaymentException(String msg2) {
			super();
			this.msg2 = msg2;
		}

		public String getMsg2() {
			return msg2;
		}

		public void setMsg2(String msg2) {
			this.msg2 = msg2;
		}
	
}
