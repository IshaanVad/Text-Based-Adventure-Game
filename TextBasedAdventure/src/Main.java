import stats.Display;
import stats.PlayerStats;

public class Main {

    public static void main(String[] args) {

        
        PlayerStats.createStats();
        Display.displayAllStats(PlayerStats.health, "HP", PlayerStats.defense, "DF", PlayerStats.speed, "SP");

        room1.Selection.selection();
        room2.Selection.selection();


    }
    
}