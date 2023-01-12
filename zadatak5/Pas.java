package domaci17.zadatak5;
/*

Napraviti klase pas i macka koje nasledjuju zivotinju.
Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy” u zavisnosti od toga da li je promenljiva goodBoy true ili false.

 */

public class Pas extends Zivotinja{

    private boolean goodBoy;

    public Pas() {

    }
    public void setGoodBoy(boolean goodBoy){
        this.goodBoy = goodBoy;
    }
    public String checkIfIsAGoodBoy() {
        if (!goodBoy) {
            return"I am a bad boy";
        }else {
            return  "I am a god boy";
        }
    }

    public String noise(){
       return "Woof";
    }
    @Override
    public String toString() {
        return super.toString() +  "### " + checkIfIsAGoodBoy()  + " And the noise that it makes is " + noise();
    }
}
