package lotr;//class Character{
//  - attributes: int power, in hp
//          - methods: void kick(Character c), boolean isAlive()}

import lombok.AllArgsConstructor;
import lombok.Getter;
import static java.lang.Math.max;

@AllArgsConstructor
public
class Character{
    @Getter
    int hp;
    @Getter
    int power;


    public void setHp(int hp){
        this.hp = max(0, hp);
    }

    public boolean isAlive(){return this.hp > 0;}
    public void kick(Character c){
        c.setHp(c.getHp()-this.power);
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

//class CharacterFactory
//   - methods: Character createCharacter() {
//           returns random instance of any existing character
//           }
//class GameManager
//   - methods: void fight(Character c1, Character c2) {
//           to provide fight between to characters and explain via command
//           line what happens during fight, till both of
//           the characters are alive
//           }