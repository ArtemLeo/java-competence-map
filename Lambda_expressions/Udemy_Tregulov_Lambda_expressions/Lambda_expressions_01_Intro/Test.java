package Lambda_expressions.Udemy_Tregulov_Lambda_expressions.Lambda_expressions_01_Intro;

public class Test {
    static void def(I i) {
        System.out.println(i.abs("Hello"));
    }

    public static void main(String[] args) {
        def((String s) -> {
            return s.length();
        });
        int x = 10;
        def((String s) -> {
            return s.length() + x;
        });
    }
}

interface I {
    int abs(String s);
}
