//import java.util.*; Bisa digunakan juga
//Source : http://javagoodpractices.blogspot.com/2019/03/java-datatypes-hackerrank-solution-in.html
import java.util.Scanner;

public class DataTypes {
    public static void main(String []argh){
        int n, a, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("CHECK DATA TYPES\n");
        System.out.println("Input the amount of data you want to check: ");
        n = sc.nextInt();
        
        for (i=0 ; i< n ; i++){
            try{
                System.out.println("Input the data: ");
                a = sc.nextInt();
                System.out.println("-> " + a + " can be fitted in:");
                    if(a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) System.out.println("* byte");
                    if(a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) System.out.println("* short");
                    if(a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) System.out.println("* int");
                    if(a >= Long.MIN_VALUE && a <= Long.MAX_VALUE) System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");  
            }
        }
        System.out.println("End...");
        //Digunakan untuk mengatasi Resource Leak
        sc.close();
    }
}
