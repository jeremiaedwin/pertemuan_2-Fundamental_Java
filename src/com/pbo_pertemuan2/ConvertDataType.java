package com.pbo_pertemuan2;

public class ConvertDataType {
	/**
	 * Method ini merubah variabel dengan tipe data long menjadi integer
	 * dan mengembalikan nilai berupa short
	 * @param l
	 * @return
	 */
	static short methodOne(long l)
	{
		int i = (int) l;
		return (short)i;
	}
	
	/**
	 * pada modul utama disiapkan variabel bertipe double
	 * variabel tersebut dicasting menjadi float
	 * dan dicasting kembali menjadi byte
	 * lalu dipanggil fungsi methodOne untuk merubahnya menjadi short
	 * @param args
	 */
	public static void main(String[] args)
	{
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f);
		System.out.println(b);
	 }
	
	// 1. Nilai b memiliki output 10 dengan tipe data byte
	// 2. Variabel d yang awalnya float dirubah menjadi byte pada b
	//	  sebelum menjadi byte, nilai d dicasting beberapa kali menjadi float, long, integer hingga short
	//    nilai b menjadi 10 karena byte tidak menerima angka decimal sehingga dibulatkan menjadi 10
}
