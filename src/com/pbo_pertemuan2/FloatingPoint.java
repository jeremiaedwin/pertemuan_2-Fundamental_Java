package com.pbo_pertemuan2;

public class FloatingPoint {
	/**
	 * Modul ini menggunakan function built-in di dalamnya
	 * modul tersebut adalah Math.round
	 * 1. nilai nx setelah menggunakan Math.round menjadi 93
	 *    hal ini dikarenakan fungsi tersebut akan membulatkan nilai
	 *    ke bilangan yang palng tinggi oleh karena itu 92.98 dibulatkan menjadi 93
	 * 2. Karena fungsi ini hanya akan mengembalikan nilai integer, oleh karena itu
	 *    kita perlu mengubah nilai x menjadi integer dengan cara casting
	 * @param args
	 */
	public static void main(String[] args) {
		 double x = 92.98;
		 int nx = (int) Math.round(x);
		 System.out.println(nx);
	}

}
