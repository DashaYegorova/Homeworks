package lesson14;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season);
        print(season);
        print(Season.SUMMER);
        print();

        Season myFavoriteSeason = Season.valueOf("WINTER");
        System.out.println("My favorite season is " + myFavoriteSeason);
    }

    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Люблю зиму");
                break;
            case SPRING:
                System.out.println("Люблю весну");
                break;
            case SUMMER:
                System.out.println("Люблю лето");
                break;
            case AUTUMN:
                System.out.println("Люблю осень");
                break;
        }
    }

    public static void print() {
        Season[] season = Season.values();
        for (Season season1 : season) {
            System.out.println(season1);
        }
    }
}
