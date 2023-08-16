package stats;

import gameover.gg;

import java.util.ArrayList;
import java.util.Random;

public class PlayerStats {

    public static int health;
    public static int defense;
    public static int speed;
    public static ArrayList<Integer> userStats = new ArrayList<>();

    public static void createStats() {
        Random random = new Random();
        health = random.nextInt(50, 100);
        defense = random.nextInt(0, 50);
        speed = random.nextInt(0, 50);
        userStats.add(health);
        userStats.add(defense);
        userStats.add(speed);
    }

    public static int getHealth() {
        return health;
    }

    public static void damage(int damageAmount, int arrIndex) {
        if (userStats.get(arrIndex) - damageAmount <= 0) {
            gg.gameOver();
        } else {
            userStats.add(arrIndex, userStats.get(arrIndex) - damageAmount);
            userStats.remove(arrIndex+1);
            if (arrIndex == 0) {
                health = userStats.get(arrIndex);
            } else if (arrIndex == 1) {
                defense = userStats.get(arrIndex);
            } else if (arrIndex == 2) {
                speed = userStats.get(arrIndex);
            }
        }
    }

    public static void gain(int amountGained, int arrIndex) {
        if (userStats.get(arrIndex) + amountGained > 100) {
            System.out.println("This section is already 100 or will be over 100");
        } else {
            int newStat = userStats.get(arrIndex) + amountGained;
            userStats.add(arrIndex, newStat);
            userStats.remove(arrIndex+1);
            if (arrIndex == 0) {
                health = userStats.get(arrIndex);
            } else if (arrIndex == 1) {
                defense = userStats.get(arrIndex);
            } else if (arrIndex == 2) {
                speed = userStats.get(arrIndex);
            }
        }
    }
}
