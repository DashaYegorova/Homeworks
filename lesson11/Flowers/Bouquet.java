package lesson11.Flowers;

public class Bouquet {
    public static void main(String[] args) {
        Flower rose = new Rose("Ukraine", 9, 23.5);
        Flower rose1 = new Rose("Ukraine", 9, 23.5);
        Flower rose2 = new Rose("Ukraine", 9, 23.5);
        Flower rose3 = new Rose("Ukraine", 9, 23.5);
        Flower daffodil = new Daffodil("France", 4, 34);
        Flower daffodil1 = new Daffodil("France", 4, 34);
        Flower daffodil2 = new Daffodil("France", 4, 34);
        Flower tulip = new Tulip("German", 8, 6);
        Flower tulip1 = new Tulip("German", 8, 6);
        Flower tulip2 = new Tulip("German", 8, 6);
        Flower carnation = new Carnation("Holland", 5, 15);
        Flower carnation1 = new Carnation("Holland", 5, 15);
        Flower carnation2 = new Carnation("Holland", 5, 15);
        Flower carnation3 = new Carnation("Holland", 5, 15);

        Flower[] bouquet1 = {rose, rose1, rose2, daffodil, daffodil1};
        System.out.println("Cost of bouquet is " + (bouquet1[0].getCost() + bouquet1[1].getCost() +
                bouquet1[2].getCost() + bouquet1[3].getCost() + bouquet1[4].getCost()));
        Flower[] bouquet2 = {carnation, carnation1, tulip, tulip1, tulip2};
        System.out.println("Cost of bouquet is " + (bouquet2[0].getCost() + bouquet2[1].getCost() +
                bouquet2[2].getCost() + bouquet2[3].getCost() + bouquet2[4].getCost()));
        Flower[] bouquet3 = {carnation2, carnation3, rose3, daffodil2};
        System.out.println("Cost of bouquet is " + (bouquet3[0].getCost() + bouquet3[1].getCost() +
                bouquet3[2].getCost() + bouquet3[3].getCost()));

        System.out.println(Flower.getCount());
    }
}
