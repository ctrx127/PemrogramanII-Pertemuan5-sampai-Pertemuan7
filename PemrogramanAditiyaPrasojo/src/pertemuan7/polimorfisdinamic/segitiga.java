
package pertemuan7.polimorfisdinamic;

public class segitiga extends bangundatar{
    
    @Override
    public void luas () {
        System.out.println("Menghitung luas segitiga");
       double luas = 0.5 * alas * tinggi;
        System.out.println("luas segitiga = " + luas);
    }
    @Override
    public void keliling (){
        System.out.println("menghitung keliling segitiga");
        double keliling = sisi1 + sisi2 + sisi3;
        System.out.println("keliling segitiga = " + keliling);
    }
    
}
