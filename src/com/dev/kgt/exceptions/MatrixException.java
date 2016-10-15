package com.dev.kgt.exceptions;

public class MatrixException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1326243931284567589L;

	public MatrixException(Throwable t){
		super(t);
	}
	
	public MatrixException(String msg){
		super(msg);
	}
	
}
