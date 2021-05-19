import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Coucou les loulous");
        Scanner scan = new Scanner(System.in);
        String utilisateur = scan.nextLine();
        while (!"quit".equals(utilisateur)) {
            System.out.println("Unknow command");
            utilisateur = scan.nextLine();
        }
    }
}

