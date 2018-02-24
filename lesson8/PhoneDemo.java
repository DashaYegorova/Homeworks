package lesson8;

/**
 * Created by Student on 12.02.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone("067984635", "Lenovo", 2.3);
        Phone phone2 = new Phone("067984635", "Apple");
        Phone phone3 = new Phone();
        System.out.println(Phone.getCount());


        phone3.setNumber("067984635");
        phone3.setModel("Nokia");
        phone3.setWeight(6.7);

        System.out.println("Номер: " + phone1.getNumber() + " Модель: " + phone1.getModel() + " Вес: " + phone1.getWeight());
        System.out.println("Номер: " + phone2.getNumber() + " Модель: " + phone2.getModel() + " Вес: " + phone2.getWeight());
        System.out.println("Номер: " + phone3.getNumber() + " Модель: " + phone3.getModel() + " Вес: " + phone3.getWeight());
        phone1.recieveCall("Mom");
        System.out.println(phone1.getNumber());
        phone1.recieveCall("Dad", phone2.getNumber());
        phone1.sendMessage(phone2.getNumber(), phone3.getNumber(), "57783456876");
        phone2.sendMessage("5667645665", "5467655");
    }
}
