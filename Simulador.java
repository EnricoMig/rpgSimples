
/*public boolean ehForte(Pokemon pAtaca, Pokemon pDefende) {
        
        String[] lista = pAtaca.getForte();
        int forte = 0;
        for (String f: lista) {
            if (f.equals(pDefende.getTipo())) {
                forte++;
            }
        }
        
        if (forte == 0) {
            return false;
        } else {return true;}        
    } */
import java.util.Random;
public class Simulador {

    public void ataqueAtor(Personagem Ator, Monstro Inimigo){
        if(Ator.getATK() > Inimigo.getCA()){
            Inimigo.setVida(Inimigo.getVida()-Ator.getATK());
        } 
    }

    public void ataqueInimigo(Personagem Ator, Monstro Inimigo){
        if(Inimigo.getTP() > Ator.getCA()){
            Ator.setHP(Inimigo.getTP()-Ator.getDEF());
        }
    }

    public int rolador(){
        Random roll = new Random();
        int rolador=0;
        return  rolador = roll.nextInt();
    } 

    public Monstro definindoMonstro(){
        switch (rolador()) {
            case 1:
                return //goblin;
            case 2:
                return //goblin";
            case 3:
                return //goblin;
            case 4:
                return //esqueleto;
            case 5:
                return //esqueleto;
            case 6:    
                return //troll;
        }
    }

    public void combate (Personagem Ator, Monstro Inimigo){
        
        if(Ator.getMV() > Inimigo.getMV()){
            while (Inimigo.getVida() != 0 || Ator.getHP() != 0) {
                for(int key = 0; key<2; key++){
                    switch (key) {
                       case 0:
                        ataqueAtor();
                       case 1:
                       ataqueInimigo();
                    }
                }
            }
        } else {
            while (Inimigo.getVida() != 0 || Ator.getHP() != 0) {
                for(int key = 0; key<2; key++){
                    switch (key) {
                       case 0:
                        ataqueInimigo();
                       case 1:
                       ataqueAtor();
                    }
                }
            }
        }
       
    }


    
}
