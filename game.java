import java.util.Scanner;
public class game{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String adjective;
        String noun;
        String verb;

        System.out.print("Enter an adjective: ");
        adjective = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanner.nextLine();
        System.out.print("\nThe girl is " + adjective + ".");
        System.out.print("\nToday I saw " + noun + ".");
        System.out.print("\nShe was " + verb + " guitar.");
        scanner.close();
    }
}