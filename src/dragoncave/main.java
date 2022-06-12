package dragoncave;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("""
                You are in a land full of dragons. In front of you,\s
                you see two caves. In one cave, the dragon is friendly\s
                and will share his treasure with you. The other dragon\s
                is greedy and hungry and will eat you on sight.\s
                Which cave will you go into? (1 or 2)""");
        Scanner s = new Scanner(System.in);
        int choice = 0;
        while (choice == 0) {
            boolean notNum = false;
            try {
                String i = s.next();
                choice = Integer.parseInt(i);
            } catch (NumberFormatException e){
                notNum = true;
                System.out.println("That is not a number!");
            }
            if (choice != 1 && choice != 2 && !notNum) {
                choice = 0;
                System.out.println("That is not a choice!");
            }
        }
        if (choice == 1)
            System.out.println("""
                    You approach the cave...\s
                    It is dark and spooky...\s
                    A large dragon jumps out in front of you! He opens his jaws and...\s
                    Gobbles you down in one bite!""");
        else if (choice == 2)
            System.out.println("""
                    You approach the cave...\s
                    It is dark and spooky...\s
                    A large dragon jumps out in front of you! He opens his jaws and...\s
                    Says hello and hands you some treasure""");
    }
}
