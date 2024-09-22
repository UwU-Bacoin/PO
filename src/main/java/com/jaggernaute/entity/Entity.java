package com.jaggernaute.entity;

public class Entity {
    protected final String name;
    public String getName() {
        return name;
    }

    protected final int maxHealth;
    public int getMaxHealth() {
        return maxHealth;
    }

    protected int currentHealth;
    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    protected int attack;
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    protected int defense;
    protected void setDefense(int defense) {
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }

    public Entity(String name, int maxHealth, int attack, int defense) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
    }

    public boolean isDead() {
        return this.currentHealth <= 0;
    }

    public void takeDamage(int damages) {
        if (damages < this.getCurrentHealth())
            return;
        if (damages - this.getDefense() >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
            return;
        }
        this.setCurrentHealth(this.getCurrentHealth() - (damages - this.getDefense()));
    }

    public void dealDamage(Entity target) {
        target.takeDamage(this.getAttack());
    }
}
