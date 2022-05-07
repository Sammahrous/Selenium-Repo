package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
    @Test
    public void useSelenium() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.com/");
    }

    //----------------------------------------------------------------------------//

    static int factorial(int input) {
        if (input == 0)
            return 1;

        int i = input;
        int value = 1;

        while (input / i != input) {
            value = value * i;
            i--;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println("\nPlease input a number that is not less than 1.");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int number = Integer.valueOf(input);
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    //----------------------------------------------------------------------------//

    public static void main2(String[] args) {

        String[] array1 = {"happY", "king", "peace", "living standard"};
        String[] array2 = {"king kong", "Happy", "PEACE"};

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array2.length; k++) {
                if (array1[i].equalsIgnoreCase(array2[k]))
                    set.add(array1[i]);
            }

        }
        System.out.println("The Common Word(s): " + set);

        //----------------------------------------------------------------------------//

        int[] inputNumbers = {3, 5, 1, 4, 2, 7};
        Arrays.sort(inputNumbers);

        for (int i = 1; i < inputNumbers.length; i++)
        {
            if (abc(inputNumbers[i]) < inputNumbers.length + 1 && inputNumbers[abc(inputNumbers[i]) - 1] > 0)
            {
                inputNumbers[abc(inputNumbers[i]) - 1] = -inputNumbers[abc(inputNumbers[i]) - 1];
            }

        }
        for (int u = 0; u < inputNumbers.length; u++) {
            if (inputNumbers[u] > 0) {
                System.out.println(u + 1);
            }
        }

    }
}