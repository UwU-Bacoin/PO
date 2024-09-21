package com.jaggernaute.entity.npc;

import com.jaggernaute.display.StatusLineBuilder;
import com.jaggernaute.entity.Entity;
import com.jaggernaute.entity.monster.Type;

public class NPC extends Entity {
    private final Job job;

    public NPC(String name, int maxHealth, Job job, int attack, int defense) {
        super(name, maxHealth, attack, defense);
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StatusLineBuilder lb = new StatusLineBuilder();
        builder.append(lb.lineBuilder("Nom: ", this.getName()))
                .append(lb.lineBuilder("Role : ", this.getJob().getJobName()))
                .append(this.isDead() ? "MORT\n" : "PV : " + this.getCurrentHealth() + " / " + this.getMaxHealth() + "\n")
                .append(lb.lineBuilder("ATK : ", String.valueOf(this.getAttack())))
                .append(lb.lineBuilder("DEF : ", String.valueOf(this.getDefense())));

        return builder.toString();
    }
}
