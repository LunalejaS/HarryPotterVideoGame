package Characters;

import SpellBehavior.ExpectoPatronum;

public class HarryPotter extends Character {
    public HarryPotter() {
        setSpell(new ExpectoPatronum());
    }

    @Override
    public void display() {
        System.out.println("Character: Harry Potter.");
    }
    
}