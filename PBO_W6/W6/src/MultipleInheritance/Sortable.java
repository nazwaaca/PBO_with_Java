/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author NAZWA FZ
 */

//Source Code : https://pdfhoney.com/compress-pdf.html#google_vignette

//Diubah menjadi interface
interface Sortable {
    int compareTo (Sortable b);
}
//public abstract class interface Sortable {
//    public abstract int compareTo(Sortable b);
//    public static void shellSort(Sortable[] a){
//        int n = a.length;
//        int increment = n / 2;
//        while (increment >= 1){
//        for (int i = increment; i < n; i++){
//            Sortable temp = a[i];
//            int j = i;
//            while (j >= increment && temp.compareTo(a[j - increment]) < 0){
//                a[j] = a[j - increment];
//                j = j - increment;
//            }
//            a[j] = temp;
//        }
//        increment = increment/2;
//        }
//    }
//}

