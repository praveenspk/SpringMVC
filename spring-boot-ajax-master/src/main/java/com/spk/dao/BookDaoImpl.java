package com.spk.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spk.dto.Book;

public class BookDaoImpl implements BookDao {

	private static final String GET_RECORD = "SELECT ISBN,BOOKNAME,AUTHOR,PRICE,PUBLICATION FROM BOOKDETAILS";
	@Resource
	private JdbcTemplate jt;

	@Override
	public List<Book> getAllBooks() {
		List<Book> book = jt.query(GET_RECORD, new BookRowMapper());
		return book;
	}

	private class BookRowMapper implements RowMapper<Book> {

		public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
			Book bookStore = new Book(rs.getString(0), rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
			return bookStore;
		}
	}

}
