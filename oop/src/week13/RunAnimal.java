package week13;

import java.util.Scanner;

public class RunAnimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animal a = null;

        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("B")) {
            a = new Bird();
        } else if (input.equalsIgnoreCase("C")) {
            a = new Cat();

        } else if (input.equalsIgnoreCase("D")) {
            a = new Dog();

        } else if (a==null) {
            System.out.println("Invalid Input.");

        }
        a.eat();
        a.sleep();
        a.makeSound();
    }
}
