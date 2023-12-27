package pl.mariuszk.chapter_8_lambdas_and_functional_interfaces;

public class MethodReferences {

    public static void main(String[] args) {
        // if there is more than one parameter for a method reference, the first one will always be the instance
        // the method is called on, any others will be method parameters
        StringTwoParametersChecker c1 = String::startsWith;
        StringTwoParametersChecker c2 = (s, p) -> s.startsWith(p);
        System.out.println(c1.check("aaa", "a"));
    }

    interface StringTwoParametersChecker {
        boolean check(String text, String prefix);
    }
}
