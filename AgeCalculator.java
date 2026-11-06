import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
       final int CURRENT_YEAR = 2026;
       System.out.println("Введите год рождения: ");
       Scanner in = new Scanner(System.in);
       int birthYear = in.nextInt();
       int age = CURRENT_YEAR - birthYear;
       System.out.println("Ваш возраст: "+ age);
       if (age < 18) {
           System.out.println("Вы несовершеннолетний");
       }else if (age >= 18 && age < 65) {
           System.out.println("Вы взрослый");
       }else if (age >= 65 && age <= 110){
           System.out.println("Вы пенсионер");
       }else {
           System.out.println("Вы неживой");
       }
    }
}