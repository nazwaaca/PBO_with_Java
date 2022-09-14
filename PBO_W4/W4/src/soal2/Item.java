package soal2;
public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		//Dilakukan penambahan this(), agar dapat memanggil
		//name dalam satu file
		this();
		System.out.println(this.name);
	}
}