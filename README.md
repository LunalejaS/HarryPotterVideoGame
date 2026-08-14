# Harry Potter Video Game

> Introduction to Strategy Pattern

## Description

The context of this project is about a small simultion of a videogame based on the Harry Potter saga. The game includes different characters, each with a spell they are skilled at using.

The main goal is to allow characters to have different spell behaviors and change them at runtime without modifying the Character class.

- **Note:** The spell behaviors are represented through the Spell interface and can be changed at runtime.

## UML Diagram
<img width="688" height="662" alt="harrypottervideogame Class diagram" src="https://github.com/user-attachments/assets/e53412b4-460f-4f3a-95e8-41e5278021ed" />


## Project Structure

- Package: `SpellBehavior`
1. *interface* `Spell`
2. class `WingardiumLeviosa`
3. class `OculusReparo`
4. class `Expelliarmus`
5. class `ExpectoPatronum`
- Package: `Characters`
1. abstract class `Character`
2. class `HarryPotter`
3. class `RonWeasley`
4. class `HermioneGranger`
- App

# How to Run

1. Clone or download the repository.
2. Open the project in a Java-compatible IDE such as VS Code, IntelliJ IDEA, or Eclipse.
3. Make sure Java is correctly installed and configured.
4. Run the App class.
5. Check the console output to observe the different characters and their spell behaviors.
6. Learnings


## Strategy Pattern

The Strategy Pattern allows us to define different spell behaviors separately from the main Character class. In this project, spell behaviors are encapsulated in different classes that implement the Spell interface.

This allows each character to use a different spell without modifying the Character class.

### Runtime Behavior Change

One of the main requirements of the exercise is to change a character's spell behavior at runtime.

By default, each character has a specific spell:

HarryPotter uses ExpectoPatronum.
RonWeasley uses Expelliarmus.
HermioneGranger uses WingardiumLeviosa.

During program execution, their spell behaviors can be changed using the setSpell() method.



*Last Modification: 13/08/2026*
> Luna A. Sandoval Rodríguez
