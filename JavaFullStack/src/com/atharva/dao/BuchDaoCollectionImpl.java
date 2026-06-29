package com.atharva.dao;

import java.util.List;
import java.util.Vector;

import com.atharva.Pojo.Buch;

public class BuchDaoCollectionImpl implements BookDao {
	
	private List<Buch> books;
	
	public BuchDaoCollectionImpl() {
		books = new Vector<Buch>();
	}

	@Override
	public boolean save(Buch b) {
		books.add(b);
		return false;
	}
	
	@Override
	public List<Buch> list() {
		return books;
	}

	@Override
	public Buch find(int isbn) {
		for(Buch b : books) {
			if(b.getIsbn()==isbn) {
				return b;
			}
		}
				
		return null;
	}

	@Override
	public boolean delete(int isbn) {
		for(Buch b : books) {
			if(b.getIsbn()==isbn) {
				books.remove(b);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public List<Buch> findByPrice(double min, double max) {
		List<Buch> foundBooks = new Vector<Buch>();
		
		for(Buch b : books) {
			if(b.getPrice()>=min && b.getPrice()<=max) {
				foundBooks.add(b);
				
			}
			return foundBooks;
		}
		return null;
	}

}
