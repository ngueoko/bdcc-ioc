package org.ngueoko.pres;

import org.ngueoko.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {

    public static void main(String[] args)  {
        System.out.println(" Présentation SpringXML ");

        ApplicationContext springContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) springContext.getBean("metier");

        System.out.println("Température ="+metier.calcul());
    }
}
