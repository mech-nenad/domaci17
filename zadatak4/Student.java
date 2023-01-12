package domaci17.zadatak4;
/*
 Napraviti klasu koja predstavlja studenta. Student za atribute ima broj indeksa i prosecnu ocenu.
 Napraviti metodu koja ce da vrati koji student ima bolju ocenu (kao ona compare metoda sa predavanja).
    Metoda vraca boljeg studenta, a za parametar prima studenta.
 U klasi koja ima i main metodu napisati dodatnu staticku metodu koja vraca najboljeg studenta od liste studenata.
    Prihvata kao parametar ArrayList<Student> a vraca <Student>.
 Opciono: napraviti jednu staticku metodu koja ce da sortira studente po prosecnoj oceni (opadajuce)
    A onda u mainu da ispisete da su prva 3 studenta na budzetu (jer su najbolji) a ostali da su samofinansirajuci.

 */

import java.util.ArrayList;

public class Student {

    private String brojIndeksa;
    private double prosekOcene;


    public Student() {

    }

    public Student(String brojIndeksa, double prosekOcene) {
        this.brojIndeksa = brojIndeksa;
        this.prosekOcene = prosekOcene;
    }


    public String getBrojIndeksa() {
        return brojIndeksa;

    }

    public double getProsekOcene() {
        return prosekOcene;
    }

    public void setProsekOcene(double prosekOcene) {
        this.prosekOcene = prosekOcene;
    }


}
