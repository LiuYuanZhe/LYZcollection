package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.FrigDao;
import entity.Frig;

public class FrigDaoImpl extends BaseDao implements FrigDao{

	//查看全部冰柜信息
	@Override
	public List<Frig> allFrigList() {
		// TODO Auto-generated method stub
		String sql = "select zichanid,scrq,cpxh from frig";
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			List<Frig> list = new ArrayList<Frig>();
			while(rs.next()){
				Frig frig = new Frig();
				frig.setZichanId(rs.getString("zichanid"));
				frig.setShengchanriqi(rs.getDate("scrq"));
				frig.setChanpinxinghao(rs.getString("cpxh"));
				list.add(frig);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			closeAll();
		}
	}

	//增加冰柜
	@Override
	public int addFrig(Frig frig) {
		// TODO Auto-generated method stub
		String sql = "insert into frig(zichanid,scrq,cpxh)values(?,?,?)";
		List<Object> list = new ArrayList<Object>();
		list.add(frig.getZichanId());
		list.add(frig.getShengchanriqi());
		list.add(frig.getChanpinxinghao());
		return executeAllsql(list, sql);
	}

	//删除冰柜
	@Override
	public int deleteFrig(String zichanId) {
		// TODO Auto-generated method stub
		String sql = "delete from frig where zichanid=?";
		List<Object> list = new ArrayList<Object>();
		list.add(zichanId);
		return executeAllsql(list, sql);
	}

	//修改冰柜信息
	@Override
	public int updateFrig(Frig frig, String zichanId) {
		// TODO Auto-generated method stub
		String sql = "update frig set scrq=?,cpxh=? where zichanid=?";
		List<Object> list = new ArrayList<Object>();
		list.add(frig.getShengchanriqi());
		list.add(frig.getChanpinxinghao());
		list.add(zichanId);
		return executeAllsql(list, sql);
	}

	@Override
	public Frig getFrigByzichanid(String zichanid) {
		// TODO Auto-generated method stub
		String sql = "select zichanid,scrq,cpxh from frig where zichanid=?";
		conn = getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, zichanid);
			rs = ps.executeQuery();
			Frig frig = new Frig();
			while(rs.next()){
				frig.setZichanId(rs.getString("zichanid"));
				frig.setShengchanriqi(rs.getDate("scrq"));
				frig.setChanpinxinghao(rs.getString("cpxh"));
			}
			return frig;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			closeAll();
		}
	}


}
