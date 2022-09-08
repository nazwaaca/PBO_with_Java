import java.util.*;
public class Soal5 {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);
       
       System.out.println("Masukkan Plat : ");
		String semua;
                int no1, no2, no3, no4;	
		
		no1 = keyboard.nextInt();
		no2 = keyboard.nextInt();
		no3 = keyboard.nextInt();
		no4 = keyboard.nextInt();
		
		
		semua = String.valueOf(no1) + String.valueOf(no2) + String.valueOf(no3) + String.valueOf(no4);

		//String diubah menjadi long
		long gabungan = Long.parseLong(semua);
		gabungan = gabungan - 999999;
		byte modulo = (byte)(gabungan % 5);
		
		
		if (modulo == 0) {
			System.out.println("Berhenti");
		}
		else if (modulo != 0) {
			System.out.println("Jalan");
		}
    }
    
}