package com.atharva.service;

import java.util.Comparator;
import java.util.List;

import com.atharva.Pojo.Buch;
import com.atharva.dao.BookDao;

public class bookserviceimpl implements BookService {

    private BookDao dao;

    public bookserviceimpl(BookDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Buch b) {
        return dao.save(b);
    }

    @Override
    public Buch find(int isbn) throws BookNotFoundException {

        Buch b = dao.find(isbn);

        if (b == null) {
            throw new BookNotFoundException("Book not found with ISBN : " + isbn);
        }

        return b;
    }

    @Override
    public List<Buch> list() {
        return dao.list();
    }

    @Override
    public boolean delete(int isbn) throws BookNotFoundException {

        if (dao.find(isbn) == null) {
            throw new BookNotFoundException("Book not found with ISBN : " + isbn);
        }

        return dao.delete(isbn);
    }

    @Override
    public List<Buch> findByPrice(double min, double max) {
        return dao.findByPrice(min, max);
    }

    @Override
    public List<Buch> listOrderByTitle() {

        Comparator<Buch> titleComp =
                (b1, b2) -> b1.getTitle().compareTo(b2.getTitle());

        List<Buch> list = dao.list();

        list.sort(titleComp);

        return list;
    }
}