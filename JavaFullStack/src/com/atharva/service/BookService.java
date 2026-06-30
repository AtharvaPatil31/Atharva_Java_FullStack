package com.atharva.service;

import java.util.List;
import com.atharva.Pojo.Buch;

public interface BookService {

    boolean save(Buch b);

    Buch find(int isbn) throws BookNotFoundException;

    List<Buch> list();

    boolean delete(int isbn) throws BookNotFoundException;

    List<Buch> findByPrice(double min, double max);

    List<Buch> listOrderByTitle();
}