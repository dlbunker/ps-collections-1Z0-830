package com.pluralsight.collections;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Sort by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
