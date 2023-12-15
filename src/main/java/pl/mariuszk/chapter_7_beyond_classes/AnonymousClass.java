package pl.mariuszk.chapter_7_beyond_classes;

public class AnonymousClass {
    interface Print {
        void print();
    }

    Print prntField = new Print() {
        @Override
        public void print() {
            System.out.println("I can also be declared and instantiated here");
        }
    };

    public static void main(String[] args) {
        Print prnt = new Print() {
            @Override
            public void print() {
                System.out.println("Hello!");
            }
        };
        // pay attention to the above semicolon
        prnt.print();
        new AnonymousClass().prntField.print();
    }
}
