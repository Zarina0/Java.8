package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {

        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boost = RPG_Game.random.nextInt(5)+3;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getDamage() > 0 && this != heroes[i]) {
                heroes[i].setDamage(heroes[i].getDamage() + boost);


            }
        }
        System.out.println("Magic увеличил атаку на:"+  "(" + boost+ ") урона");


    }
}
