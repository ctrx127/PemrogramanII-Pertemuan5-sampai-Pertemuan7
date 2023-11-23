
package pertemuan5.override.tugas;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        persegi mypersegi = new persegi();
        segitiga mysegitiga = new segitiga ();
        Scanner scan = new Scanner (System.in);
        int pilihan;
        System.out.println("1.Persegi");
        System.out.println("2.Segitiga");
        System.out.print("Pilihan anda = ");
        pilihan = scan.nextInt();
        
        switch (pilihan){
            case 1 :
                System.out.println("1.Luas");
                System.out.println("2.Keliling");
                System.out.print("Pilihan anda = ");
                pilihan = scan.nextInt();
            switch (pilihan){
                
                case 1:
                    mypersegi.luas();
                    break;
                
                case 2:
                    mypersegi.keliling();
                    break;
                
                default :
                    System.out.println("error");
                    break;
            }
            break;
            case 2 :
                System.out.println("1.Luas");
                System.out.println("2.Keliling");
                System.out.print("Pilihan anda = ");
                pilihan = scan.nextInt();
                
             switch (pilihan){
                 case 1:
                    mysegitiga.luas();
                    break;     
                case 2:
                    mysegitiga.keliling();;
                    break;
                default :
                    System.out.println("error");
                    break;
            }  
             break;
            default:
                System.out.println("error");
            break;
        }
    }
    
}
