package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.ScannerRecordDao;
import entity.ScannerRecord;

public class ScannerRecordDaoImpl extends BaseDao implements ScannerRecordDao {
	
	//显示所有扫描记录
	@Override
	public List<ScannerRecord> allScannerRecord() {
		// TODO Auto-generated method stub
		String sql = "select sr.saomiaoid,f.zichanid,f.scrq,f.cpxh,sr.gpsaddress,"
				+ "sr.gpstime,sr.jingxiaoshang,sr.state,sr.beizhu1,sr.beizhu2,sr.beizhu3"
				+ " from srecord as sr inner join frig as f on sr.zichanid=f.zichanid";
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			List<ScannerRecord> list = new ArrayList<ScannerRecord>();
			while(rs.next()){
				ScannerRecord sr1 = new ScannerRecord();
				sr1.setScannerId(rs.getInt(1));
				sr1.setZichanId(rs.getString(2));
				sr1.getFrig().setShengchanriqi(rs.getDate(3));
				sr1.getFrig().setChanpinxinghao(rs.getString(4));
				sr1.setGPSAddress(rs.getString(5));
				sr1.setGPStime(rs.getDate(6));
				sr1.setJingxiaoshang(rs.getInt(7));
				sr1.setStatus(rs.getInt(8));
				sr1.setBeizhu1(rs.getString(9));
				sr1.setBeizhu2(rs.getString(10));
				sr1.setBeizhu3(rs.getString(11));
				list.add(sr1);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ScannerRecord selectScannerRecord(String zichanId) {
		// TODO Auto-generated method stub
		String sql = "select sr.saomiaoid,sr.zichanid,f.scrq,f.cpxh,sr.gpsaddress,sr.gpstime,"
				+ "sr.jingxiaoshang,sr.state,sr.beizhu1,sr.beizhu2,sr.beizhu3 "
				+ "from srecord sr inner join frig f on sr.zichanid=f.zichanid where sr.zichanid=?";
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, zichanId);
			rs = ps.executeQuery();
			ScannerRecord sr1 = new ScannerRecord();
			while(rs.next()){
				sr1.setScannerId(rs.getInt(1));
				sr1.setZichanId(rs.getString(2));
				sr1.getFrig().setShengchanriqi(rs.getDate(3));
				sr1.getFrig().setChanpinxinghao(rs.getString(4));
				sr1.setGPSAddress(rs.getString(5));
				sr1.setGPStime(rs.getDate(6));
				sr1.setJingxiaoshang(rs.getInt(7));
				sr1.setStatus(rs.getInt(8));
				sr1.setBeizhu1(rs.getString(9));
				sr1.setBeizhu2(rs.getString(10));
				sr1.setBeizhu3(rs.getString(11));
			}
			return sr1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	//添加扫描记录，资产编号必须是冰柜中存在的资产编号
	@Override
	public int addScannerRecord(ScannerRecord sr) {
		// TODO Auto-generated method stub
		String sql = "insert into srecord (zichanid,gpsaddress,gpstime,jingxiaoshang,state,beizhu1,beizhu2,beizhu3)values(?,?,?,?,?,?,?,?)";
		List<Object> list = new ArrayList<Object>();
		list.add(sr.getZichanId());
		list.add(sr.getGPSAddress());
		list.add(sr.getGPStime());
		list.add(sr.getJingxiaoshang());
		list.add(sr.getStatus());
		list.add(sr.getBeizhu1());
		list.add(sr.getBeizhu2());
		list.add(sr.getBeizhu3());
		return executeAllsql(list, sql);
	}

	//根据扫描id修改记录
	@Override
	public int updateScannerRecord(ScannerRecord sr, int saomiaoId) {
		// TODO Auto-generated method stub
		String sql = "update srecord set zichanid=?,gpsaddress=?,gpstime=?,jingxiaoshang=?,"
				+ "state=?,beizhu1=?,beizhu2=?,beizhu3=? where saomiaoid=?";
		List<Object> list = new ArrayList<Object>();
		list.add(sr.getZichanId());
		list.add(sr.getGPSAddress());
		list.add(sr.getGPStime());
		list.add(sr.getJingxiaoshang());
		list.add(sr.getStatus());
		list.add(sr.getBeizhu1());
		list.add(sr.getBeizhu2());
		list.add(sr.getBeizhu3());
		list.add(saomiaoId);
		return executeAllsql(list, sql);
	}

	@Override
	public int deleteScannerRecord(int saomiaoid) {
		// TODO Auto-generated method stub
		String sql = "delete from srecord where saomiaoid=?";
		List<Object> list = new ArrayList<Object>();
		list.add(saomiaoid);
		return executeAllsql(list, sql);
	}

	@Override
	public ScannerRecord selectScannerRecord(int saomiaoid) {
		// TODO Auto-generated method stub
		String sql = "select sr.saomiaoid,sr.zichanid,f.scrq,f.cpxh,sr.gpsaddress,sr.gpstime,"
				+ "sr.jingxiaoshang,sr.state,sr.beizhu1,sr.beizhu2,sr.beizhu3 "
				+ "from srecord sr inner join frig f on sr.zichanid=f.zichanid where sr.saomiaoid=?";
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, saomiaoid);
			rs = ps.executeQuery();
			ScannerRecord sr1 = new ScannerRecord();
			while(rs.next()){
				sr1.setScannerId(rs.getInt(1));
				sr1.setZichanId(rs.getString(2));
				sr1.getFrig().setShengchanriqi(rs.getDate(3));
				sr1.getFrig().setChanpinxinghao(rs.getString(4));
				sr1.setGPSAddress(rs.getString(5));
				sr1.setGPStime(rs.getDate(6));
				sr1.setJingxiaoshang(rs.getInt(7));
				sr1.setStatus(rs.getInt(8));
				sr1.setBeizhu1(rs.getString(9));
				sr1.setBeizhu2(rs.getString(10));
				sr1.setBeizhu3(rs.getString(11));
			}
			return sr1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ScannerRecord> ScannerRecordByzichanId(String zichanId) {
		// TODO Auto-generated method stub
		String sql = "select sr.saomiaoid,sr.zichanid,f.scrq,f.cpxh,sr.gpsaddress,sr.gpstime,"
				+ "sr.jingxiaoshang,sr.state,sr.beizhu1,sr.beizhu2,sr.beizhu3 "
				+ "from srecord sr inner join frig f on sr.zichanid=f.zichanid where sr.zichanid=?";
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, zichanId);
			rs = ps.executeQuery();
			List<ScannerRecord> list = new ArrayList<ScannerRecord>();
			while(rs.next()){
				ScannerRecord sr1 = new ScannerRecord();
				sr1.setScannerId(rs.getInt(1));
				sr1.setZichanId(rs.getString(2));
				sr1.getFrig().setShengchanriqi(rs.getDate(3));
				sr1.getFrig().setChanpinxinghao(rs.getString(4));
				sr1.setGPSAddress(rs.getString(5));
				sr1.setGPStime(rs.getDate(6));
				sr1.setJingxiaoshang(rs.getInt(7));
				sr1.setStatus(rs.getInt(8));
				sr1.setBeizhu1(rs.getString(9));
				sr1.setBeizhu2(rs.getString(10));
				sr1.setBeizhu3(rs.getString(11));
				list.add(sr1);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


}
