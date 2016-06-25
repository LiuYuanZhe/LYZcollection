package servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.Paging;
import dao.impl.FrigDaoImpl;
import dao.impl.ScannerRecordDaoImpl;
import entity.Frig;
import entity.ScannerRecord;

public class FrigMServlet extends HttpServlet {
	boolean flag = false;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		String url = "";
		try {
			Method method = this.getClass().getDeclaredMethod
					(action, new Class[]{HttpServletRequest.class,HttpServletResponse.class});
			url = (String) method.invoke(this, new Object[]{request,response});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	/*
	 * ****************************************************************************************
	 * */
	//扫描记录
	public String allScannerRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		List<ScannerRecord> list = srdi.allScannerRecord();
		request.setAttribute("srlist", list);
		System.out.println("test    srlist"+list.size());
		return "scannermanager.jsp";
	}
	
	//删除记录
	public String deleteRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		int recordId = Integer.parseInt(request.getParameter("scannerid"));
		System.out.println("recordid:"+recordId);
		int i = srdi.deleteScannerRecord(recordId);
		System.out.println("deletevalues"+i);
		return "frigment?action=allScannerRecord";
	}
	//获得单条记录
	public String getOneRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		int recordId = Integer.parseInt(request.getParameter("scannerid"));
		ScannerRecord srecord = srdi.selectScannerRecord(recordId);
		request.setAttribute("srecord", srecord);
		System.out.println(srecord.getScannerId()+srecord.getFrig().getChanpinxinghao());
		return "updatescanner.jsp";
	}
	//修改记录
	public String updateRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		int recordId = Integer.parseInt(request.getParameter("scannerid"));//获得页面的扫描id
		String zichanid = request.getParameter("zichanId");//获取资产id
		//Date shengchanriqi = Timestamp.valueOf(request.getParameter("shengchanriqi"));//获取生产日期
		String chanpinxinghao = request.getParameter("chanpinxinghao");//获取产品型号
		String GPSAddress = request.getParameter("GPSAddress");//获取gps扫描地址
		Date GPSTime = Timestamp.valueOf(request.getParameter("GPStime"));//获取gps扫描时间
		int jingxiaoshang = Integer.parseInt(request.getParameter("jingxiaoshang"));//获取经销商
		int states = Integer.parseInt(request.getParameter("status"));//获取状态 0是良好 1是损坏
		String beizhu1 = request.getParameter("beizhu1");
		String beizhu2 = request.getParameter("beizhu2");
		String beizhu3 = request.getParameter("beizhu3");
		Frig frig = new Frig(zichanid, null, chanpinxinghao);
		ScannerRecord sr = new ScannerRecord(zichanid, GPSAddress,GPSTime, jingxiaoshang, states, beizhu1, beizhu2, beizhu3,frig);//构造记录对象
		int i = srdi.updateScannerRecord(sr, recordId);//修改
		System.out.println("Test:"+i);//如果i为1，修改成功
		if(i>0)
		return "frigment?action=allScannerRecord";//跳转回全部记录页面
		else
			return "";
	}
	
	//管理员增加记录了，增加的资产编号必须时候冰箱已经有的编号
	public String addRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		String zichanid = request.getParameter("zichanId");//获取资产id 
		Date shengchanriqi = Timestamp.valueOf(request.getParameter("shengchanriqi"));//获取生产日期
		String chanpinxinghao = request.getParameter("chanpinxinghao");//获取产品型号
		String GPSAddress = request.getParameter("GPSAddress");//获取gps扫描地址
		Date GPSTime = Timestamp.valueOf(request.getParameter("GPStime"));//获取gps扫描时间
		int jingxiaoshang = Integer.parseInt(request.getParameter("jingxiaoshang"));//获取经销商
		int states = Integer.parseInt(request.getParameter("status"));//获取状态 0是良好 1是损坏
		String beizhu1 = request.getParameter("beizhu1");
		String beizhu2 = request.getParameter("beizhu2");
		String beizhu3 = request.getParameter("beizhu3");
		Frig frig = new Frig(zichanid, (java.sql.Date)shengchanriqi, chanpinxinghao);
		ScannerRecord sr = new ScannerRecord(zichanid, GPSAddress, (java.sql.Date)GPSTime, jingxiaoshang, states, beizhu1, beizhu2, beizhu3,frig);//构造记录对象
		int i = srdi.addScannerRecord(sr);
		System.out.println("输出测试增加记录:"+i);
		if(i>0)return "frigment?action=allScannerRecord";
		else return "";
	}
	//过滤搜索 根据搜索框输入资产编号查询出
	public String searchRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String zichanId = request.getParameter("searchId");
		System.out.println("测试拿出来的zichanID是什么："+zichanId);
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		List<ScannerRecord> list = srdi.ScannerRecordByzichanId(zichanId);
		request.setAttribute("guolvlist", list);
		System.out.println(list.size());
		return "specialscanner.jsp";
	}
	
	
	
	/*
	 * ****************************************************************************************
	 * */
	//冰箱部分操作 增删改显示
	
	
	//根据输入frigment?action=allFrig映射获取action进入现实全部冰箱列表
	public String allFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FrigDaoImpl fdi = new FrigDaoImpl();
		List<Frig> friglist = fdi.allFrigList();
		int allpages = friglist.size()/3;//每页显示三条数据，总页数
		if(friglist.size()%3!=0){
			allpages++;
		}
		System.out.println("ttttt allpages:"+allpages);
		request.setAttribute("allPages", allpages);
		int i =1;
		if(flag){
			i = Integer.parseInt(request.getParameter("yeshu"));//从页面获得页数
		}
		System.out.println("ttttt i:"+i);
		request.setAttribute("curPage", i);
		Paging pag = new Paging();
		List playList = pag.getpageList(3, i, friglist);
		request.setAttribute("friglist", playList);
		System.out.println(friglist.size()+"TESTasdadasdasd");
		return "frigmanager.jsp";
	}
	
	public String addFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FrigDaoImpl fdi = new FrigDaoImpl();
		String zichanbianhao = request.getParameter("zichan");
		Date shengchanriqi = Timestamp.valueOf(request.getParameter("shengchanriqi"));
		String chanpinxinghao = request.getParameter("chanpinxinghao");
		Frig frig = new Frig(zichanbianhao, shengchanriqi, chanpinxinghao);
		int i = fdi.addFrig(frig);
		System.out.println("addfrig"+i);
		if(i>0){
			return "frigment?action=allFrig";
		}else
		return "";
	}
	//从frigmanger。jsp页面点击修改超链接进入updatefrig.jsp页面首先action=getfrig获取信息
	public String getFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String zichanid = request.getParameter("zichanid");
		FrigDaoImpl fdi = new FrigDaoImpl();
		Frig frig = fdi.getFrigByzichanid(zichanid);
		request.setAttribute("frig", frig);
		return "updatefrig.jsp";
	}
	//全部冰箱列表界面点击删除确定传入zichanid
	public String deleteFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FrigDaoImpl fdi = new FrigDaoImpl();
		String zichanId = request.getParameter("zichanid");
		int i = fdi.deleteFrig(zichanId);
		if(i>0){
			return "frigment?action=allFrig";
		}else
		return "";
	}
	//点击保存提交form表单内action的值和页面内name资产id调用frig基层方法修改数据库内数据
	//如果修改返回值为1，修改成功，跳转全部冰箱信息页面
	public String updateFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FrigDaoImpl fdi = new FrigDaoImpl();
		String zichanbianhao = request.getParameter("zichanId");
		Date shengchanriqi = Timestamp.valueOf(request.getParameter("shengchanriqi"));		
		String chanpinxinghao = request.getParameter("chanpinxinghao");
		Frig frig = new Frig(zichanbianhao,shengchanriqi, chanpinxinghao); 
		int i = fdi.updateFrig(frig, zichanbianhao);
		System.out.println("资产编号"+zichanbianhao);
		System.out.println("frig"+frig.getZichanId());
		System.out.println(i+"ttttttttttttttttttt1");
		if(i>0) return "frigment?action=allFrig";
		else return "frigment?action=allFrig";
	}

	
	
}
