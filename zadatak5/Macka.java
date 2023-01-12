package domaci17.zadatak5;
/*

Macka ima atribut za tezinu i metodu koja ispisuje “I’m a chonk” ili “I’m not a chonk” u zavisnosti da li je tezina preko 5kg.

 */

public class Macka extends Zivotinja{
    private int tezina;
    public Macka() {

    }

    public void setTezina(int tezina){
        this.tezina = tezina;
    }
    public String checkChonk() {
        if (tezina > 5) {
           return "I’m a chonk!";
        } else {
           return  "I’m not a chonk!";
        }
    }


    public String noise(){
       return "Meow!";
    }
    @Override
    public String toString() {
        return super.toString() + " Macka " + tezina + "kg" + " ### " + checkChonk() + " And the noise that it makes is " + noise();
    }
}
