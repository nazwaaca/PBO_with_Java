package resto1;

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
		for(byte i = 0; i <= idMenu; i++) {
			if(!IsOutOfStock(i)) {
				System.out.println(menuMakanan.getNama_makanan(i) + "[" + menuMakanan.getStok(i) + "]" + "\tRp. " + menuMakanan.getHarga_makanan(i));
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
	
}
