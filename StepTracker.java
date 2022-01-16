import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {

    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    class MonthData {
        int[] dayOfmonth = new int[30];   // Заполните класс самостоятельно
    }

    public void savestep(int month, int day, int step) {
        monthToData.get(month).dayOfmonth[day - 1] = step;
        System.out.println("Шаги успешно сохраненны");
    }

    public void StepsMonthDay(int monStat) { // Количество пройденных шагов по дням
        for (int i = 0; i < monthToData.get(monStat).dayOfmonth.length; i++) {
            System.out.println("День: " + (i + 1) + " пройдено " + monthToData.get(monStat).dayOfmonth[i]);
        }
    }

    public int sumStepsMonth(int monStat) { // Метод получения количества шагов за месяц
        int sum = 0;
        for (int i = 0; i < monthToData.get(monStat).dayOfmonth.length; i++) {
            sum = sum + monthToData.get(monStat).dayOfmonth[i];
        }
        return sum;
    }

    public int maxStepsMonth(int monStat) {   // Максимальное количества шагов в месяце
        int msm = 0;
        for (int i = 0; i < monthToData.get(monStat).dayOfmonth.length; i++) {
            if (monthToData.get(monStat).dayOfmonth[i] > msm){
                msm =  monthToData.get(monStat).dayOfmonth[i];
            }
        }
        return msm;
    }
    public void bestSeries(int monStat) { // Лучшая серия
        int maxSeries = 0;
        for (int i = 0; i < monthToData.get(monStat).dayOfmonth.length; i++) {
            if (i >= goalstep) {
                currentSeries++;
            } else {
            if (currentSeries > maxSeries){
                maxSeries = currentSeries;
            }
                currentSeries = 0;
            }
        }
            System.out.println("Лучшая серия " + maxSeries);
        }

        int goalstep = 10000;
    public void glStep(int goalstep){

        }
    }



