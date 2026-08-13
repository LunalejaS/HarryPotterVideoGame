package Characters;

import SpellBehavior.WingardiumLeviosa;

public class HermioneGranger extends Character {
    public HermioneGranger() {
        setSpell(new WingardiumLeviosa());
    }

    @Override
    public void display() {
        System.out.println("Character: Hermione Granger.");
    }
}