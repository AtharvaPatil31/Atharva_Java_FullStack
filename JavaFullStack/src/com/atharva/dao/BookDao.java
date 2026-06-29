package com.atharva.dao;

import java.util.List;

import com.atharva.Pojo.Buch;

public interface BookDao {

    boolean save(Buch b);

    Buch find(int isbn);

    List<Buch> list();

    boolean delete(int isbn);
    
    List<Buch> findByPrice(double min, double max);
}