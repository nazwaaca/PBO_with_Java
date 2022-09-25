package resto2;

import java.util.Scanner;
/**
 *
 * @author NAZWA FZ
 */
public class Restaurant {
	//untuk atribut makanan dipisah dan dibuat class baru
	private Makanan menuMakanan;
	private static byte idMenu = 0;
	
	public Restaurant() {
		menuMakanan = new Makanan();
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		menuMakanan.setNama_makanan(nama, idMenu);
		menuMakanan.setHarga_makanan(harga, idMenu);
		menuMakanan.setStok(stok, idMenu);
		
	}
	
	public void tampilMenuMakanan() {
            String status = "Habis";
                System.out.println("-------SELAMAT DATANG DI KANTIN BU ONENG-------");
                System.out.println("----------------------MENU---------------------");
                System.out.println("-----------------------------------------------");
		for(byte i = 0; i <= idMenu; i++) {
			if(!IsOutOfStock(i)) {
                                System.out.printf("%-2d. %-15s %-15d", i+1, menuMakanan.getNama_makanan(i), menuMakanan.getStok(i));
				System.out.println("Rp. " + menuMakanan.getHarga_makanan(i));
                        }
                        else{
                                System.out.printf("%-2d. %-15s %-15s", i+1, menuMakanan.getNama_makanan(i), status);
				System.out.println("Rp. " + menuMakanan.getHarga_makanan(i));
                        }
		}
	}
	
	public boolean IsOutOfStock(int id) {
		if(menuMakanan.getStok(id) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void nextId() {
		idMenu++;
	}
	
        public void totalBayar(int idMenu, int jumlah){
            int id = (byte) idMenu;
            double harga;
            harga = jumlah * menuMakanan.getHarga_makanan(id);
            System.out.println("Total Bayar     " + harga);
        }
        
	public void pesanMenuMakanan(int idMenu, int jumlah) {
		idMenu= idMenu-1;
		int id = (byte) idMenu;
		if(jumlah < 0)
			System.out.println("Input jumlah tidak boleh kurang dari 0");
		if((menuMakanan.getStok(id) - jumlah) < 0 )
			System.out.println("Mohon maaf stok tidak mencukupi");
		else {
			System.out.println(menuMakanan.getNama_makanan(id) + " sebanyak " + jumlah);
			menuMakanan.removeStok(id, jumlah);
                        totalBayar(id, jumlah);
			System.out.println("----------------------");
		}
	}
        
        public void pesan(){
            byte a,b;
            Scanner input = new Scanner(System.in);
            tampilMenuMakanan();
            System.out.println();
            System.out.println("Masukan nomor menu : ");
            a = input.nextByte();
            System.out.println("Masukan banyak pesanan : ");
            b = input.nextByte();
            pesanMenuMakanan(a, b);
        }       
	
}
