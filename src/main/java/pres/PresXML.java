package pres;

import metier.IMetier;
import metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresXML {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
     IMetier metier=(IMetier)context.getBean("metier");
        System.out.println("resultat  : "+metier.calcule());

    }
}
