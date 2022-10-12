import lotr.*;
import lotr.Character;

public class CharacterFactory {
    public Character createCharacter(){
        int num = (int)(Math.random()*5);
        if (num == 0) {return new Hobbit();}
        if (num == 1) {return new King();}
        if (num == 3) {return new Knight();}
        else {return new Elf();}
    }
}
