package Characters;

import SpellBehavior.WingrdiumLeviosa;

public class HermioneGranger extends Character {
    public HermioneGranger() {
        setSpell(new WingrdiumLeviosa());
    }

    @Override
    public void display() {
        System.out.println("Character: Hermione Granger.");
    }
}