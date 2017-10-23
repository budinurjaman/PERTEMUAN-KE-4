//package inputoutput4;

import java.util.Scanner ;

public class InputOutput4 {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
        String nama ;
        char jeniskelamin ;
        int tinggiBadan ;
        boolean menikah ;
    
    System.out.print("Masukkan nama ; ");
    nama = input.nextLine();
    System.out.print("Masukan Jenis Kelamin : ");
    jeniskelamin = input.next().charAt(0);
    
    System.out.print ("Masukan Tinggi Badan : ");
    tinggiBadan = input.nextInt();
    
    System.out.print("Masukan status menikah : ");
    menikah = input.nextBoolean();
    
    }
    
}
