package stats;

public class Display {

    public static void displayOneStat(int stat, String statName) {
        System.out.printf("Current Stat: %d %s\n", stat, statName);
    }
    public static void displayTwoStats(int stat1, String stat1Name, int stat2, String stat2Name) {
        System.out.printf("Current Stats: %d %s | %d %s\n", stat1, stat1Name, stat2, stat2Name);
    }
    public static void displayAllStats(int stat1, String stat1Name, int stat2, String stat2Name, int stat3, String stat3Name) {
        System.out.printf("Current Stats: %d %s | %d %s | %d %s\n", stat1, stat1Name, stat2, stat2Name, stat3, stat3Name);
    }
}
