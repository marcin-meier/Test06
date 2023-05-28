package test06.zad1;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Person implements Comparable<Person> {

    private String name, surname;
    private int age;

    private static final List<String> surnames = List.of("Witaszek", "Krzypczak", "Darek", "Czarnek");
    private static final List<String> names = List.of("Andrzej", "Wiesiu", "Michal", "Krzysztof");
    private static final List<Integer> ages = List.of(19, 30, 50, 60);
    private static final Random random = new Random();

    public Person() {
        this.name = names.get(random.nextInt(names.size()));
        this.surname = surnames.get(random.nextInt(surnames.size()));
        this.age = ages.get(random.nextInt(ages.size()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int result = Integer.compare(this.age, o.age);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
            if (result == 0) {
                return this.name.compareTo(o.name);
            }
            return result;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person osoba = (Person) o;
        return age == osoba.age && Objects.equals(name, osoba.name) && Objects.equals(surname, osoba.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

