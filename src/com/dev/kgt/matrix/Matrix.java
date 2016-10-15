package com.dev.kgt.matrix;

import com.dev.kgt.exceptions.MatrixException;

public class Matrix implements Cloneable{
	
	private int x_dim;
	private int y_dim;
	private double matrix[][];
	
	//constructor
	public Matrix(double a[][]){
		
		x_dim = a.length;
		y_dim = a[0].length;
		this.matrix = new double[x_dim][y_dim];
	}
	//constructor
	public Matrix(int row,int col){
		
		this.matrix = new double[row][col];
		x_dim = row;
		y_dim = col;
	}
	
	public Matrix getRowMatrix(int rowTarget) throws Throwable{
		
		if(rowTarget > this.getX_dim() || rowTarget < 0){
			throw new MatrixException("The target row does not exist!");
		}
		
		double rowM[][] = new double[1][this.getY_dim()];
		
		for(int y = 0;y<this.getY_dim();y++){
			rowM[0][y]= this.matrix[rowTarget][y];
		}
		return new Matrix(rowM);
	}
	
	public Matrix getColMatrix(int colTarget){
		
		double colM[][]= new double [this.getX_dim()][1];
		
		return new Matrix(colM);
	}
	
	//populate the matrix with random double numbers settin the min and max value
	public void randPop(int max,int min){
	
		for(int x = 0; x < this.getX_dim();x++){
			for(int y = 0; y < this.getY_dim();y++){
				this.matrix[x][y] = (double)(Math.random() * (max - min)) + min;
			}
		}
	}
	
	//validate is the matrix is a vector
	public boolean isVector(){
		boolean flag = false;
		if(this.getX_dim() == 1){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	}
	
	//sets the identity matrix with a target attribute (ie: 1 or 0 , depending the need)
	public void identityConv(int target){
		
		for(int x = 0; x < this.getX_dim();x++){
			for(int y = 0; y < this.getY_dim();y++){
				if(x==y){
					this.matrix[x][y] = target;
				}
			}
		}
	}
	
	public void displayMatrix(){
		
		for(int x = 0; x < this.getX_dim();x++){
			for(int y = 0; y < this.getY_dim();y++){
				System.out.print("| " + this.matrix[x][y]);
			}
			System.out.println(" |");
		}
		System.out.println();
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * 
	 * only clones the structure of the matrix
	 * not the values
	 */
	//make a copy of the matrix
	public Matrix clone(){
		return new Matrix(this.matrix);
	}
	
	
	
	//returns the row count
	public int getX_dim() {return x_dim;}
	//returns the Columns count
	public int getY_dim() {return y_dim;}

	public double[][] getMatrix() {return matrix;}

	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}
	
	
}
