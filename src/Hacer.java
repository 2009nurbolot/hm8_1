public class Hacer extends Hero{
    public Hacer(int health, int damage, String name) {
        super(health, damage, SuperAbility.HACER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int hacer = boss.getHealth()-RPG_Game.random.nextInt(150);
        for (int i = 0; i < heroes.length; i++) {
            i = RPG_Game.random.nextInt(heroes.length);
            heroes[i].setHealth(heroes[i].getHealth()+hacer);
            System.out.println("Hacker take health boss");
            break;
        }
    }
}
