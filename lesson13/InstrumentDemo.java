package lesson13;

public class InstrumentDemo {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(7);
        Guitar guitar3 = new Guitar(12);
        Tube tube1 = new Tube(4);
        Tube tube2 = new Tube(7);
        Drum drum1 = new Drum(34);

        Instrument[] instruments = {guitar1, guitar2, guitar3, tube1, tube2, drum1};

        for (Instrument i : instruments) {
            i.play();
        }
    }
}
