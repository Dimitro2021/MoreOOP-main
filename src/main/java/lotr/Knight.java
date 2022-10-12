package lotr;

public class Knight extends Character {
    public Knight() {
        super((int)(2+ Math.random()*11), (int)(2+ Math.random()*11));
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - (int)(Math.random()*(this.getPower())));
    }
}
