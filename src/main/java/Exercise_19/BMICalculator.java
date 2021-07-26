package Exercise_19;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        double weight=0;
        double height=0;
        double BMI;

        while (height < 1 ) {
            System.out.print("Enter your height: ");
            height = Input.nextDouble();
        }
        while(weight < 1) {
            System.out.print("Enter your weight ");
            weight = Input.nextDouble();
        }

        BMI = (weight / (height * height )) * 703;

        System.out.println("Your BMI is: " + BMI);

        if (BMI <18.5) {
            System.out.println("You are Underweight, You should see your doctor");
        }
        else if (BMI > 25) {
            System.out.println("You are overweight, you should see your doctor");
        }
        else {
            System.out.println("You are within ideal weight range");
        }
    }
}
