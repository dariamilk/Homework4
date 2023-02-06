import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 27;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = -10;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку!");
        }
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки!");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 45;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 11;
        if (age > 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в десткий сад.");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age >= 14 && age < 18) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sittingPlaceCapacity = 60;
        int standingPlaceCapacity = 102 - sittingPlaceCapacity;
        int sittingPlace = 53;
        int standingPlace = 40;
        if (sittingPlace < sittingPlaceCapacity && standingPlace < standingPlaceCapacity) {
            System.out.println("В вагоне есть свободные сидячие и стоячие места.");
        } else if (sittingPlace >= sittingPlaceCapacity && standingPlace < standingPlaceCapacity) {
            System.out.println("В вагоне есть свободные стоячие места.");
        } else if (sittingPlace < sittingPlaceCapacity && standingPlace >= standingPlaceCapacity) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else {
            System.out.println("В вагоне нет свободных мест.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 4;
        int two = 50;
        int three = 378;
        if (one > two) {
            if (one > three) {
                System.out.println("Большее число: " + one);
            } else if (one < three) {
                System.out.println("Большее число: " + three);
            } else {
                System.out.println("Числа " + one + " и " + three + " равны.");
            }
        } else {
            if (two > three) {
                System.out.println("Большее число: " + two);
            } else if (two < three) {
                System.out.println("Большее число: " + three);
            } else {
                System.out.println("Числа " + two + " и " + three + " равны.");
            }
        }
    }

}

