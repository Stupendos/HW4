//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
            //Задача 2
            int tOfAir = -7;
            if (tOfAir < 5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }
            //Задача 3
            int speed = 120;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
            }
            //Задача 4
            int age1 = 3;
            if (age1 > 2 && age1 < 6) {
                System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");
            }
            int age2 = 14;
            if (age2 > 7 && age2 < 17) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
            }
            int age3 = 18;
            if (age3 >= 18 && age3 <= 24) {
                System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет.");
            }
            int age4 = 25;
            if (age4 > 24) {
                System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу.");
            }
            //Задача 5
            int ageChild = 3;
            if (ageChild < 5) {
                System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционах");
            }
            int ageChild1 = 9;
            if (ageChild1 > 7 && ageChild1 < 14) {
                System.out.println("Если возраст ребенка равен " + ageChild1 + ", то ему можно кататься на аттракционах в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            }
            int ageChild2 = 15;
            if (ageChild2 > 14) {
                System.out.println("Если возраст ребенка равен " + ageChild2 + ", то он может кататься на аттракционах без сопровождения взрослого");
            }
            //Задача 6
            int peopleInTrain = 60;
            int sit = 60;
            int standing = 42;
            var capacity = 102;
            if (peopleInTrain >= capacity) {
                System.out.println("В вагоне нет мест");
            }
            if (peopleInTrain < sit) {
                System.out.println("В вагоне есть сидячие места");
            } else if (peopleInTrain >= sit) {
                System.out.println("В вагоне нет сидячих мест");
            }
            //Задача 7
            int one = 0;
            int two = -71;
            int three = -123;
            if (one > two && one > three) {
                System.out.println(one);
            } else if (two > one && two > three) {
                System.out.println(two);
            } else if (three > one && three > two) {
                System.out.println(three);
            }

        }
    }
}
