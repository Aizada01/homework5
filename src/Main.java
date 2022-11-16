public class Main {
    public static void main(String[] args) {
                Boss Tanos = new Boss();
                Tanos.setHealth(700);
                Tanos.setDamage(50);
                Tanos.setBossAttackType("Magic");
                System.out.println("Boss health: " + Tanos.getHealth() + " " + "Boss damage: " + Tanos.getDamage() + " " + "bossAttackType: " + Tanos.getBossAttackType());
            }
    }
