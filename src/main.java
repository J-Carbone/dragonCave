import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you, \nyou see two caves. In one cave, the dragon is friendly \nand will share his treasure with you. The other dragon \nis greedy and hungry and will eat you on sight. \nWhich cave will you go into? (1 or 2)");
        Scanner s = new Scanner(System.in);
        Integer i = s.nextInt();
        if (i == 1)
            System.out.println("You approach the cave... \nIt is dark and spooky... \nA large dragon jumps out in front of you! He opens his jaws and... \nGobbles you down in one bite!");
        else if (i == 2)
            System.out.println("You approach the cave... \nIt is dark and spooky... \nA large dragon jumps out in front of you! He opens his jaws and... \nSays hello and hands you some treasure");
    }
}
