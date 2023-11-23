
package pertemuan7.polimorfisstatic;

public class polimorfis {
    public void kelilinglingkaran (double r){
        double keliling = 2* 3.14 * r;
        System.out.println("luas lingkaran = " + keliling);
    }
    public void kelilinglingkaran (float d){
        double keliling = 3.14 * d;
        System.out.println("keliling lingkaran = " +keliling);
    }
    
    public static void main(String[] args) {
      polimorfis l = new polimorfis ();
      double jari2 = 10;
      float diameter = 5;
      l.kelilinglingkaran(jari2);
      l.kelilinglingkaran(diameter);
    }
    
}
