package lotr;
import static java.lang.Math.random;

public class Noble extends Character{
    public Noble(int hp_power) {
        super ((int)(hp_power+ random()*11), (int)(hp_power+ random()*11));
    }
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - (int)(random()*(this.getPower())));
    }
}
