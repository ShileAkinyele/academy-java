package com.bptn.course._14_custome_exceptions._01_custom_exception_1;

// We often Extend either Exception class or RuntimeException class
public class InsufficientFundsException extends Exception {
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}


}
