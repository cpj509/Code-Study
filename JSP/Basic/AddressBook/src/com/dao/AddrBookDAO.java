package com.dao;

import java.util.ArrayList;

public class AddrBookDAO {
	private ArrayList<AddrBook> addrList = new ArrayList<AddrBook>();
	
	//주소 추가(멤버)
	
	public void addAddress(AddrBook addrBook) {
		addrList.add(addrBook);
	}
	
	//주소 목록(전체)
	public ArrayList<AddrBook> getListAll(){
		return addrList;
	}
	
	//주소 삭제
	public void removeAddress(String username) {
		int i = 0;
		for(i = 0; i < addrList.size(); i++) {
			AddrBook addrBook = addrList.get(i);
			String dbUser = addrBook.getUsername();
			if(dbUser.equals(username))
				break;
		}
		addrList.remove(i);
	}
	
	//특정 주소 상세 보기
	public AddrBook getAbByUserName(String username) {
		AddrBook abByUsername = null;
		for(int i = 0; i < addrList.size(); i++) {
			AddrBook ab = addrList.get(i);
			String dbUser = ab.getUsername();
			if(dbUser.equals(username)) {
				abByUsername = ab;
				break;
			}
		}
		return abByUsername;
	}
}
