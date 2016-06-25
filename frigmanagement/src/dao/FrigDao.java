package dao;

import java.util.List;

import entity.Frig;

public interface FrigDao {
	List<Frig> allFrigList();//显示你是所有冰箱信息
	int addFrig(Frig frig );//增加冰箱
	int deleteFrig(String zichanId);//删除冰箱
	int updateFrig(Frig frig ,String zichanId );//修改冰箱
	Frig getFrigByzichanid(String zichanid);
}
