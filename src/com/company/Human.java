package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car car;

    Human() {
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("dane wysłane do systemu księgowego");
            System.out.println("odbierz aneks od pani Hani");
            System.out.println("ZUS I US JUŻ WIEDZA O PIENIĄDZACH");
            this.salary = salary;
            System.out.println("nowe wynagrodzenie: " + this.salary);
        } else {
            System.out.println("chyba cię Bóg opuścił za darmo robić nie będę na janusza złodzieja!");
        }
    }

    Double getSalary() {
        System.out.println(new Date());
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }

    void setCar(Car newCar) {
        if (this.salary > newCar.value) {
            this.car = newCar;
            System.out.println("gratulacje, kupiłeś za gotówę");
        } else if (this.salary > newCar.value / 12) {
            this.car = newCar;
            System.out.println("kupiłeś na raty");
        } else {
            System.out.println("nie ma takiego kupowania!");
            System.out.println("do roboty");
            System.out.println("zmień pracę, weź kredyt...");
        }
    }

    Car getCar() {
        return this.car;
    }
}
