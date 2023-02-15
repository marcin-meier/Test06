package Iteracja03.obiektowka.specyfikatory;

public class Car {
    private String model;
    private String marka;
    private String kolor;
    private int rok;

    //ALT+INSERT
    public Car(String model, String marka, String kolor) {
        this.model = model;
        this.marka = marka;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rok=" + rok +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setRok(int rok) {
        if (rok < 0) {
            System.out.println("rok nie moze byc ujemny!");
        } else {
            this.rok = rok;
        }
    }

    public void setKolor(String kolor) {
        if (!kolor.equals("czerwony") && !kolor.equals("czarny")) {
            System.out.println("Nie mozesz zmienic koloru na taki!");
        } else {
            this.kolor = kolor;
        }
    }
}
