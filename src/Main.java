public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();

        // Задача 1: Посчитать сумму всех выплат за месяц
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задача 2: Найти и вывести максимальную и минимальную трату за день
        int maxExpense = arr[0];
        int minExpense = arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей");

        // Задача 3: Вывести среднюю сумму трат за месяц
        float averageSum = (float) sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        // Задача 4: Напишите код, который выводит элементы символьного массива в обратном порядке

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            char letter = (reverseFullName[i-1]);
            System.out.print(letter);

        }
    }
}