package lesson13;

import java.util.Objects;

public class Guitar implements Instrument {
    private int stringAmound;

    public Guitar(int stringAmound) {
        this.stringAmound = stringAmound;
    }

    public int getStringAmound() {
        return stringAmound;
    }

    public void setStringAmound(int stringAmound) {
        this.stringAmound = stringAmound;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + getStringAmound() + " струнами");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return stringAmound == guitar.stringAmound;
    }

    @Override
    public int hashCode() {

        return Objects.hash(stringAmound);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "stringAmound=" + stringAmound +
                '}';
    }


}
