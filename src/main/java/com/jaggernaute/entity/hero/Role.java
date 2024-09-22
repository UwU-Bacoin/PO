package com.jaggernaute.entity.hero;

public enum Role {
    HEALER("Healer"), WARLOCK("Warlock"), TANK("Tank");

    private final String name;

    private Role(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}