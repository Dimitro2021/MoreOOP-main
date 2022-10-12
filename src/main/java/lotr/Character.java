package lotr;//class Character{
//  - attributes: int power, in hp
//          - methods: void kick(Character c), boolean isAlive()}

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
import static java.lang.Math.max;

@AllArgsConstructor
public
class Character{
    @Getter @Setter
    int hp;
    @Getter
    int power;


    public void setHp(int hp){
        this.hp = max(0, hp);
    }

    boolean isAlive(){return this.hp > 0;}
    public void kick(Character c){
        System.out.println("aaoaoa");
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

//class Hobbit
//  - attributes: int power=0, int hp=3
//          - methods: void kick(Character c) { toCry() }
//class Elf
//   - attributes: int power=10, int hp=10
//           - methods: void kick(Character c) {
//           kill everybody weaker than him,
//           otherwise decrease the power of character by 1
//           }
//class King
//   - attributes: int power=from 5 to 15, int hp=from 5 to 15
//           - methods: void kick(Character c) {
//           decrease number of hp of the enemy by random
//           number which will be in the range of his power
//           }
//class Knight
//   - attributes: int power=from 2 to 12, int hp=from 2 to 12
//           - methods: void kick(Character c) { like King }
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