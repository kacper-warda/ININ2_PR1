package com.company;

public class Main {

    public static void main(String[] args) {
        Integer x = 3;
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        dog.weight = 12.3;
        dog.age = 4;

        System.out.println(dog.name);

        cat.name = "Sierściuch";
        System.out.println("a kot żyje? " + cat.alive);
        System.out.println("waga kota: " + cat.weight);
        cat.introduceYourself();
        dog.introduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be "
                + humanAge + " years old");

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";

        me.pet = new Animal("felis");
        me.pet.name = "Mruczek";

        System.out.println(me.pet.name);

        me.pet = new Animal("canis");
        me.pet.name = "Morderca";

        System.out.println(me.pet.name);

        Car fiat = new Car();
        fiat.value = 120000.0;
        fiat.model = "bravo";

        me.setSalary(2000.0);
        me.setCar(fiat);
        if (me.getCar() != null) {
            System.out.println(me.getCar().model);
        } else {
            System.out.println("sorry, nie masz auta");
        }

        try {
            System.out.println(me.getCar().model);
        } catch (Exception e) {
            System.out.println("sorry, ale nie masz samochodu");
        }
    }
}
