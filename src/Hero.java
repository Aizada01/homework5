public class Hero {
    public class Heroes {
        private int health;
        private int damage;
        private String heroesAttackType;

        public Heroes(String heroesAttackType, int damage, int health){
            this.heroesAttackType = heroesAttackType;
            this.health = health;
            this.damage = damage;
        }
        public Heroes(int health, int damage) {
            this.damage = damage;
            this.health = health;
        }
        public int getHealth() {
            return health;
        }
        public  void setHealth(int health) {
            this.health = health;
        }

        public int getDamage() {
            return damage;
        }
        public void setDamage (int damage) {
            this.damage = damage;
        }
        public String getHeroesAttackType(){
            return heroesAttackType;
        }
        public  void setHeroesAttackType (String heroesAttackType) {
            this.heroesAttackType = heroesAttackType;
        }
        public Heroes() {
        }
    }
}
