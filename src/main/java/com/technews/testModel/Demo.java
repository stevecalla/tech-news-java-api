package com.technews.testModel;

import java.util.Objects;

public class Demo {
    private String name;
    private int age;
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void setAge(int age) {
        System.out.println(age);
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && Objects.equals(name, demo.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

