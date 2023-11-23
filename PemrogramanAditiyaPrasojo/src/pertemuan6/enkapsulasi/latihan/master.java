
package pertemuan6.enkapsulasi.latihan;

public class master {
    private int hp;
    private int atk;
    private int mp;
    
    public void sethp (int health){
        this.hp = health;
    }
    public void setatk (int attack){
        this.atk = attack;
    }
    public void setmp (int mana){
        this.mp = mana;
    }
    public int gethp (){
        return this.hp;
    }
    public int getatk (){
        return this.atk;
    }
   public int getmp (){
       return this.mp;
   }
}
