package Regular_Expressions.Udemy_Tregulov_Regular_Expressions;

public class RegEx_04_Replace_ReplaceAll_ReplaceFirst {
    public static void main(String[] args) {

        // replace;
        String s1 = "Hi my friend. How is learning Java going?";
        System.out.println(s1);
        s1 = s1.replace("Java","SQL");
        System.out.println(s1);
        System.out.println("----------------------------------------");

        // replaceAll;
        String s2 = "Hi    my    friend.    How   is   learning     Java going?";
        System.out.println(s2);
        s2 = s2.replaceAll(" {2,}"," ");
        System.out.println(s2);
        s2 = s2.replaceAll("\\bi\\w+","REPLACE");
        System.out.println(s2);
        System.out.println("----------------------------------------");

        // replaceFirst;
        String s3 = "Hi my friend. How IS IS learning Java going?";
        System.out.println(s3);
        s3 = s3.replaceFirst("\\bI\\w+","FIRST");
        System.out.println(s3);
    }
}
