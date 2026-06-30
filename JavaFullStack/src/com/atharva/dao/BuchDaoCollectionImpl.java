package com.atharva.dao;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.atharva.Pojo.Buch;


public class BuchDaoCollectionImpl implements BookDao  {
	
	public static void main(String[] args) throws Exception {

	    try (Stream<String> lines = Files.lines(Paths.get("src/DAODATA.txt"))) {

	        List<Buch> books = lines.filter(line -> !line.trim().isEmpty()).map(line -> {
	                    String[] record = line.split(",");
	                    return new Buch(
	                            Integer.parseInt(record[0].trim()),
	                            record[1].trim(),
	                            record[2].trim(),
	                            Integer.parseInt(record[3].trim()));
	                })
	                .collect(Collectors.toList());

	        books.forEach(System.out::println);
	    }
	}
		
		

    private List<Buch> books;

    public BuchDaoCollectionImpl() {
        books = new Vector<>();
    }

    @Override
    public boolean save(Buch b) {
        books.add(b);
        return true;
    }

    @Override
    public Buch find(int isbn) {
    	
        return books.stream().filter(b -> b.getIsbn() == isbn).findFirst().orElse(null);
//    	
//
//        for (Buch b : books) {
//            if (b.getIsbn() == isbn) {
//                return b;
//            }
//        }
//
//        return null;
    }

    @Override
    public List<Buch> list() {
        return books;
    }

    @Override
    public boolean delete(int isbn) {
    	
    	return books.removeIf(b -> b.getIsbn() == isbn);

    }

    @Override
    public List<Buch> findByPrice(double min, double max) {
    	
        return books.stream().filter(b -> b.getPrice() >= min && b.getPrice() <= max).collect(Collectors.toList());  
//
//        List<Buch> foundBooks = new Vector<>();
//
//        for (Buch b : books) {
//            if (b.getPrice() >= min && b.getPrice() <= max) {
//                foundBooks.add(b);
//            }
//        }
    	   // return foundBooks;
    }

    @Override
    public List<Buch> listOrderByTitle() {
    	

        return books.stream().sorted(Comparator.comparing(Buch::getTitle)).collect(Collectors.toList());
   	

//        books.sort(Comparator.comparing(Buch::getTitle));
//
//        return books;
    }
}