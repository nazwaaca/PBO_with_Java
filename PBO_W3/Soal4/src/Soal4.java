import java.util.Scanner;

public class Soal4{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gajiPokok = 500000, gajitotal, bonusPenjualanItem = (50000 * 10/100);
		
		System.out.printf("Jumlah Item Yang terjual: ");
		int hasilPenjualan = scan.nextInt();
		
		if(hasilPenjualan > 80) {
			gajitotal = gajiPokok + ((50000 * 35/ 100) * hasilPenjualan)
						+ (bonusPenjualanItem * hasilPenjualan);
		}else 
			if(hasilPenjualan >= 40 && hasilPenjualan < 80) {
			gajitotal = gajiPokok + ((50000 * 25/ 100) * hasilPenjualan)
						+ (bonusPenjualanItem * hasilPenjualan);
		}else 
			if(hasilPenjualan < 15){
			gajitotal = gajiPokok - ((50000 * 15/ 100) * (15 - hasilPenjualan));
		}else {
			gajitotal = gajiPokok + (bonusPenjualanItem * hasilPenjualan);
		}
		
		System.out.printf("Total gaji yang di dapat agent yaitu = Rp.%d,00", gajitotal);
		
		scan.close();
	}

}

