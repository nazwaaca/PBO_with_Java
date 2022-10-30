/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author NAZWA FZ
 */
public class EmployeeTest {
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        //Diujikan untuk gaji Antonio yang terbesar
        staff[0] = new Employee("Antonio Rossi", 3500000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        //Dengan menggunakan sortable maka akan mengurut dari yang gajinya paling kecil ke besar
//        Sortable.shellSort(staff);
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
        
    }
}
