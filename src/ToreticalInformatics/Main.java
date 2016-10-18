package ToreticalInformatics;

import java.util.Scanner;


interface State {
    State next(Character in);
    String jmeno = "";
    String cas = "";
    String sviti = "";
    
}

public class Main {
    public static void main(String[] args) {
        if (args.length != 0 && args[0].charAt(0) == 'h') {
            System.out.print("Vypíšu ti jak s timhle zacházet");
            System.exit(0);
        }
        State s = States.Init;
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Spoustim krizovatku ve stavu S0:");
        while (true) {
            System.out.println(s.toString());
            word = sc.nextLine();
            if (word.isEmpty()) {
                s = s.next(' ');
                continue;
            }
            if (word.charAt(0) == 'q') {
                break;
            }
            if (word.charAt(0) == 'h') {
                System.out.println("vypíšu ti jak s timhletim zacházet");
            } else {
                s = s.next(word.charAt(0));
            }
        }
        sc.close();
        System.exit(0);
    }
}