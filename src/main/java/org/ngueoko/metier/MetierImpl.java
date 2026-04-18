package org.ngueoko.metier;

import org.ngueoko.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{

    IDao dao;

    @Override
    public double calcul() {
        return dao.getData()*Math.random();
    }

    public MetierImpl(@Qualifier("capteur")IDao dao) {
        this.dao = dao;
    }

    //public MetierImpl() {
    //}

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
