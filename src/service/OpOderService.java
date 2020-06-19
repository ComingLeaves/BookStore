package service;

import java.util.ArrayList;

import dao.OpOderDao;
import utils.order;

public class OpOderService {

	public static ArrayList<order> GetOders() {
		// TODO Auto-generated method stub
		return OpOderDao.GetOders();
	}

	public static order GetOrder(String oid) {
		// TODO Auto-generated method stub
		return OpOderDao.GetOrder(oid);
	}

	public static boolean DelOrder(String oid) {
		// TODO Auto-generated method stub
		return OpOderDao.DelOrder(oid);
	}

}
