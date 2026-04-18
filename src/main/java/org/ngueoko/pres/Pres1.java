package org.ngueoko.pres;

import org.ngueoko.dao.DaoImpl;
import org.ngueoko.dao.IDao;
import org.ngueoko.metier.IMetier;
import org.ngueoko.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        System.out.println(" Présentation 1 :");
        IDao dao=new DaoImpl();
        IMetier metier=new MetierImpl(dao);
        double temperature= metier.calcul();
        System.out.printf("Température : "+temperature);

        }
}
