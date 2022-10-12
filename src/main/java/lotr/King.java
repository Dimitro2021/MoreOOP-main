package lotr;

import static java.lang.Math.random;

public class King extends Character {
    public King() {super ((int)(5+ random()*10), (int)(5+ random()*11)); }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - (int)(random()*(this.getPower())));
    }
}
