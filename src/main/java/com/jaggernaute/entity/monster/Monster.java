package com.jaggernaute.entity.monster;

import com.jaggernaute.display.StatusLineBuilder;
import com.jaggernaute.entity.Entity;

public class Monster extends Entity {
    private final Type type;

    public Monster(String name, int maxHealth, Type type, int attack, int defense) {
        super(name, maxHealth, attack, defense);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StatusLineBuilder lb = new StatusLineBuilder();
        builder.append(lb.lineBuilder("Nom: ", this.getName()))
                .append(lb.lineBuilder("Role : ", this.getType().getName()))
                .append(this.isDead() ? "MORT\n" : "PV : " + this.getCurrentHealth() + " / " + this.getMaxHealth() + "\n")
                .append(lb.lineBuilder("ATK : ", String.valueOf(this.getAttack())))
                .append(lb.lineBuilder("DEF : ", String.valueOf(this.getDefense())));

        return builder.toString();
    }
}
