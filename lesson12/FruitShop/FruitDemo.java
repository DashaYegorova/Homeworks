package lesson12.FruitShop;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(0.5, 3.5);
        Fruit apple2 = new Apple(0.5, 3.5);
        Fruit apple3 = new Apple(0.5, 3.5);
        Fruit pear1 = new Pear(3.2, 4.8);
        Fruit pear2 = new Pear(3.2, 4.8);
        Fruit pear3 = new Pear(3.2, 4.8);
        Fruit pear4 = new Pear(3.2, 4.8);
        Fruit apricot1 = new Apricot(2.2, 6);
        Fruit apricot2 = new Apricot(2.2, 6);

        Fruit[] fruits = {apple1, apple2, apple3, apricot1, apricot2, pear1, pear2, pear3, pear4};
        double allFruitCost = 0;
        for (Fruit fruits1 : fruits) {
            allFruitCost += fruits1.cost(fruits1);
        }
        System.out.println("Стоимость всех фруктов " + allFruitCost);

        Fruit[] apples = {apple1, apple2, apple3};
        double applesCost = 0;
        for (Fruit apples1 : apples) {
            applesCost += apples1.cost(apples1);
        }
        System.out.println("Стоимость всех яблок " + applesCost);

        Fruit[] pears = {pear1, pear2, pear3, pear4};
        double pearsCost = 0;
        for (Fruit pears1 : pears) {
            pearsCost += pears1.cost(pears1);
        }
        System.out.println("Стоимость всех груш " + pearsCost);

        Fruit[] apricots = {apricot1, apricot2};
        double apricotsCost = 0;
        for (Fruit apricots1 : apricots) {
            apricotsCost += apricots1.cost(apricots1);
        }
        System.out.println("Стоимость всех абрикос " + apricotsCost);
    }
}



