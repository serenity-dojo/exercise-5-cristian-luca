package com.serenitydojo;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    Now add an abstract method called play() to the Pet class,
//    which will return "plays with string", "plays with bone" and "runs in wheel"
//            for cats, dogs and hamsters respectively
//
    public abstract String play();

}
