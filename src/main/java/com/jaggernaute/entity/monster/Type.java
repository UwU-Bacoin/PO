package com.jaggernaute.entity.monster;

import com.jaggernaute.entity.EntityType;

public enum Type implements EntityType {
    ZOMBIE("Zombie"), SKELETON("Skeleton"), SLIME("Slime");

    private final String name;

    private Type(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
