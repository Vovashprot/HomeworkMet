import java.time.LocalDate;
public class Main {
    public static void leapYear(int year){
        if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0))
        {
            System.out.println(year + " високосный год");
        }
        else {System.out.println(year + " не високосный год");}

    }

    public static void osVersion(int osType, int releaseYear){
        int currentYear = LocalDate.now().getYear();
        if (osType == 0 && releaseYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        }
        else if (osType == 0 && releaseYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        }
        if (osType == 1 && releaseYear >= currentYear ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (osType == 1 && releaseYear < currentYear ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

    }
    }
    public static int calculateDeliveryDistance(int deliveryDistance){
        byte days = 0;
        if (deliveryDistance <= 20 && deliveryDistance >= 0){
            days = 1;
            System.out.println("Потребуется дней: "+days);
        }
        else if (deliveryDistance > 20 && deliveryDistance <=60){
            days = 2;
            System.out.println("Потребуется дней: "+days);
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100){
            days = 3;
            System.out.println("Потребуется дней: "+days);
        }
        else if(deliveryDistance > 100) {
            days = -1;
            System.out.println("Доставить не получится");
        }
        return days;
    }
    public static void main(String[] args) {
        System.out.println("Task1");
        leapYear(2021);
        System.out.println("Task2");
        osVersion(1,2019);
        System.out.println("Task3");
        calculateDeliveryDistance(30);
    }

}