package resto2;
/**
 *
 * @author NAZWA FZ
 */
//Sesuai dengan class design hint yaitu
//"Break up classes that have too many responsibilities"
//Dimana lebih baik dibuat class baru untuk atribut makanan
public class Makanan {
	//Sesuai dengan class Design hint yaitu "Always keep data private"
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int [] stok;
	
	//Sesuai dengan di buku yaitu selalu inisiasi data
	Makanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int [10];
	}

	public String getNama_makanan(int id) {
		return nama_makanan[id];
	}

	public void setNama_makanan(String nama_makanan, int id) {
		this.nama_makanan[id] = nama_makanan;
	}

	public double getHarga_makanan(int id) {
		return harga_makanan[id];
	}

	public void setHarga_makanan(double harga_makanan, int id)  {
		this.harga_makanan[id] = harga_makanan;
	}

	public int getStok(int id) {
		return stok[id];
	}

	public void setStok(int stok, int id) {
		this.stok[id] = stok;
	}	
	
	//Ditambah Attribut removestock
	public void removeStok(int id, int jumlah) {
		this.stok[id] -= jumlah;
	}
        

}

