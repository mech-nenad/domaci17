package domaci17.zadatak1;
/*
Zasnovano na zadatku iz 13. domaceg (15.12.2022) - Napraviti klasu Konverter koja kao atribute ime ima rsd i valutu.
Valuta je enum, dok je rsd celi broj. Valuta treba da bude jedna od: EUR, USD, AUD, CAD, RUB i GBP.
Kroz konstruktor se unose vrednosti za dinare (rsd) i valutu, i postoje seteri, ali ne postoje geteri.
Postoji metoda koja sluzi za konvertovanje valute u onu koja je prosledjena kroz konstruktor ili seter.
Znaci rsd pretvara u tu neku valutu. Za to koristiti if za poredjenje. Pogledati kako se porede enum-i u javi najpravilnije.
U mainu testirati tako sto napravite jedan objekat tipa Konverter i isprobate za sve valute.

 */

public class Zadatak1 {
    public static void main(String[] args) {


        Konverter konverter = new Konverter();

        System.out.println(konverter.convert(11730, Valuta.EUR));

        System.out.println(konverter.convert(11730, Valuta.USD));

        System.out.println(konverter.convert(11730, Valuta.AUD));

        System.out.println(konverter.convert(11730, Valuta.CAD));

        System.out.println(konverter.convert(11730, Valuta.RUB));

        System.out.println(konverter.convert(11730, Valuta.GBP));

    }
}
