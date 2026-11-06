package Fif.src;

public class Mass {
        public static void main(String[] args) {
            int[] numbers = {5, 12, 8, 21, 4, 7, 14, 3, 22, 11};

            int sumEven = 0;
            int countOdd = 0;

            System.out.print("Все элементы массива: ");
            for (int num : numbers) {
                System.out.print(num + " ");

                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    countOdd++;
                }
            }
            System.out.println("Сумма всех четных элементов: " + sumEven);
            System.out.println("Количество нечетных элементов: " + countOdd);
        }
}


