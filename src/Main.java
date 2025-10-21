import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Quanti giri vuoi fare? ");
        int count = scanner.nextInt();

        ArrayList<CorsaCavalli> cavalli = new ArrayList<CorsaCavalli>();

        do {
            System.out.println("Inserisci la lentezza del cavallo:");
            int lentezza = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il nome del cavallo: ");
            String name = scanner.nextLine();

            CorsaCavalli thr = new CorsaCavalli(count, name, lentezza);
            cavalli.add(thr);

            System.out.println("Vuoi aggiungere un nuovo cavallo?(1)");

        } while (scanner.nextInt()==1);

        for(CorsaCavalli cavallo : cavalli) {
            cavallo.start();
        }


    }
}