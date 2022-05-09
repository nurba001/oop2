package com.company;

public class Main {

    public static void main(String[] args) {
    Fish fish=new Fish();
    Parrot parrot=new Parrot();
    Cat cat=new Cat();
    Dog dog=new Dog();
    fish.setNameFish("Karas");
    System.out.println(fish.getNameFish());
    fish.setSwim1("Okeanda jashait");
    System.out.println(fish.getSwim1());
    fish.setSwim("Suuda suzot");
    System.out.println(fish.getSwim()+'\n');

    parrot.setNameParrot("Fred");
    System.out.println(parrot.getNameParrot());
    parrot.setAgeParrot(1);
    System.out.println("jashy "+parrot.getAgeParrot());
    parrot.setColorPattor("zvet:Goluboi");
    System.out.println(parrot.getColorPattor()+'\n');

    cat.setNameCat("Tom");
    System.out.println(cat.getNameCat());
    cat.setAge(2);
    System.out.println("jashy "+cat.getAge());
    cat.setMi_mi("MIa MIa");
    System.out.println(cat.getMi_mi()+'\n');

    dog.setNameDog("Garfild");
    System.out.println(dog.getNameDog());
    dog.setAgeDog(4);
    System.out.println("jash"+dog.getAgeDog());
    dog.setGaf("gaf gaf");
    System.out.println(dog.getGaf());

    }
}
