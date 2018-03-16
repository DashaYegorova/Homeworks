package lesson12.fruitShop;

import static lesson12.fruitShop.Fruit.totalCost;

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
        Fruit[] apples = {apple1, apple2, apple3};
        Fruit[] pears = {pear1, pear2, pear3, pear4};
        Fruit[] apricots = {apricot1, apricot2};

        totalCost(fruits);
        totalCost(apples);
        totalCost(pears);
        totalCost(apricots);
    }
}



