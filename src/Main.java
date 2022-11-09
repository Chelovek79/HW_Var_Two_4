public class Main {

    public static void main(String[] args)
    {
// Задача 1.

       byte varByte = 5;
       short varShort = 3154;
       int varInt = 252525;
       long varLong = 250250250250L;
       float varFloat = 1.58f;
       double varDouble = 8.56241325;

        System.out.println("Значение переменной 'varByte' c типом 'byte' равно " + varByte);
        System.out.println("Значение переменной 'varShort' c типом 'short' равно " + varShort);
        System.out.println("Значение переменной 'varInt' c типом 'int' равно " + varInt);
        System.out.println("Значение переменной 'varLong' c типом 'long' равно " + varLong);
        System.out.println("Значение переменной 'varFloat' c типом 'float' равно " + varFloat);
        System.out.println("Значение переменной 'varDouble' c типом 'double' равно " + varDouble);
        System.out.println("----------------------------------");

// Задача 2.
      byte vByte = 2;
      short vShortA = -159;
      short vShortB = 569;
      short vShortC = 786;
      int vInt = 27897;
      long vLong = 987678965549L;
      float vFloat = 27.12f;
      double vDouble = 67.0f;
      boolean vBoolean = false;

// Задача 3.
      byte LudPavKid = 23;
      byte AnnSergKid = 27;
      byte EkatAndrKid = 30;
      short summPaper = 480;
      byte summKid = (byte) (LudPavKid + AnnSergKid + EkatAndrKid);
      byte PaperOneKid = (byte) (summPaper/summKid);

        System.out.println("На каждого ученика рассчитано " + PaperOneKid + " листов бумаги.");
        System.out.println("----------------------------------");

// Задача 4.
      byte BottleOneMin = (byte) (16/2);
      short BottleDay = (short) (BottleOneMin * 60 * 24);
      int BottleThreeDay = BottleDay * 3;
      int BottleOneMonth = BottleDay * 30;

        System.out.println("За 20 минут работы машина произвела " + (BottleOneMin*20) + " бутылок.");
        System.out.println("За сутки работы машина произвела " + BottleDay + " бутылок.");
        System.out.println("За 3 дня работы машина произвела " + BottleThreeDay + " бутылок.");
        System.out.println("За 1 месяц работы машина произвела " + BottleOneMonth + " бутылок.");
        System.out.println("----------------------------------");

// Задача 5.
      byte summDye = 120;                                            // банок всего
      byte roomWhiteDye = 2;                                         // банок белой на класс
      byte roomBrounDye = 4;                                         // банок коричневой на класс
      byte summClass = (byte) (summDye/(roomWhiteDye+roomBrounDye)); // Количество классов

        System.out.println("В школе, где " + summClass + " классов, нужно " + (summClass*2)
                + " банок белой краски и " + (summClass*4) + " банок коричневой краски.");
        System.out.println("----------------------------------");

// Задача 6.
      byte WeightBanan = 80;      // грамм
      byte WeightMilk = 105;      // 105 грамм - 100 мл
      byte WeightIcecream = 100;  // грамм
      byte WeightEgg = 70;        // грамм

        // Рецепт: Бананов 5 шт., молоко 200 мл, мороженное 2 брикета по 100 гр, яйца 4 шт.

      float WeightRecipe = (WeightBanan*5 + WeightMilk*2 + WeightIcecream*2 + WeightEgg*4); // вес в граммах
      float WeightCoctailKG = WeightRecipe/1000;

        System.out.println("Вес приготовленного коктеля " + WeightCoctailKG + " кг.");
        System.out.println("----------------------------------");

// Задача 7.
      short WeightLose = 7000;   // гр надо потерять
      short WheitLessMin = 250;  // гр мin в день
      short WeightLessMax = 500; // гр мах в день
      short MaxDayWeightLess = (short) (WeightLose/WheitLessMin);
      short MinDayWeightLess = (short) (WeightLose/WeightLessMax);
      short AverageDayWeightLess = (short) ((MaxDayWeightLess+MinDayWeightLess)/2);
        System.out.println("Спортсмен сбросит 7 кг за:");
        System.out.println("- " + MaxDayWeightLess + " дней при потере 250 гр/день;");
        System.out.println("- " + MinDayWeightLess + " дней при потере 500 гр/день.");
        System.out.println("В среднем спортсмен может сбросить вес в 7 кг за " + AverageDayWeightLess + " дeнь.");
        System.out.println("----------------------------------");

// Задача 8.
      int SalaryMasha = 67760; // руб./мес.
      int SalaryDenis = 83690; // руб./мес.
      int SalaryCristina = 76230; // руб./мес.
      int NewSalaryMasha = SalaryMasha + SalaryMasha/10;
      int NewSalaryDenis = SalaryDenis + SalaryDenis/10;
      int NewSalaryCristina = SalaryCristina + SalaryCristina/10;

        System.out.println("Маша теперь получает " + NewSalaryMasha + " рублей. Годовой доход вырос на " + (int) (SalaryMasha*1.2) + " рублей.");
        System.out.println("Денис теперь получает " + NewSalaryDenis + " рублей. Годовой доход вырос на " + (int) (SalaryDenis*1.2) + " рублей.");
        System.out.println("Кристина теперь получает " + NewSalaryCristina + " рублей. Годовой доход вырос на " + (int) (SalaryCristina*1.2) + " рублей.");
        System.out.println("----------------------------------");
    }

}