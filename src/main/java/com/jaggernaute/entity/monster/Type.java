package com.jaggernaute.entity.monster;

public enum Type {
    ZOMBIE("Zombie"), SKELETON("Skeleton"), SLIME("Slime");

    private final String name;

    private Type(String str) {
        this.name = str;
    }

    public String getTypeName() {
        return this.name;
    }
}
