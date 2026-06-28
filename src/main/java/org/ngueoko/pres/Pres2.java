package org.ngueoko.pres;

import org.ngueoko.dao.IDao;
import org.ngueoko.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        //
        System.out.println(" Présentation 2 :");
        Scanner scanner= new Scanner(new File("config.txt"));

        String daoClassName= scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();

        //Injection par Constructeur
        String metierClassName= scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        //Injection par propriete
        Method meth=cMetier.getMethod("setDao", IDao.class);
        meth.invoke(metier,dao);


        double temperature= metier.calcul();
        System.out.printf("Température : "+temperature);

        }
}
