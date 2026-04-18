package org.ngueoko.metier;

import org.ngueoko.dao.IDao;

public class Metier implements IMetier{
    IDao dao;
    @Override
    public double calcul() {
        return dao.getData()*Math.random();
    }

    public Metier(IDao dao) {
        this.dao = dao;
    }

}
