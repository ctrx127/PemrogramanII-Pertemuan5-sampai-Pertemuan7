
package pertemuan7.polimorfisdinamic;

public class persegi extends bangundatar{
    @Override
    public void luas (){
        System.out.println("menghitung luas persegi");
        double luas = sisi * sisi;
        System.out.println("luas = " + luas);
   }
    @Override
    public void keliling (){
        System.out.println("Menghitung keliling persegi");
        double keliling = 4*sisi;
        System.out.println("keliling = " + keliling);
    }
}
