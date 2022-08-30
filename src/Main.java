public class Main {
    public static void main(String[] args) {
        printIsLeap(2021);
        printMassage(2015, 1);
        printCalculateDeliveryDays(90);

    }

    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400==0 )
        {
            System.out.println("високосный год");}
        else {

            System.out.println(" не високосный");
        }
    }

    private static void printMassage(int productionYear, int os) {
        if (os ==0) {
            if (productionYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");}}
            else {
                if (productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
            System.out.println("Установите  версию приложения для Android по ссылке");}
            }
        }

    private static void printCalculateDeliveryDays(int distance) {
        int start = 20;
        int step = 40;
        int result;
        if (distance < start) {
            result = 1;
        } else  {result = (Math.abs((distance - start) / step) + 2);
        }System.out.println("Потребуется для доставки дней: " + result);


        }

    }





