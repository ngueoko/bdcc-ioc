package org.ngueoko.ext;

import org.ngueoko.dao.IDao;
import org.springframework.stereotype.Component;

@Component("capteur")
public class DaoImplV2 implements IDao {
    @Override
    public double getData(){
        System.out.println(" Version capteur: ");
        double t= 15*(Math.random()+1);
        return t;
    }
}
