public class Main {
    public static void main(String[] args) {
        System.out.println("Условные операторы 2 " + " Задача 1");
        int ios = 1;
        if (ios == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (ios == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2");

        int clientIos = 0;
        int produced = 2016;
        if (clientIos == 0) {
            if (produced > 2015) {
                System.out.println(" Установите версию приложения для IOS по ссылке");
            } else if (clientIos == 1) {
                if (produced > 2015) {
                    System.out.println(" Установите версию приложения для Android по ссылке ");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android");
                }


            }
        }
        System.out.println("Задача 3");
        int year = 2022;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным ");
        }
        System.out.println( " Задача 4 ");
        int distance = 75;
        int deliveryDays = 0;
        if ( distance <20) {
            deliveryDays = 1;
        } else if (distance <60) {
            deliveryDays = 2;
        } else if (distance <100) {
            deliveryDays = 3;
        }
        if (deliveryDays ==0) {
            System.out.println(" Доставка не осуществляется ");
        } else {
            System.out.println(" Потребуется дней :" + deliveryDays);
        }
        System.out.println( "Задача 5");
        int month = 5;
        switch ( month){
            case 12:
            case 1:
            case 2:
                System.out.println( "Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println( "Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( "Лето ");
        break;
            case 9:
            case 10:
            case 11:
        System.out.println( "Осень ");
            default:
                System.out.println( "Нет такого месяца ");


        }
        }

    }







