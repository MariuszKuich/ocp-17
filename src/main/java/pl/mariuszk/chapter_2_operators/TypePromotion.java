package pl.mariuszk.chapter_2_operators;

public class TypePromotion {

    public TypePromotion() {
        int x = 1;
        long y = 33;
        //long data type - first rule
        var z = x * y;

        short a = 10;
        short b = 3;
        //int data type - third rule
        var c = a * b;

        short d = 14;
        float e = 13;
        double f = 30;
        //double data types - all rules are applied in this example
        var g = d * e / f;

        short mouse = 10;
        short hamster = 3;
        /*
        DOES NOT COMPILE - third rule
        short capybara = mouse * hamster;
        COMPILES - thanks to casting
        short capybara1 = (short) (mouse * hamster);
        DOES NOT COMPILE - variables are cast to shorts and then the third rule is applied
        short capybara2 = (short) mouse * (short) hamster;
        COMPILES - the third rule is only applied to variables, not literals
        short capybara3 = 10 * 3;
        DOES NOT COMPILE AGAIN
        short capybara4 = mouse * 3;
         */
    }
}
