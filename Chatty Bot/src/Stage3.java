import java.util.Scanner;

public class Stage3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int three = scanner.nextInt();
        int five = scanner.nextInt();
        int seven = scanner.nextInt();
        int age = ((three * 70) +(five*21) + (+seven*15)) -105;
        System.out.println("Your age is "+ age +"; that's a good time to start programming!");
    }
}
