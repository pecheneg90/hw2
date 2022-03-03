package com.company;

public class Main {

    public static void main(String[] args) {
        // задание 1
        byte apple = 5;
        short cherries = 3_000;
        int car = 3;
        long tomatoes = 7_778L;
        double weightTomato = 0.33378;
        float weightCherry = 0.3f;
        char percent = 37;
        boolean allCars = car < 2;
        System.out.println(allCars);
        // задание 2
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double allWeight = boxerWeight1 + boxerWeight2;
        double differenceWeight = boxerWeight1 - boxerWeight2;
        System.out.println("вес двух бойцов вместе = " + allWeight + ", разница в весе = " + differenceWeight);
        // задание 3
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamBriquetteWeight = 100;
        int eggWeight = 70;
        int allWeightBreakfast = bananaWeight * 5 + milkWeight * 2 + iceCreamBriquetteWeight * 2 + eggWeight * 4;
        float allWeightBreakfastKilo = (bananaWeight * 5 + milkWeight * 2 + iceCreamBriquetteWeight * 2 + eggWeight * 4)/1000f;
        System.out.println("общий вес всех продуктов из рецепта в граммах = " + allWeightBreakfast + ", общий вес всех продуктов из рецепта в килограммах = " + allWeightBreakfastKilo);
        // задание 4
        int allWeightGrams = 7000;
        int dayMinimum = 250;
        int dayMaximum = 500;
        int minProgram = allWeightGrams / dayMinimum;
        int maxProgram = allWeightGrams / dayMaximum;
        System.out.println("Потеря веса 250 гр. в день = " + minProgram + " дней до похудения на 7 кг.");
        System.out.println("Потеря веса 500 гр. в день = " + maxProgram + " дней до похудения на 7 кг.");
        // задание 5
        double mashaMonth = 67760;
        double denisMonth = 83690;
        double kristinaMonth = 76230;
        double mashaPercent = mashaMonth/100*10;
        double denisPercent = denisMonth/100*10;
        double kristinaPercent = kristinaMonth/100*10;
        double mashaMonthNew = mashaMonth + mashaPercent;
        double denisMonthNew = denisMonth + denisPercent;
        double christyMonthNew = kristinaMonth + kristinaPercent;
        double mashaYear = mashaMonth * 12;
        double denisYear = denisMonth * 12;
        double kristinaYear = kristinaMonth * 12;
        double mashaYearNew = mashaMonthNew * 12;
        double denisYearNew = denisMonthNew * 12;
        double kristinaYearNew = christyMonthNew * 12;
        double mashaYearDifference = mashaYearNew - mashaYear;
        double denisYearDifference = denisYearNew - denisYear;
        double christyYearDifference = kristinaYearNew - kristinaYear;
        System.out.println("После повышения заработной платы на 10% Маша стала получать " + mashaMonthNew + " рублей" + ", годовой доход Маши увеличился на " + mashaYearDifference + " рублей");
        System.out.println("После повышения заработной платы на 10% Денис стал получать " + denisMonthNew + " рублей" + ", годовой доход Дениса увеличился на " + denisYearDifference + " рублей");
        System.out.println("После повышения заработной платы на 10% Кристина стала получать " + christyMonthNew + " рублей" + ", годовой доход Кристины увеличился на " + christyYearDifference + " рублей");
    }
}
