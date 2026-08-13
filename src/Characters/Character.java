package Characters;
import SpellBehavior.Spell;

public abstract class Character {
    private Spell spell;
    
    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void performSpell() {
        spell.spell();
    }

    public abstract void display();
}