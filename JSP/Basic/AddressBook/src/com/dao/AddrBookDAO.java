package com.dao;

import java.util.ArrayList;

public class AddrBookDAO {
	private ArrayList<AddrBook> addrList = new ArrayList<AddrBook>();
	
	//�ּ� �߰�(���)
	
	public void addAddress(AddrBook addrBook) {
		addrList.add(addrBook);
	}
	
	//�ּ� ���(��ü)
	public ArrayList<AddrBook> getListAll(){
		return addrList;
	}

}
