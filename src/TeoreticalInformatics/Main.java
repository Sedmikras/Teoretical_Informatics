package TeoreticalInformatics;

import java.util.Scanner;

interface State {
    State next(Character in);

    String toString();
}

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static State s;

    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.out.print("### Vytvořil David Bohmann & Přemysl Kouba jako semestrální práci pro předmět Teoretická Informatika na ZČU v akademickém roce 2016/17 ###\n"
                + "                ### Pro nápovědu spusťte s argumentem h, nebo napište h či help do konzole a potvrďte klávesou ENTER###\n\n");
        if (args.length != 0 && args[0].charAt(0) == 'h') {
            showHelp();
        }
        State s = States.Init;
        String word;
        System.out.println(s.toString());
        while (true) {
            word = sc.nextLine().toLowerCase();
            if (word.isEmpty() || word.charAt(0) == Utilities.BLANK) {
                s = s.next(Utilities.BLANK);
                showState(s);
                continue;
            } else if (word.charAt(0) == 'h') {
                System.out.println(showHelp());
                continue;
            } else if (word.charAt(0) == Utilities.BUTTON_0 || word.charAt(0) == Utilities.BUTTON_1 || word.charAt(0) == Utilities.BUTTON_2) {
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

    private static String showHelp() {
        System.out.println("Tématem semestrální práce je řízení složité silniční křižovatky. Programem je zpracována křižovatka U Prazdroje - Lobezská - Šumavská v Plzni\n"
                + "Program se ovládá klávesnicí zkrz konzoli. "
                + "Každou volbu potvrďte stisknutím klávesy ENTER.\n"
                + "Dalším argumentem může být mapování tlačítek na určitá písmena na klávesnici. K tomu je potřeba zadat tři znaky klávesnice\n"
                + "Ze základu jsou klávesové zkratky tyto :(nejsou case-sensitive)\n"
                + "q(Q).... ukončí program\n"
                + "h(H).... vypíše nápovědu\n"
                + "a(A).... tlačítko 1 (přepsat v souboru Utilities.java)\n"
                + "b(B).... tlačítko 2 (lze přepsat v souboru Utilities.java)\n"
                + "c(C).... tlačítko 3 (lze přepsat v souboru Utilities.java)\n"
                + " (mezerník).... pokud chceme pokročit o stav dále, stiskneme klávesu ENTER. Tato zkratka nahrazuje časovač a jeho obsluhu\n");

        System.out.println("Pro pokračování stiskněte klávesu ENTER, pro ukončení zadejte Q(q) a potvrďte klávesou ENTER");
        String pom = sc.nextLine().toLowerCase();
        if (!pom.isEmpty() && pom.charAt(0) == 'q')
            System.exit(0);

        System.out.println("Formát výstupu je následující :\n"
                + "Stav : L1 | L2 | L3 | L4 | L5 | L6 | L7 | L8 | L9   --- doba trvání stavu"
                + "Stav... Stav ve kterém se automat v dané chvíli nachází\n"
                + "L1... Semafor číslo 1\n"
                + "L2... Semafor číslo 2\n"
                + "L3... Semafor číslo 3\n"
                + "L4... Semafor číslo 4\n"
                + "L5... Semafor číslo 5\n"
                + "L6... Semafor číslo 6\n"
                + "L7... Semafor číslo 7\n"
                + "L8... Semafor číslo 8\n"
                + "L9... Semafor číslo 9\n"
                + "--- doba trvání stavu... Doba po kterou by měla při zapojení na časovač daná konfigurace semaforů svítit\n"
                + "####                    ###\n"
                + "Stav : L1 | L2 | L3 | L4 | L5 | L6 | L7 | L8 | L9   --- doba trvání stavu");


        s = States.Init;

        System.out.println("Automat se vrátil do počátečního stavu S0");
        System.out.println("Pro pokračování stiskněte klávesu ENTER, pro ukončení zadejte Q(q) a potvrďte klávesou ENTER");
        pom = sc.nextLine().toLowerCase();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (!pom.isEmpty() && pom.charAt(0) == 'q')
            System.exit(0);
        return s.toString();
    }
}
