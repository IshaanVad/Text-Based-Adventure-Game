package room1;

import stats.PlayerStats;

public class Door {

    public static void door() {
        System.out.println("You turn the knob...\n" +
                "*The Door Is Opened*\n" +
                "You scratched yourself on some wood while going through (-5 HP)");
        PlayerStats.damage(5, 0);
        stats.Display.displayOneStat(PlayerStats.health, "HP");
    }
}
