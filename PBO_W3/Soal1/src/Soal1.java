import java.util.*;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        scan.close();
        
        //jika input kosong maka akan print "input kosong"
		if(s.length()==0) {
        
			System.out.println("Input kosong!");
        }
		else {
	        //Pake Split buat misahin demilimiter
	        //Pake Trim buat eliminasi digunakan untu kmembuang karakter spasi diawal dan akhir
	        String[] kata = s.trim().split("[!,?.*_'@\\ ]+");
	        int ukuran = kata.length;
	        System.out.println(ukuran);
	        for(int i=0; i<ukuran; i++){
	            System.out.println(kata[i]);
		}
        }
    }
}