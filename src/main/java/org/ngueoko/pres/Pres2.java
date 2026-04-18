package org.ngueoko.pres;

import org.ngueoko.dao.IDao;
import org.ngueoko.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        //ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException
        System.out.println(" Présentation 2 :");
        Scanner scanner= new Scanner(new File("config.txt"));

        String daoClassName= scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();

        String metierClassName= scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        double temperature= metier.calcul();
        System.out.printf("Température : "+temperature);

        }
}
