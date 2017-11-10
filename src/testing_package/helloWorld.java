package testing_package;

import javax.swing.*;
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = getName();
        System.out.println(name);

        showMessage(name);

    }// main
    private static void showMessage(String sc) {

        JOptionPane.showMessageDialog(null,
                sc+" : Welcome to GitHub",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);

    }
    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        String sc="";
        try {
            System.out.print("What is your name? : ");
            sc = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println("my name is "+sc);
        return sc;

    }

}// class
