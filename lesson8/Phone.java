package lesson8;

/**
 * Created by Student on 12.02.2018.
 */
public class Phone {
    private static int count;
    private String number = "0655345676";
    private String model = "lenovo";
    private double weight = 4.5;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String n, String m) {
        number = n;
        model = m;
        count++;
    }

    Phone() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void recieveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void recieveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номером телефона " + number);
    }

    void sendMessage(String... numbers) {
        System.out.print("Сообщение отправлено ");
        for (String number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
