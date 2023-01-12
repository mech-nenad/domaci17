package domaci17.zadatak1;
/*
Napraviti klasu Konverter koja kao atribute ime ima rsd i valutu.
Valuta je enum, dok je rsd celi broj. Valuta treba da bude jedna od: EUR, USD, AUD, CAD, RUB i GBP.
Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
 */

public class Konverter {

    private double rsd;
    private Valuta valuta;

    public Konverter() {

    }

    public Konverter(double rsd, Valuta valuta) {
        this.rsd = rsd;
        this.valuta = valuta;

    }

    public void setRsd(double rsd) {
        this.rsd = rsd;
    }


    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }



    public double convert(int rsd, Valuta valuta) {
        double result = 0;
        if (rsd > 0 && (valuta == Valuta.EUR || valuta == Valuta.GBP
                || valuta == Valuta.CAD || valuta == Valuta.AUD || valuta == Valuta.USD || valuta == Valuta.RUB)) {
            if (valuta == Valuta.EUR) {
                result = rsd / 117.3;
            } else if (valuta == Valuta.AUD) {
                result = rsd / 74.61;
            } else if (valuta == Valuta.CAD) {
                result = rsd / 81.3;
            } else if (valuta == Valuta.GBP) {
                result = rsd / 132.7;
            } else if (valuta == Valuta.USD) {
                result = rsd / 110.2;
            } else {
                result = rsd / 1.5;
            }
        } else {
            System.out.println("Nevalidan unos");
        }
        return result;


    }

    @Override
    public String toString() {
        return "Konverter{" +
                "rsd=" + rsd +
                ", valuta=" + valuta +
                '}';
    }
}