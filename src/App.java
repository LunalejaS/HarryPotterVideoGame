import SpellBehavior.*;
import Characters.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Review the Behavior of Harry Potter Characters
        HarryPotter harryPotter = new HarryPotter();
        harryPotter.display();
        harryPotter.performSpell();
        System.out.println();

        // Review the Behavior of Hermione Granger Characters
        HermioneGranger hermioneGranger = new HermioneGranger();
        hermioneGranger.display();
        hermioneGranger.performSpell();
        System.out.println();

        // Review the Behavior of Ron Weasley Characters
        RonWeasley ronWeasley = new RonWeasley();
        ronWeasley.display();
        ronWeasley.performSpell();

        // Now, let's change the spell in runtime
        System.out.println("\n> After changes on the spells in runtime:"); 
        hermioneGranger.setSpell(new OculusReparo());
        hermioneGranger.display();
        hermioneGranger.performSpell();
        System.out.println();
        harryPotter.setSpell(new OculusReparo());
        harryPotter.display();
        harryPotter.performSpell();
        System.out.println();
        ronWeasley.setSpell(new ExpectoPatronum());
        ronWeasley.display();
        ronWeasley.performSpell();
        
    }
}