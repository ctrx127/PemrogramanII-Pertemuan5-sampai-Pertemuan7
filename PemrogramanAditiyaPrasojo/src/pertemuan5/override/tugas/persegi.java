
package pertemuan5.override.tugas;
import java.util.Scanner;

public class persegi extends master{
    master mymaster = new master ();
    Scanner scan = new Scanner (System.in);
    @Override
    public void luas (){
        System.out.println("Menghitung luas persegi");
        System.out.print("Masukkan sisi = ");
        mymaster.sisi = scan.nextDouble();
        double luas = mymaster.sisi * mymaster.sisi;
        System.out.println("Luas persegi = " + luas);   
    }
    @Override
    public void keliling () {
        System.out.println("Menghitung keliling persegi");
        System.out.print("Masukkan sisi = ");
        mymaster.sisi = scan.nextDouble();
        double keliling = 4 * mymaster.sisi;
        System.out.println("Keliling persegi = " + keliling);
    }
    
}
