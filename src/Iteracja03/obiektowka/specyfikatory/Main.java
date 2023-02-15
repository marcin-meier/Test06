package Iteracja03.obiektowka.specyfikatory;

public class Main {
    public static void main(String[] args) {
        /*
        public - dostęp do danej klasy lub składowej klasy (pola, metody, konstruktory) może mieć każdy, nawet jeśli jest w innym pakiecie.

        private - mozna go wykorzystac tylko do skladowych klas (pola, metody, konstruktory). Dostep do danej rzeczy jest tylko w ramach tej samej klasy.

        protected - dostep do danej SKLADOWEJ może być tylko w tym samym pakiecie (protected mozemy uzywac tylko do skladowych, czyli do pól, metod i konstruktorów)
        default
         */

        Car car = new Car("model", "m,arka", "kloldsada");
        System.out.println(car.getKolor());
        car.setKolor("czarny");
        System.out.println(car.getKolor());
        System.out.println(car);
    }
}
