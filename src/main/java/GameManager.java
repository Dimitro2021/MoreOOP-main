import lotr.Character;

public class GameManager {
    public static void main(String[] args) {
        CharacterFactory cf = new CharacterFactory();
        Character c1 = cf.createCharacter();
        Character c2 = cf.createCharacter();
        fight(c1, c2);
    }

    public static void fight(Character c1, Character c2){
        System.out.println("There are " +c1.getClass().getSimpleName()+ " and " +c2.getClass().getSimpleName()+ " in the circle\n" +
        c1 + "\n" + c2+"\nWhat will happen next\n" +c1.getClass().getSimpleName()+" starts");
        for (int i = 0; i < 6; i++) {
            c1.kick(c2);
            if (!c2.isAlive()){
                System.out.println(c1.getClass().getSimpleName()+ " wins. The game is over");
                break;
            }
            System.out.println(c2.getClass().getSimpleName());
            c2.kick(c1);
            if (!c1.isAlive()){
                System.out.println(c2.getClass().getSimpleName()+ " wins. The game is over");
                break;
            }
            System.out.println("Tie, no-one wins. They continue their problem");
        }
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println("");
    }
}
