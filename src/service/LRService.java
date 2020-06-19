package service;

import utils.User;
import dao.LRDao;

public class LRService {
    
	public int Login(String username,String password)
	{
		return LRDao.Login(username,password);
	}

	public boolean Register(User user) {
		// TODO Auto-generated method stub
		return LRDao.Register(user);
	}
}
