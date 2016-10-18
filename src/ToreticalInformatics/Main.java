package ToreticalInformatics;

import java.util.Scanner;


interface State {
    State next(Character in);
    String toString();
}

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        if (args.length != 0 && args[0].charAt(0) == 'h') {
            System.out.print("Vypíšu ti jak s timhle zacházet");
            System.exit(0);
        }
        State s = States.Init;
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println(s.toString());
        while (true) {
            word = sc.nextLine();
            if (word.isEmpty()) {
                s = s.next(' ');
                showState(s);
                continue;
            } else if (word.charAt(0) == 'h') {
                showHelp();
                continue;
            } else if (word.charAt(0) == 'a' || word.charAt(0) == 'b' || word.charAt(0) == 'c') {
                s = s.next(word.charAt(0));
                showState(s);
                continue;
            } else if (word.charAt(0) == 'q') {
                break;
            } else {
                System.out.println("Špatně zadaný znak!");
                continue;
            }
        }
        sc.close();
        System.exit(0);
    }

    private static void showState(State s) {
        System.out.println(s.toString());
    }

    private static void showHelp() {
        System.out.println("vypíšu ti jak s timhletim zacházet");
    }
}
