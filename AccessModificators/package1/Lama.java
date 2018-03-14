package AccessModificators.package1;

import AccessModificators.Animal;

public class Lama extends Animal{
    public static void main(String[] args) {
        Lama lama = (Lama) new Animal();
        lama.ears = 2;
        //lama.eyes = 2; private
        lama.legs = 4;
        //lama.nose = 1; default
    }
}
