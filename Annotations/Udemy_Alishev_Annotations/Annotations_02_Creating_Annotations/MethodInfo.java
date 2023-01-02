package Annotations.Udemy_Alishev_Annotations.Annotations_02_Creating_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Tom";
    int dateOfCreation() default 2019;
    String purpose()default "Print some string";
}
