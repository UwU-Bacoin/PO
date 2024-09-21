package com.jaggernaute.entity.npc;

public enum Job {
    FISHERMAN("Fisherman"), LIBRARIAN("Librarian"), BLACKSMITH("Blacksmith");

    private final String name;

    private Job(String str) {
        this.name = str;
    }

    public String getJobName() {
        return this.name;
    }
}
