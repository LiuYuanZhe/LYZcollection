package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dao.impl.FrigDaoImpl;
import dao.impl.ScannerRecordDaoImpl;
import entity.Frig;
import entity.ScannerRecord;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����¼
//		FrigDaoImpl fdi = new FrigDaoImpl();
//		List<Frig> list = fdi.allFrigList();
//		System.out.println(list.size());
//		for (Frig frig : list) {
//			System.out.println(frig.getZichanId()+"\t"+frig.getShengchanriqi()+"\t"+frig.getChanpinxinghao());
//		}
		//�����޸�
//		Date date = new Date();
//		Frig frig = new Frig(null, "���Ǵ���");
//		int i = fdi.updateFrig(frig, "Z20131001004");
//		System.out.println(i);
		//����ɾ��
//		int i = fdi.deleteFrig("Z20131001004");
//		System.out.println(i);
		//�������
//		Frig frig = new Frig("Z20131001004", null, "С����");
//		int i = fdi.addFrig(frig);
//		System.out.println(i);
		
		
		//ɨ���¼
		//��ʾ����ɨ���¼
		ScannerRecordDaoImpl sdi = new ScannerRecordDaoImpl();
//		List<ScannerRecord> srlist = sdi.allScannerRecord();
//		System.out.println(srlist.size());
//		for (ScannerRecord sr : srlist) {
//			System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
//		}
		
		//�����ʲ�id��ȡscannerrecord����
//		ScannerRecord sr = sdi.selectScannerRecord("Z20131001003");
//		System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
		
//		ScannerRecord sr = sdi.selectScannerRecord(1);
//		System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
		
		//���ɨ���¼
//		ScannerRecord sr = new ScannerRecord("Z20131001004", "lalala", null, 0, 0, "����", null, null, null);
//		int i = sdi.addScannerRecord(sr);
//		System.out.println(i);
		
		//�޸�ɨ���¼
//		ScannerRecord sr = new ScannerRecord("Z20131001004", "lalala", null, 0, 0, "����", null, null, null);
//		int i = sdi.updateScannerRecord(sr, 4);
//		System.out.println(i);
		
		//ɾ����¼
//		int i = sdi.deleteScannerRecord(4);
//		System.out.println(i);
		
		//�����ʲ�id��ȡ��¼�б�,�����б���
//		List<ScannerRecord> list = sdi.ScannerRecordByzichanId("Z20131001003");
//		System.out.println(list.size());
//		for (ScannerRecord sr : list) {
//			System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
//		}
	}

}
