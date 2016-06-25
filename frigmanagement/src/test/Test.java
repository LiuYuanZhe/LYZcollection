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
		//冰柜记录
//		FrigDaoImpl fdi = new FrigDaoImpl();
//		List<Frig> list = fdi.allFrigList();
//		System.out.println(list.size());
//		for (Frig frig : list) {
//			System.out.println(frig.getZichanId()+"\t"+frig.getShengchanriqi()+"\t"+frig.getChanpinxinghao());
//		}
		//测试修改
//		Date date = new Date();
//		Frig frig = new Frig(null, "我是大王");
//		int i = fdi.updateFrig(frig, "Z20131001004");
//		System.out.println(i);
		//测试删除
//		int i = fdi.deleteFrig("Z20131001004");
//		System.out.println(i);
		//测试添加
//		Frig frig = new Frig("Z20131001004", null, "小妖精");
//		int i = fdi.addFrig(frig);
//		System.out.println(i);
		
		
		//扫描记录
		//显示所有扫描记录
		ScannerRecordDaoImpl sdi = new ScannerRecordDaoImpl();
//		List<ScannerRecord> srlist = sdi.allScannerRecord();
//		System.out.println(srlist.size());
//		for (ScannerRecord sr : srlist) {
//			System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
//		}
		
		//根据资产id获取scannerrecord对象
//		ScannerRecord sr = sdi.selectScannerRecord("Z20131001003");
//		System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
		
//		ScannerRecord sr = sdi.selectScannerRecord(1);
//		System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
		
		//添加扫描记录
//		ScannerRecord sr = new ScannerRecord("Z20131001004", "lalala", null, 0, 0, "北方", null, null, null);
//		int i = sdi.addScannerRecord(sr);
//		System.out.println(i);
		
		//修改扫描记录
//		ScannerRecord sr = new ScannerRecord("Z20131001004", "lalala", null, 0, 0, "北方", null, null, null);
//		int i = sdi.updateScannerRecord(sr, 4);
//		System.out.println(i);
		
		//删除记录
//		int i = sdi.deleteScannerRecord(4);
//		System.out.println(i);
		
		//根据资产id获取记录列表,过滤列表用
//		List<ScannerRecord> list = sdi.ScannerRecordByzichanId("Z20131001003");
//		System.out.println(list.size());
//		for (ScannerRecord sr : list) {
//			System.out.println(sr.getZichanId()+"\t"+sr.getScannerId()+"\t"+sr.getGPSAddress()+"\t"+sr.getFrig().getShengchanriqi()+"\t"+sr.getFrig().getChanpinxinghao());
//		}
	}

}
