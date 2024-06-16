package com.driver;

public class Main {
	public static class Product {
		public int product(int x,int y) {
			return x * y;
		}
		public int product(int x,int y,int z) {
			return x * y * z;
		}
		public double product(double x,double y) {
			return x * y;
		}
	}
	public static void main(String[] args) {
	 Product p = new Product();
	 int p1= p.product(2, 3);
	 int p2= p.product(2, 3, 4);
	 double p3= p.product(2, 4);
	 System.out.println("Product of 2 and 3: " + p1);
     System.out.println("Product of 2, 3, and 4: " + p2);
     System.out.println("Product of 2.5 and 3.5: " + p3);
	 
	}

}