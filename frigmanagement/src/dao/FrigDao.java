package dao;

import java.util.List;

import entity.Frig;

public interface FrigDao {
	List<Frig> allFrigList();//��ʾ�������б�����Ϣ
	int addFrig(Frig frig );//���ӱ���
	int deleteFrig(String zichanId);//ɾ������
	int updateFrig(Frig frig ,String zichanId );//�޸ı���
	Frig getFrigByzichanid(String zichanid);
}
