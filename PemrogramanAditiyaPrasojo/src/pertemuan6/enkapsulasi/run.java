
package pertemuan6.enkapsulasi;

public class run {
    public static void main(String[] args) {
        user dian = new user();
        dian.setPassword("kopi java");
        dian.setUsername("dian");
        
        System.out.println("Username = " + dian.getUsername());
        System.out.println("Password = " + dian.getPassword());
    }
    
}
