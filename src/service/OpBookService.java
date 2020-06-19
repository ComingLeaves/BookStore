package service;

import java.util.ArrayList;

import dao.OpBookDao;
import utils.Book;

public class OpBookService {


	public Book GetBookDetils(int bid) {
		// TODO Auto-generated method stub
		return OpBookDao.GetBookDetils(bid);
	}

	public static ArrayList<Book> getCatagoryBook(String catagory,int page) {
		// TODO Auto-generated method stub
		return OpBookDao.GetCatagoryBook(catagory,page);
	}

	public static ArrayList<Book> getBook(int page) {
		// TODO Auto-generated method stub
		return OpBookDao.GetBook(page);
	}

	public static boolean AddBook(Book book) {
		// TODO Auto-generated method stub
		return OpBookDao.AddBook(book);
	}

	public static boolean DeleteBook(int bid) {
		// TODO Auto-generated method stub
		return OpBookDao.DeleteBook(bid);
	}

	public static boolean upBook(Book book) {
		// TODO Auto-generated method stub
		return OpBookDao.UpBook(book);
	}

	public static ArrayList<Book> GetRecomBook() {
		// TODO Auto-generated method stub
		return OpBookDao.GetRecomBook();
	}

}
