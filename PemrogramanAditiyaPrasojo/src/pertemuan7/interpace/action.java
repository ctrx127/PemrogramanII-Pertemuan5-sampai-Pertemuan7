
package pertemuan7.interpace;

public class action implements user {

    @Override
    public void walking() {
        System.out.println("Player start walking");
    }

    @Override
    public void running() {
        System.out.println("Player start running");    
    }

    @Override
    public void attacking() {
        System.out.println("Player start attacking");
    }
    public void menu () {
        System.out.println("1.walking");
        System.out.println("2.running");
        System.out.println("3.attacking");
        System.out.println("4.selesai");
}
}
