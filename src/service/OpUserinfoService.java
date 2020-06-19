package service;

import java.util.ArrayList;

import dao.OpUserinfoDao;
import utils.User;

public class OpUserinfoService {

	public static User getinfo(int uid) {
		
		return OpUserinfoDao.getinfo(uid);
	}

	public boolean upDatainfo(User user) {
		// TODO Auto-generated method stub
		return OpUserinfoDao.upDatainfo(user);
	}

	public static ArrayList<User> getUsers() {
		// TODO Auto-generated method stub
		return OpUserinfoDao.GetUsers();
	}

	public boolean ModifyPass(String uid, String pw) {
		// TODO Auto-generated method stub
		return OpUserinfoDao.ModifyPass(uid,pw);
	}

	
}
