package lesson15;

/**
 * Created by Student on 12.03.2018.
 */
public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons myFavoriteSeasons = Seasons.AUTUMN;
        switch (myFavoriteSeasons) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
            print();
    }
        public static void print() {
        Seasons [] array = Seasons.values();
        for (Seasons seasons: array) {
            System.out.println(seasons + " " + seasons.getAngTemperature());
            System.out.println(seasons.getDescription());
        }
    }
    }

