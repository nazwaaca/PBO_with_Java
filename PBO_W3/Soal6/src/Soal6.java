import java.util.*;
import java.math.BigInteger;
public class Soal6 {
    public static void main(String[] args) {
        BigInteger W,X,Y,Z;
        
        System.out.println("Masukkan Angka : ");
        Scanner scan = new Scanner (System.in);
        
        W = scan.nextBigInteger();
        X = scan.nextBigInteger();
        
        Y = W.add(X);
        Z = W.multiply(X);
        
        System.out.println("Hasil " + W + "+" + X +" = "+ Y);
		System.out.println("Hasil " + W + "x" + X +" = "+ Z);
    }
    
}