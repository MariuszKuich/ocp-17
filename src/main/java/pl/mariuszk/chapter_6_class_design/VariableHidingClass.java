package pl.mariuszk.chapter_6_class_design;

public class VariableHidingClass {

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        System.out.println(m.hasFur);
        System.out.println(c.hasFur);
    }
}

class Carnivore {
    protected boolean hasFur = false;
}

class Meerkat extends Carnivore {
    protected boolean hasFur = true;
}