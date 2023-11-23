
package pertemuan6.enkapsulasi.latihan;
import java.util.Scanner;

public class run {
    
    public static void main(String[] args) {
        
       
        master mymaster = new master ();
        Scanner scan = new Scanner (System.in);
        
        String nama;
        System.out.print("Masukkan nama = ");
        nama = scan.next();
        
       System.out.println("Nama karakter anda adalah " + nama);
       
       mymaster.setatk(20);
       mymaster.sethp(100);
       mymaster.setmp(50);
      
        System.out.println("health = " + mymaster.gethp());
        System.out.println("attack = " + mymaster.getatk());
        System.out.println("mana = " + mymaster.getmp());
        
           
       
    }
}
