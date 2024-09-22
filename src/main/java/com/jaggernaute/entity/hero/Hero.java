package com.jaggernaute.entity.hero;

import com.jaggernaute.display.StatusLineBuilder;
import com.jaggernaute.entity.Entity;

public class Hero extends Entity {
    private final Role role;

    public Hero(String name, int maxHealth, Role role, int attack, int defense) {
        super(name, maxHealth, attack, defense);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StatusLineBuilder lb = new StatusLineBuilder();
        builder.append(lb.lineBuilder("Nom: ", this.getName()))
                .append(lb.lineBuilder("Role : ", this.getRole().getName()))
                .append(this.isDead() ? "MORT\n" : "PV : " + this.getCurrentHealth() + " / " + this.getMaxHealth() + "\n")
                .append(lb.lineBuilder("ATK : ", String.valueOf(this.getAttack())))
                .append(lb.lineBuilder("DEF : ", String.valueOf(this.getDefense())));

        return builder.toString();
    }
}
