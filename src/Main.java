import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("--------------");

        for (String color: colors) {
            System.out.println(color);
        }

        Player player1 = new Player("Leo", 10);
        Player player2 = new Player("Ronaldo", 7);
        Player player3 = new Player("Mbappe", 15);

        ArrayList<Player> playerArrayList = new ArrayList<>();
        playerArrayList.add(player1);
        playerArrayList.add(player2);
        playerArrayList.add(player3);
        System.out.println(playerArrayList);
    }
}