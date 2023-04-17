public class Eevee {
    private String name;
    private Integer hitpoint;
    private Integer attack;
    private Integer block;
    private Integer contact;
    private Integer defense;
    private Integer speed;

    public Eevee(String name, Integer hitpoint, Integer attack, Integer block, Integer contact, Integer defense, Integer speed) {
        this.name = name;
        this.hitpoint = hitpoint;
        this.attack = attack;
        this.block = block;
        this.contact = contact;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public Integer getHitpoint() {
        return hitpoint;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getBlock() {
        return block;
    }

    public Integer getContact() {
        return contact;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpeed() {
        return speed;
    }
}
