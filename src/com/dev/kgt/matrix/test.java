package com.dev.kgt.matrix;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrix m = new Matrix(3,3);
		Matrix m3 = new Matrix(10,10);
		m.randPop(1,-1);
		
		m.displayMatrix();
		
		m.identityConv(1);
		
		m.displayMatrix();
		m3.displayMatrix();
		
		m3 = m.clone();
		
		m3.displayMatrix();
	}

}
