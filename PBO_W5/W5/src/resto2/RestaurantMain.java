package resto2;

import java.util.Scanner;
/**
 *
 * @author NAZWA FZ
 */
public class RestaurantMain {
   
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        Scanner input = new Scanner(System.in);
        String keputusan = "Y";
	menu.tambahMenuMakanan("Batagor", 5_000, 20);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Roti Bakar", 12_000, 20);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Indomie+Telor", 10_000, 30);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Kwetiaw", 12_000, 20);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Nasi Goreng", 12_000, 20);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Teh Manis", 4_000, 20);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Air MIneral", 3_000, 20);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Jus Alpukat", 4_000, 20); 
        Restaurant.nextId();
	menu.tambahMenuMakanan("Teh Botol", 5_000, 20);
        Restaurant.nextId();
	menu.tambahMenuMakanan("Kopi", 1_000, 20);
	menu.pesan();
        
        while(keputusan.equals("Y") || keputusan.equals("y")){
            System.out.println("Mau pesan lagi ? (Y/N)  ");
            keputusan = input.next();
            if (keputusan.equals("Y") || keputusan.equals("y")){
                menu.pesan();
            }
            else{
                System.out.println("Terima Kasih");
                break;
            } 
        }

    }
    
}
