import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите месяц");
                int month = scanner.nextInt();
                System.out.println("Введите день");
                int day = scanner.nextInt();
                System.out.println("Введите количесто шагов");
                int step = scanner.nextInt();
                stepTracker.savestep(month, day, step);
            } else if (command == 2) {
                System.out.println("Введите месяц за который нужна статистика");
                int monStat = scanner.nextInt();
                if (!stepTracker.monthToData.containsKey(monStat)) {
                System.out.println("Номер месяца введен некорректно");
                }
                stepTracker.StepsMonthDay(monStat);
                System.out.println("Общее количесто шагов в месяце " + stepTracker.sumStepsMonth(monStat));
                System.out.println("Максимальное количество шагов в месяце " + stepTracker.maxStepsMonth(monStat));
                System.out.println("Пройденная дистанция в месяце " + converter.converterKM(stepTracker.maxStepsMonth(monStat)));
                System.out.println("Потраченные колории " + converter.converterKK(stepTracker.maxStepsMonth(monStat)));
                stepTracker.bestSeries(monStat);
            } else if (command == 3) {
                System.out.println("Задайте цель по количеству шагов в день");
                int goalstep = scanner.nextInt();
                stepTracker.glStep(goalstep);
            } else if (command == 4) {
                System.out.println("Выйти из приложения");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Введите количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выйти из приложения");
    }
}