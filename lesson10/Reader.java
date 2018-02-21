package lesson10;

import java.util.Arrays;

public class Reader {

    private static int[] count;
    private String fullName;
    private int id;
    private String department;
    private String birthDay;
    private String phoneNumber;

    Reader() {
//        for (int i = 0; i < count.length; i++) {
//            count[i] = i++;
//        }

    }

    Reader(String fullName, int id, String department, String birthDay, String phoneNumber) {
//       for (int i = 0; i < count.length; i++) {
//            count[i] = i++;
//        }
        this.fullName = fullName;
        this.id = id;
        this.department = department;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
    }

    public static int[] getCount() {
        return count;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void takeBook() {
        System.out.println(fullName + " взял книги!");
    }

    void returnBook() {
        System.out.println(fullName + " вернул книги!");
    }

    void takeBook(int bookAmound) {
        System.out.println(fullName + "  взял " + bookAmound + " книг");
    }

    void returnBook(int bookAmound) {
        System.out.println(fullName + " вернул " + bookAmound + " книг");
    }

    void takeBook(String... bookTitle) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(bookTitle));
    }

    void returnBook(String... bookTitle) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(bookTitle));
    }

    void takeBook(Book... books) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(books));
    }

    void returnBook(Book... books) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(books));
    }


}
