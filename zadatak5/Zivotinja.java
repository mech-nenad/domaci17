package domaci17.zadatak5;

public abstract class Zivotinja {
    private String ime;
    private String nadimak;


    public Zivotinja() {

    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    public String getNadimak() {
        return nadimak;
    }

    public String getIme() {
        return ime;
    }

    public abstract String noise();

    @Override
    public String toString() {
        return "ime='" + ime + '\'' +
                ", nadimak='" + nadimak + '\'';
    }
}
