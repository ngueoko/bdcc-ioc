package org.ngueoko.pres;

import org.ngueoko.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {

    public static void main(String[] args)  {
        System.out.println(" Présentation SpringAnnocation ");

        ApplicationContext springContext=new AnnotationConfigApplicationContext("org.ngueoko.ext","org.ngueoko.metier");
        IMetier metier=(IMetier) springContext.getBean(IMetier.class);

        System.out.println("Température ="+metier.calcul());
    }
}
