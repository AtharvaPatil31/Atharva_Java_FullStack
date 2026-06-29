package com.atharva.service;

import java.util.List;

import com.atharva.Pojo.Buch;

public class BookServiceImpl implements BookService {

	@Override
	public boolean save(Buch b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Buch find(int isbn) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buch> list() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public boolean delete(int isbn) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Buch> findByPrice(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

}
