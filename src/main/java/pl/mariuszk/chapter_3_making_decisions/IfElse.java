package pl.mariuszk.chapter_3_making_decisions;

public class IfElse {

    public IfElse(int hourOfTheDay) {
        // Remember: Curly braces are required only for blocks of multiple statements,
        // they are optional for single statements
        if (hourOfTheDay < 12)
            System.out.println("Good morning!");
        else if (hourOfTheDay == 12)
            System.out.println("Hello!");
        else
            System.out.println("Good afternoon!");
    }
}
