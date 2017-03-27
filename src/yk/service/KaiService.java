package yk.service;

import yk.bean.KaiBean;
import yk.dao.KaiDao;

public class KaiService {
	private KaiBean kaiBean;
	private KaiDao kaiDao;

	public KaiDao getKaiDao() {
		return kaiDao;
	}

	public void setKaiDao(KaiDao kaiDao) {
		this.kaiDao = kaiDao;
	}

	public KaiBean getKaiBean() {
		return kaiBean;
	}

	public void setKaiBean(KaiBean kaiBean) {
		this.kaiBean = kaiBean;
	}
	
	public void marryWho(String herName){
		kaiBean.setName(herName);
		System.out.println(kaiBean.getName());
	}
	public void insert(){
		kaiDao.insert("tx");
		kaiDao.insert("tx1");
//		throw new RuntimeException("tx..");
	}

}
