package HW;

import java.util.Scanner;

public class Convert_Celsius_to_Fahrenheit {
    public static void main(String[] ads){

        System.out.println("Enter in degree in Celsius: ");
        int celsius;
        Scanner scanner = new Scanner(System.in);
        celsius = scanner.nextInt();
        scanner.close();

        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius+" Celsius is "+fahrenheit+" Fahrenheit");
    }
}
