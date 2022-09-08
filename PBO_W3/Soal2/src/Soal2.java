import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===========================================");
		
		for(int i = 0; i < 3; i++) {
			//Data String
			StringBuilder dataString;
			System.out.println();
			String s = scan.next();
			int panjang = s.length();
			
			if(s.length() > 10) {
				// Bila lebih dari 10, maka diambil substringnya saja dari karakter 0 sampai 10
				//Pake stringbuidler agar bisa di modifikasi stringnya
				dataString = new StringBuilder(s.substring(0, 10));
			}else {
				dataString = new StringBuilder(s);
			}
			
			//Data Integer
			StringBuilder dataInteger;
			int angka = scan.nextInt();
			
			if(angka > 999) {
				//Diubah menjadi karakter dulu
				//Bila lebih dari 3, maka diambil substringnya saja dari karakter 0 sampai 3
				dataInteger = new StringBuilder(Integer.toString(angka).substring(0, 3));
				
				int second_data = Integer.parseInt(dataInteger.toString());
				
				System.out.printf("%s		%03d\n", dataString, second_data);
			}else {
				System.out.printf("%s		%03d\n", dataString, angka);
			}
		}
		
		System.out.println("===========================================");
		
		scan.close();
	}

}
