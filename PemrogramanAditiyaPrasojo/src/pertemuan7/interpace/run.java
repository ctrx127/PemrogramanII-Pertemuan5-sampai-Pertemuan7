
package pertemuan7.interpace;
import java.util.Scanner;
public class run {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    action myaction = new action();
        myaction.menu();
        int pilihan = scan.nextInt();
        
        while (pilihan != 4) {
            
            switch (pilihan){
                case 1 :
                    myaction.walking();
                    break;
                case 2 :
                    myaction.running();
                    break;
                case 3 :
                    myaction.attacking();
                    break;
            }
        myaction.menu();
        pilihan = scan.nextInt();
        }
        System.out.println("selesai");
    }
}
