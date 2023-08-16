package stats;

import gameover.gg;

import java.util.ArrayList;

public class EnemyStats implements ActionsAgainstStats{

    int health;
    int defense;
    int speed;
    ArrayList<Integer> enemyStats = new ArrayList<>();

    public EnemyStats(int health, int defense, int speed) {
        this.health = health;
        this.defense = defense;
        this.speed = speed;
        enemyStats.add(health);
        enemyStats.add(defense);
        enemyStats.add(speed);
    }

    public int getHealth() {
        return health;
    }
    public int getDefense() {
        return defense;
    }
    public int getSpeed() {
        return speed;
    }

    @Override
    public void damage(int damageAmount, int arrIndex) {
        if (enemyStats.get(arrIndex) - damageAmount <= 0) {
            gg.gameOver();
        } else {
            int newStat = enemyStats.get(arrIndex) - damageAmount;
            enemyStats.add(arrIndex, newStat);
            enemyStats.remove(arrIndex+1);
        }
    }

    @Override
    public void gain(int amountGained, int arrIndex) {
        if (enemyStats.get(arrIndex) + amountGained > 100) {
            System.out.println("This section is already 100 or will be over 100");
        } else {
            int newStat = enemyStats.get(arrIndex) + amountGained;
            enemyStats.add(arrIndex, newStat);
            enemyStats.remove(arrIndex+1);
        }
    }
}
