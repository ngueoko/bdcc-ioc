package org.ngueoko.dao;

public class DaoImpl implements  IDao{
    @Override
    public double getData(){
        System.out.println(" Version BD");
        double t= 25;
        return t;
    }
}
