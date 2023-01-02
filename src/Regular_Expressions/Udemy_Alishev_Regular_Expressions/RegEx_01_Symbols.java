package Regular_Expressions.Udemy_Alishev_Regular_Expressions;

public class RegEx_01_Symbols {
    public static void main(String[] args) {

        // matches method;
        String string = "hello";
        System.out.println(string.matches("hello"));
        System.out.println("------------------------------------");

          /*
          \\d - одна цифра;
          \\w - одна буква;

           +  - 1 или более;
           *  - 0 или более;
           ?  - символ до ? Может быть, а может и не быть;
      (a|b|c) - символ "или";
     [a-z0-9] - диапазон символов;

      (a|b|c) = [a-c];
     [a-zA-Z] = \\w;
          \\d = [0-9];

       [^abc] - любые символы кроме [abc];
            . - любой символ;

          {n} - количество символов до {};
        {2, } - 2-ва или более символов;
        {2,4} - от 2 до 4 символов;
           */

        String a = "-123";
        String b = "+123";
        String c = "123";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));
        System.out.println("--------------------------------");

        String d = "AbcDF123";
        System.out.println(d.matches("[a-zA-Z]+\\d+"));
        System.out.println("--------------------------------");

        String e = "AbcDF123";
        System.out.println(e.matches("[^A-Z]+\\d+"));
        System.out.println("--------------------------------");

        String url = "https://www.google.com";
        System.out.println(url.matches("https://www\\.[a-zA-Z0-9]+\\.(com|ua)"));
        System.out.println(url.matches("https://www\\..+\\.(com|ua)"));
        System.out.println("--------------------------------");
    }
}
