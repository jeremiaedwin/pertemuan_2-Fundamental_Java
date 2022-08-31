package com.pbo_pertemuan2;
import java.io.*;
import java.util.Scanner;

public class soal_1 {
	
	/**
	 * Methon ini digunakan untuk memeriksa apakah
	 * sebuah number cocok dengan tipe data tertentu
	 * tipe data yang ada adalah byte, integer, long dan short
	 * @param number merupakan input yang didapat dari modul utama
	 */
	static void getFitDataType(String number) {
		try {
			long num = Long.parseLong(number);
			System.out.print("\n" + number + " Can be fitted in:  \n");

			if (num > Byte.MIN_VALUE && num < Byte.MAX_VALUE) {
				System.out.println("* byte\n");
			}
			
			if (num > Short.MIN_VALUE && num < Short.MAX_VALUE) {
				System.out.println("* short\n");
			}
			
			if (num > Integer.MIN_VALUE && num < Integer.MAX_VALUE) {
				System.out.println("* Integer\n");
			}
			
			if (num > Long.MIN_VALUE && num < Long.MAX_VALUE) {
				System.out.println("* long\n");
			}
		} catch (NumberFormatException e){
			System.out.println( number +" can't be fitted anywhere." );
		}
	}
	
	/**
	 * Modul ini merupakan modul utama untuk
	 * memanggil modul getFitDataType
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int numberOfTest = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < numberOfTest; i++) {
			String number = scan.nextLine();
			getFitDataType(number);
            
		}
	}
}
