import java.util.Random;

/**
 * Ator
 */
public class Ator implements Personagem{
   private int HP;
   private int Ataque;
   private int Defesa;
   private int TP;
   private int CA;
   private int MV;
   private int Nivel;

   public Ator(){
        Random roll = new Random();
        this.HP = 6;
        this.Nivel=1;
        this.CA = 0;
        this.Ataque = roll.nextInt(2,12) + Nivel;
        this.Defesa = roll.nextInt(2,12) + CA;
   }

    @Override
    public int getATK() {
        // TODO Auto-generated method stub
        return Ataque;
    }

    @Override
    public int getCA() {
        // TODO Auto-generated method stub
        return CA;
    }

    @Override
    public int getDEF() {
        // TODO Auto-generated method stub
        return Defesa;
    }

    @Override
    public int getHP() {
        // TODO Auto-generated method stub
        return HP;
    }

    @Override
    public void setHP(int hp) {
        this.HP = hp;
    }


    @Override
    public double getMV() {
        // TODO Auto-generated method stub
        return MV;
    }

    @Override
    public int getNivel() {
        // TODO Auto-generated method stub
        return Nivel;
    }

    @Override
    public int getTP() {
        // TODO Auto-generated method stub
        return TP;
    }
    
    
}
