package org.dimigo.basic;

import java.time.chrono.JapaneseEra;

public class Person {

    public static void main(String[] args) {
        /* chap 1
        Person p = new Person("Tom");
        Korean k = new Korean("홍길동");
        Japanese j = new Japanese("다나카");
        Chinese c = new Chinese("왕밍");

        System.out.println(p);
        System.out.println(k);
        System.out.println(j);
        System.out.println(c);
        System.out.println();

        p.sayHello();
        k.sayHello();
        j.sayHello();
        c.sayHello();
        System.out.println();

        p.sayBye();
        k.sayBye();
        j.sayBye();
        c.sayBye();
        System.out.println();
        */
        Person[] p = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for (Person person : p) {
            greeting(person);
        }
    }

    private static void greeting(Person p) {
        System.out.println(p);
        p.sayHello();
        p.sayBye();
        System.out.println();
    }

    private String name;

    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayBye() {
        System.out.println("Bye");
    }

    public String toString() {
        return "저는 " + name + "입니다.";
    }
}
