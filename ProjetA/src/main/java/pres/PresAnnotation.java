package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
       IMetier metier=context.getBean(IMetier.class)  ;
       System.out.println("resultat  : "+metier.calcule()  );
    }

}
