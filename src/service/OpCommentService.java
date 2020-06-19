package service;

import java.util.ArrayList;

import dao.OpCommentDao;
import utils.Comment;

public class OpCommentService {

	public static boolean AddCom(Comment comment) {
		// TODO Auto-generated method stub
		
		return OpCommentDao.AddCom(comment);
	}

	public static ArrayList<Comment> GetCom() {
		// TODO Auto-generated method stub
		return OpCommentDao.GetCom();
	}

	public static ArrayList<Comment> GetComWithuid(int intValue) {
		// TODO Auto-generated method stub
		return OpCommentDao.GetComWithuid(intValue);
	}

	public static ArrayList<Comment> GetComWithbid(int intValue) {
		// TODO Auto-generated method stub
		return OpCommentDao.GetComWithbid(intValue);
	}

	public static boolean Delcom(int intValue) {
		// TODO Auto-generated method stub
		return OpCommentDao.Delcom(intValue);
	}
     
}
