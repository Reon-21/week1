package com.example.myapplication;

public class Animal {
    public static void main(String[] args) {
        Dog doggy1 = new Dog("Shiba Inu",2,3.5,"Bailey");
        System.out.println(doggy1.name);
        Dog doggy2 = new Dog("Golden Retriever",2,3.5,"Dallas");
        System.out.println(doggy2.name);

    }
}
