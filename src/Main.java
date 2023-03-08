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
    public static void main(String[] args) {
        System.out.println("Task1");
        leapYear(2021);
        osVersion(1,2019);

    }

}