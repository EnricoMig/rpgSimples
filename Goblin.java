public class Goblin implements Monstro{
    private int vida;
    private int CA;
    private int TP;
    private double MV;

    
    public Goblin(){
        this.vida = 5;
        this.CA = 6;
        this.MV = 6;
        this.TP = 2;
    }




    @Override
    public int getCA() {
        // TODO Auto-generated method stub
        return CA;
    }


    @Override
    public double getMV() {
        // TODO Auto-generated method stub
        return MV;
    }


    @Override
    public int getTP() {
        // TODO Auto-generated method stub
        return TP;
    }


    @Override
    public int getVida() {
        // TODO Auto-generated method stub
        return vida;
    }



    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    

}
