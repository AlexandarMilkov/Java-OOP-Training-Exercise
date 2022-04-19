package hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        int level = Integer.parseInt(scanner.nextLine());



        BladeKnight bladeKnight = new BladeKnight(username,level);

        System.out.printf(bladeKnight.toString());
    }

}
