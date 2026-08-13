package Characters;

import SpellBehavior.Expelliarmus;

public class RonWeasley extends Character {
    public RonWeasley() {
        setSpell(new Expelliarmus());
    }

    @Override
    public void display() {
        System.out.println("Character: Ron Weasley.");
    }
 
}