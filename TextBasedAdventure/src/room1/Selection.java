package room1;

import java.util.Scanner;

public class Selection {

    public static void selection() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("You wake up in a room... there's a window and a door... What do you choose to look at first? ");
        do {
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("door")) {
                Door.door();
                //go to room2
                break;
            } else if (userInput.equals("window")) {
                Window.window();
                //goes to Door.door();
                break;
            } else {
                System.out.println("That was an invalid choice. Try again");
                continue;
            }
        } while (true);
    }

}
