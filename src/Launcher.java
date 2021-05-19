import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Coucou les loulous");
        Scanner scan = new Scanner(System.in);
        String utilisateur = scan.nextLine();
        while (!"quit".equals(utilisateur)) {
            switch (utilisateur)
            {
                case"fibo": {


                        System.out.println("Donnez moi un chiffre");//printing 0 and 1
                        String entre = scan.nextLine();
                        int nombre = parseInt(entre);

                        int n1=0,n2=1,n3=0,i;
                        for(i=2;i<=nombre;++i)//loop starts from 2 because 0 and 1 are already printed
                        {
                            n3=n1+n2;
                            n1=n2;
                            n2=n3;
                        }
                        System.out.println(n3);
                    }
            }

            System.out.println("Unknow command");
            utilisateur = scan.nextLine();
        }
    }
}

