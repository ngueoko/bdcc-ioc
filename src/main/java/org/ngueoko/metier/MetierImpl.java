package org.ngueoko.metier;

import org.ngueoko.dao.IDao;

public class MetierImpl implements IMetier{
    IDao dao;
    @Override
    public double calcul() {
        return dao.getData()*Math.random();
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
