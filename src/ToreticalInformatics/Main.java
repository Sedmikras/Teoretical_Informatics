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
            System.out.println(s.toString() + "Zadej dalsi znak:");
            word = sc.nextLine();
            if (word.isEmpty()) {
                s = s.next(' ');
                continue;
            }
            else if (word.charAt(0) == 'h') {
                System.out.println("vypíšu ti jak s timhletim zacházet");
                continue;
            } 
            else if(word.charAt(0) == 'a' || word.charAt(0) == 'b' || word.charAt(0) == 'c') {
                s = s.next(word.charAt(0));
                continue;
            }
            else if (word.charAt(0) == 'q') {
                break;
            }
            else{
            	System.out.println("Spatne zadany znak!");
            	continue;
            }
        }
        sc.close();
        System.exit(0);
    }
}