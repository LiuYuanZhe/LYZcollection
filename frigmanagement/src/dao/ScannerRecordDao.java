package dao;

import java.util.List;

import entity.ScannerRecord;

public interface ScannerRecordDao {
	//��ʾ����ɨ���¼
	List<ScannerRecord> allScannerRecord();
	//�����ʲ���Ų���һ��
	ScannerRecord selectScannerRecord(String zichanId);
	//�����ʲ���Ų�����Ӧ�ļ�¼
	List<ScannerRecord> ScannerRecordByzichanId(String zichanId);
	//����ɨ��id����һ��
	ScannerRecord selectScannerRecord(int saomiaoid);
	//����ɨ���¼
	int addScannerRecord(ScannerRecord sr);
	//�޸�ɨ���¼��
	int updateScannerRecord(ScannerRecord sr,int saomiaoId);
	//ɾ��ɨ���¼
	int deleteScannerRecord(int saomiaoid);
}
