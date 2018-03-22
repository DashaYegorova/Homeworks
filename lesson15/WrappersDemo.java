package lesson15;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WrappersDemo {
    public static void main(String[] args) {

        Boolean b = true;
        Boolean b1 = new Boolean(true);
        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf(false);
        Boolean b5 = Boolean.valueOf("1");
        boolean b6 = Boolean.parseBoolean("true");
        String b7 = Boolean.toString(true);


        Byte by = 4;
        Byte by1 = new Byte((byte) 3);
        Byte by2 = Byte.valueOf("6");
        Byte by3 = Byte.valueOf(by);
        by.byteValue();
        by.intValue();
        by.doubleValue();
        by.floatValue();
        by.longValue();
        by.shortValue();
        byte by4 = Byte.parseByte("6");
        byte by5 = Byte.parseByte("6", 56);
        Byte by6 = Byte.valueOf("4", 67);
        String by7 = Byte.toString(by);

        Character c = 'c';
        Character c1 = new Character('y');
        Character c2 = Character.valueOf('t');
        c.charValue();
        String c3 = Character.toString('t');

        Double d = 5.6;
        Double d1 = new Double(6.7);
        Double d2 = new Double("4.5");
        Double d4 = Double.valueOf(5.6);
        Double d5 = Double.valueOf("5.6");
        double d6 = Double.parseDouble("6.34");
        d.byteValue();
        d.doubleValue();
        d.floatValue();
        d.intValue();
        d.longValue();
        d.shortValue();
        String d7 = Double.toString(4.5);

        Float f = 5.4f;
        Float f1 = new Float(56.2f);
        Float f2 = new Float("4.5");
        Float f3 = Float.valueOf(45.6f);
        Float f4 = Float.valueOf("45.3");
        float f5 = Float.parseFloat("34.6");
        f.byteValue();
        f.doubleValue();
        f.floatValue();
        f.intValue();
        f.longValue();
        f.shortValue();
        String f6 = Float.toString(f);

        Integer i = 5;
        Integer i1 = new Integer(5);
        Integer i2 = new Integer("6");
        Integer i3 = Integer.valueOf(6);
        Integer i4 = Integer.valueOf("7");
        Integer i5 = Integer.valueOf("6", 45);
        int i6 = Integer.parseInt("54645");
        int i7 = Integer.parseInt("5332", 45);
        i.byteValue();
        i.doubleValue();
        i.floatValue();
        i.intValue();
        i.longValue();
        i.shortValue();
        String i8 = Integer.toString(6);
        String i9 = Integer.toString(5, 56);

        Long l = 45L;
        Long l1 = new Long(45);
        Long l2 = new Long("5");
        Long l3 = Long.valueOf(6);
        Long l4 = Long.valueOf("56");
        Long l5 = Long.valueOf("46", 435);
        long l6 = Long.parseLong("5463");
        long l7 = Long.parseLong("456", 435);
        l.byteValue();
        l.doubleValue();
        l.floatValue();
        l.intValue();
        l.longValue();
        l.shortValue();
        String l8 = Long.toString(34);
        String l9 = Long.toString(56, 4565);


        Short s = 45;
        Short s1 = new Short((short) 32);
        Short s2 = new Short("45");
        Short s3 = Short.valueOf((short) 5);
        Short s4 = Short.valueOf("535");
        Short s5 = Short.valueOf("54", 5745);
        short s6 = Short.parseShort("65");
        short s7 = Short.parseShort("4356", 7);
        s.byteValue();
        s.doubleValue();
        s.floatValue();
        s.intValue();
        s.longValue();
        s.shortValue();
        String s8 = Short.toString(s);
    }
}
