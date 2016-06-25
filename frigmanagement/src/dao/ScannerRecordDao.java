package dao;

import java.util.List;

import entity.ScannerRecord;

public interface ScannerRecordDao {
	//显示所有扫描记录
	List<ScannerRecord> allScannerRecord();
	//根据资产编号查找一条
	ScannerRecord selectScannerRecord(String zichanId);
	//根据资产编号查找相应的记录
	List<ScannerRecord> ScannerRecordByzichanId(String zichanId);
	//根据扫描id查找一条
	ScannerRecord selectScannerRecord(int saomiaoid);
	//增加扫描记录
	int addScannerRecord(ScannerRecord sr);
	//修改扫描记录了
	int updateScannerRecord(ScannerRecord sr,int saomiaoId);
	//删除扫描记录
	int deleteScannerRecord(int saomiaoid);
}
