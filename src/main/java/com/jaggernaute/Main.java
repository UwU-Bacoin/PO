package com.jaggernaute;


import com.jaggernaute.entity.hero.Hero;
import com.jaggernaute.entity.hero.Role;

public class Main {
    public static void main(String[] args) {
        Hero conan = new Hero("Conan", 100, Role.WARLOCK, 10, 5);
        System.out.println(conan.toString());
    }
}