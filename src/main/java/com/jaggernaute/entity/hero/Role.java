package com.jaggernaute.entity.hero;

import com.jaggernaute.entity.EntityType;

public enum Role implements EntityType {
    HEALER("Healer"), WARLOCK("Warlock"), TANK("Tank");

    private final String name;

    private Role(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}