package lesson8;

/**
 * Created by Student on 12.02.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = "067984635";
        phone1.model = "Lenovo";
        phone1.weight = 2.3;

        phone2.number = "067984635";
        phone2.model = "Apple";
        phone2.weight = 4.5;

        phone3.number = "067984635";
        phone3.model = "Nokia";
        phone3.weight = 6.7;

        System.out.println("Номер: " + phone1.number + " Модель: " + phone1.model + " Вес: " + phone1.weight);
        System.out.println("Номер: " + phone2.number + " Модель: " + phone2.model + " Вес: " + phone2.weight);
        System.out.println("Номер: " + phone3.number + " Модель: " + phone3.model + " Вес: " + phone3.weight);
    }
}
