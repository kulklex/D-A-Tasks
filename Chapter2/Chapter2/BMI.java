package Chapter2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BMI, weightInKG, heightInMeters;
        System.out.print("Enter Weight in Pounds: ");
        weightInKG = input.nextFloat();
        weightInKG = weightInKG * 703;
        System.out.print("Enter Height in Fts: ");
        heightInMeters = input.nextFloat();
        BMI = (weightInKG / (heightInMeters * heightInMeters))/100;
        System.out.println(BMI);
        if(BMI < 18.5){
            System.out.printf("The Department of Health Report %n  Body Mass Index: UnderWeight");
        }
        if(BMI > 18.5 && BMI < 25){
            System.out.printf("The Department of Health Report %n  Body Mass Index: Normal");
        }
        if(BMI > 25 && BMI < 30){
            System.out.printf("The Department of Health Report %n  Body Mass Index: OverWeight");
        }
        if(BMI > 30){
            System.out.printf("The Department of Health Report %n  Body Mass Index: Obese");
        }
        input.close();
    }
}
