public class Troll implements Monstro{
    private int vida;
    private int CA;
    private int TP;
    private double MV;

    
    public Troll(){
        this.vida = 30;
        this.CA = 14;
        this.MV = 9;
        this.TP = 4;
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
