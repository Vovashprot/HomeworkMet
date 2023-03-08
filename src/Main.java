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
        if (osType == 1){
            if(releaseYear < currentYear){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        if (osType == 0) {
            if(releaseYear < currentYear){
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }

    }
    public static void delDistance(int deliveryDistance){
        System.out.println("Task 4");
        byte days = 0;
        if (deliveryDistance <= 20){
            days = 1;
            System.out.println("Потребуется дней:" +days);
        }
        else if (deliveryDistance > 20 && deliveryDistance <=60){
            days = 2;
            System.out.println("Потребуется дней:" +days);
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100){
            days = 3;
            System.out.println("Потребуется дней: "+days);
        }
        else {
            System.out.println("Доставить не получится");
        }
    }
    public static void main(String[] args) {
        System.out.println("Task1");
        leapYear(2021);
        System.out.println("Task2");
        osVersion(1,2019);
        System.out.println("Task3");
        delDistance(30);

    }

}