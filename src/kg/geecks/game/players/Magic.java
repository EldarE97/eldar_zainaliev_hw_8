package kg.geecks.game.players;

public class Magic extends Hero {
    private int additionalAttack = 20;
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
          for (int i = 0; i < heroes.length; i++) {
              if(heroes[i].getHealth() > 0 && heroes[i] != this) {
                  heroes[i].setDamage(heroes[i].getDamage() + this.additionalAttack);
              }
          } System.out.println("Www");
    }
}
