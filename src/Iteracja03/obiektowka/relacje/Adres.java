package Iteracja03.obiektowka.relacje;

public class Adres {

    private String ulica, kodPocztowy, miasto;

    public Adres(String ulica, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
