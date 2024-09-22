package com.jaggernaute.entity.npc;

import com.jaggernaute.entity.EntityType;

public enum Job implements EntityType {
    FISHERMAN("Fisherman"), LIBRARIAN("Librarian"), BLACKSMITH("Blacksmith");

    private final String name;

    private Job(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
