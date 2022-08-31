package com.pbo_pertemuan2;

public class Constants {
	
	// 1. Baik class Constants maupun Constants2 memiliki output yang sama
	// 2. Perbedaannya adalah dari variabel konstanta yang dimilikinya
	//    Constants mendeklarasikan const nya di dalam method
	//    Constants2 mendeklarasikan const nya di luar method/sebagai atribut class
	//    Const pada class pertama hanya bisa diakses oleh modul yang menampungnya saja
	//    Const pada class kedua bisa diakses oleh modul manapun, selain itu walaupun atribut dan memiliki modifier public
	//    Const tersebut dapat diakses secara langsung tanpa membuat objek karena bersifat stat
	public static void main(String[] args) {
		 final double CM_PER_INCH = 2.54;
		 double paperWidth = 8.5;
		 double paperHeight = 11;
		 System.out.println("Paper size in centimeters: " +
		 paperWidth * CM_PER_INCH + " by " + paperHeight *
		 CM_PER_INCH);
	} 
}
