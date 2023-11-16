
//Доходи оподатковуются за прогресивною шкалою оподаткування:
//  - від 0 до 10000, включно, за ставкою 2,5%.
//  - від 10000, виключно, до 25000, включно, за ставкою 4,3%.
//  - більше 25000, за ставкою 6,7%.
//
// Необхідно розрахувати суму податку від певної суми доходу.
// Сума податку дорівнює відсотку від суми доходу.
// Забезпечте виведення результату розрахунків з двома знаками
// після десяткового роздільника.


package app;

import java.util.Locale;
import java.util.Scanner;


public class Main01 {

    static double incomeHightrate;
    static double incomeLowrate;
    static double taxHightrate;
    static double taxAVGrate;
    static double taxLowrate;
    static double taxSum;
    static double incomeSum;


    public static void main(String[] args) {

        incomeHightrate = 25000.00;
        incomeLowrate = 10000.00;
        taxHightrate = 6.7;
        taxAVGrate = 4.3;
        taxLowrate = 2.5;


        Scanner scannerSC = new Scanner(System.in);
        scannerSC.useLocale(Locale.ENGLISH);

        System.out.print("Enter the amount of income: ");
        incomeSum = scannerSC.nextDouble();
        scannerSC.nextLine();

        if (incomeSum <= incomeLowrate) {
            taxSum = incomeSum * taxLowrate / 100;
            System.out.printf("Tax sum is: %.2f \n", taxSum);

        } else if (incomeSum > incomeLowrate & incomeSum <= incomeHightrate) {
            taxSum = incomeSum * taxAVGrate / 100;
            System.out.printf("Tax sum is: %.2f \n", taxSum);

        } else {
            taxSum = incomeSum * taxHightrate / 100;
            System.out.printf("Tax sum is: %.2f \n", taxSum);
        }

        scannerSC.close();
    }
}