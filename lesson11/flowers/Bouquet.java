package lesson11.flowers;

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
        Flower[] bouquet2 = {carnation, carnation1, tulip, tulip1, tulip2};
        Flower[] bouquet3 = {carnation2, carnation3, rose3, daffodil2};

        System.out.println("Cost of bouquet is " + totalCost(bouquet1));
        System.out.println("Cost of bouquet is " + totalCost(bouquet2));
        System.out.println("Cost of bouquet is " + totalCost(bouquet3));

       System.out.println(Flower.getCount());
    }

    public static double totalCost(Flower[] bouquet){
        double totalCost = 0;
        for(int i = 0; i < bouquet.length; i++){
            totalCost += bouquet[i].getCost();
        }
        return totalCost;
    }
}
