public class Weapon {
    private final String name;
    private final int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " deals " + this.damage + " damages";
    }
}
