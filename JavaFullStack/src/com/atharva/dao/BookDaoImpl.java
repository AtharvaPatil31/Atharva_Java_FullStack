package com.atharva.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.atharva.Pojo.Buch;

public class BookDaoImpl implements BookDao {

    @Override
    public boolean save(Buch b) {

        String sql = "INSERT INTO books VALUES (?, ?, ?, ?)";

        // Write JDBC code here

        return false;
    }

    @Override
    public Optional<Buch> find(int isbn) {

        String sql = "select * from books where isbn=" + isbn;

        try {
            Connection conn = JdbcFactory.getConnection();

            ResultSet rs = conn.createStatement().executeQuery(sql);

            Buch b = null;

            if (rs.next()) {

                b = new Buch();

                b.setIsbn(rs.getInt(1));
                b.setTitle(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getDouble(4));
            }

            return Optional.ofNullable(b);

        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Buch> list() {

        String sql = "SELECT * FROM books";

        List<Buch> books = new ArrayList<Buch>();

        try {

            Connection conn = JdbcFactory.getConnection();

            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {

                Buch b = new Buch();

                b.setIsbn(rs.getInt(1));
                b.setTitle(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getDouble(4));

                books.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    @Override
    public boolean delete(int isbn) {

        String sql = "DELETE FROM books WHERE isbn = ?";

        try {

            Connection conn = JdbcFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, isbn);

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Buch> findByPrice(double min, double max) {

        String sql = "SELECT * FROM books WHERE price BETWEEN ? AND ?";

        List<Buch> books = new ArrayList<>();

        try {

            Connection conn = JdbcFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDouble(1, min);
            ps.setDouble(2, max);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Buch b = new Buch();

                b.setIsbn(rs.getInt(1));
                b.setTitle(rs.getString(2));
                b.setPrice(rs.getDouble(4));

                books.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    @Override
    public List<Buch> listOrderByTitle() {

        String sql = "SELECT * FROM books ORDER BY title";

        List<Buch> books = new ArrayList<>();

        try {

            Connection conn = JdbcFactory.getConnection();

            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {

                Buch b = new Buch();

                b.setIsbn(rs.getInt(1));
                b.setTitle(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getDouble(4));

                books.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }
}