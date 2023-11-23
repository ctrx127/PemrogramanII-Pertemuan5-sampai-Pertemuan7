
package pertemuan5.override.tugas;

import java.util.Scanner;

public class segitiga extends master{
    
    Scanner scan = new Scanner (System.in);
    @Override
    public void luas (){
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan alas = ");
        alas = scan.nextDouble();
        System.out.print("Masukkan tinggi = ");
       tinggi = scan.nextDouble();
        double luas = 0.5 * alas * tinggi;
      
        System.out.println("Luas segitiga = " + luas);
    }
    
    @Override
    public void keliling (){
        System.out.println("Megnhitung Keliling Segitiga");
        System.out.print("Masukkan sisi 1 = ");
        sisi1 = scan.nextDouble();
        System.out.print("Masukkan sisi 2 = ");
        sisi2 = scan.nextDouble();
        System.out.print("Masukkan sisi 3 = ");
        sisi3 = scan.nextDouble();
        double keliling = sisi1 + sisi2 + sisi3;
        System.out.println("Keliling segitiga = " + keliling);
    }
    
}
