import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

    int key;

    Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1 og 3");
    key = scan.nextInt();

    switch (key){
        case 1:
            System.out.println("Du skrev 1");
            break;
        case 2:
            System.out.println("Du skrev 2");
            break;
        case 3:
            System.out.println("du skrev 3");
            break;
        default:
            System.out.println("Du skrev ikke 1, 2 eller 3");
            break;
    }

}}
