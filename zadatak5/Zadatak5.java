package domaci17.zadatak5;
/*
 Napraviti apstraktnu klasu koja ce da predstavlja zivotinju. Zivotinja treba da ima ime, nadimak i abstraktnu metodu koja predstavlja zvuk koji zivotinja pravi.
 Napraviti klase pas i macka koje nasledjuju zivotinju.
 Pas ima dodatni atribut boolean goodBoy i metodu koja ispisuje “I am a good boy” ili “I am a bad boy” u zavisnosti od toga da li je promenljiva goodBoy true ili false.
 Macka ima atribut za tezinu i metodu koja ispisuje “I’m a chonk” ili “I’m not a chonk” u zavisnosti da li je tezina preko 5kg.
 U obe klase implementirati toString, gde u oba slucaja se ispisuje ime i nadimak.
 U klasi macka dodati na toString da ispisuje jos da li je chonk ili nije, a u klasi pas da li je good boy ili ne (u oba slucaja pozivanjem konkretne metode).
 U konkretnim klasama implementirati metodu za zvuk koji zivotinja pravi, za macku da vraca string “meow” a za psa “woof”. I poziv te metode dodati u toString.
 U main metodi napraviti nekoliko macaka i pasa.
 Staviti ih u listu i kroz petlju proci sve elemente, za pse ispisati “dog: “ i dodati od psa toString a ako je macka napisati “cat: “ i isto toString. Za ovo koristite instanceof.

 */

import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {

        Macka macka1 = new Macka();
        macka1.setIme("Garonja");
        macka1.setNadimak("Crni");
        macka1.setTezina(4);

        Pas pas1 = new Pas();
        pas1.setIme("Zuca");
        pas1.setNadimak("Zule");
        pas1.setGoodBoy(false);

        Macka macka2 = new Macka();
        macka2.setIme("Mirko");
        macka2.setNadimak("Miki");
        macka2.setTezina(6);

        Pas pas2 = new Pas();
        pas2.setIme("Rokan");
        pas2.setNadimak("Role");
        pas2.setGoodBoy(true);

        Macka macka3 = new Macka();
        macka3.setIme("Bule");
        macka3.setNadimak("Smirko");
        macka3.setTezina(2);

        Pas pas3 = new Pas();
        pas3.setIme("Dzekson I");
        pas3.setNadimak("Dzki");
        pas3.setGoodBoy(false);

        ArrayList<Zivotinja> list = new ArrayList<>();
        list.add(macka1);
        list.add(pas1);
        list.add(pas2);
        list.add(macka2);
        list.add(macka3);
        list.add(pas3);

        for(int i = 0; i<list.size(); i++){
            if(list.get(i) instanceof Macka) {
                System.out.println(list.get(i).toString());
            } else {
                System.out.println(list.get(i).toString());
            }
        }

    }
}
