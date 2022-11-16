public class Boss {
        private int health;
        private int damage;
        private String bossAttackType;

        public int getDamage() {
            return damage;
        }
        public void setDamage(int damage) {
            this.damage = damage;
        }

        public String getBossAttackType() {
            return bossAttackType;
        }
        public void setBossAttackType(String bossAttackType){
            this.bossAttackType = bossAttackType;
        }

        public int getHealth() {
            return health;
        }
        public void setHealth(int health){
            this.health = health;
        }

    }
