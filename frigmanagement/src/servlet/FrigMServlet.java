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
	//ɨ���¼
	public String allScannerRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		List<ScannerRecord> list = srdi.allScannerRecord();
		request.setAttribute("srlist", list);
		System.out.println("test    srlist"+list.size());
		return "scannermanager.jsp";
	}
	
	//ɾ����¼
	public String deleteRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		int recordId = Integer.parseInt(request.getParameter("scannerid"));
		System.out.println("recordid:"+recordId);
		int i = srdi.deleteScannerRecord(recordId);
		System.out.println("deletevalues"+i);
		return "frigment?action=allScannerRecord";
	}
	//��õ�����¼
	public String getOneRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		int recordId = Integer.parseInt(request.getParameter("scannerid"));
		ScannerRecord srecord = srdi.selectScannerRecord(recordId);
		request.setAttribute("srecord", srecord);
		System.out.println(srecord.getScannerId()+srecord.getFrig().getChanpinxinghao());
		return "updatescanner.jsp";
	}
	//�޸ļ�¼
	public String updateRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		int recordId = Integer.parseInt(request.getParameter("scannerid"));//���ҳ���ɨ��id
		String zichanid = request.getParameter("zichanId");//��ȡ�ʲ�id
		//Date shengchanriqi = Timestamp.valueOf(request.getParameter("shengchanriqi"));//��ȡ��������
		String chanpinxinghao = request.getParameter("chanpinxinghao");//��ȡ��Ʒ�ͺ�
		String GPSAddress = request.getParameter("GPSAddress");//��ȡgpsɨ���ַ
		Date GPSTime = Timestamp.valueOf(request.getParameter("GPStime"));//��ȡgpsɨ��ʱ��
		int jingxiaoshang = Integer.parseInt(request.getParameter("jingxiaoshang"));//��ȡ������
		int states = Integer.parseInt(request.getParameter("status"));//��ȡ״̬ 0������ 1����
		String beizhu1 = request.getParameter("beizhu1");
		String beizhu2 = request.getParameter("beizhu2");
		String beizhu3 = request.getParameter("beizhu3");
		Frig frig = new Frig(zichanid, null, chanpinxinghao);
		ScannerRecord sr = new ScannerRecord(zichanid, GPSAddress,GPSTime, jingxiaoshang, states, beizhu1, beizhu2, beizhu3,frig);//�����¼����
		int i = srdi.updateScannerRecord(sr, recordId);//�޸�
		System.out.println("Test:"+i);//���iΪ1���޸ĳɹ�
		if(i>0)
		return "frigment?action=allScannerRecord";//��ת��ȫ����¼ҳ��
		else
			return "";
	}
	
	//����Ա���Ӽ�¼�ˣ����ӵ��ʲ���ű���ʱ������Ѿ��еı��
	public String addRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		String zichanid = request.getParameter("zichanId");//��ȡ�ʲ�id 
		Date shengchanriqi = Timestamp.valueOf(request.getParameter("shengchanriqi"));//��ȡ��������
		String chanpinxinghao = request.getParameter("chanpinxinghao");//��ȡ��Ʒ�ͺ�
		String GPSAddress = request.getParameter("GPSAddress");//��ȡgpsɨ���ַ
		Date GPSTime = Timestamp.valueOf(request.getParameter("GPStime"));//��ȡgpsɨ��ʱ��
		int jingxiaoshang = Integer.parseInt(request.getParameter("jingxiaoshang"));//��ȡ������
		int states = Integer.parseInt(request.getParameter("status"));//��ȡ״̬ 0������ 1����
		String beizhu1 = request.getParameter("beizhu1");
		String beizhu2 = request.getParameter("beizhu2");
		String beizhu3 = request.getParameter("beizhu3");
		Frig frig = new Frig(zichanid, (java.sql.Date)shengchanriqi, chanpinxinghao);
		ScannerRecord sr = new ScannerRecord(zichanid, GPSAddress, (java.sql.Date)GPSTime, jingxiaoshang, states, beizhu1, beizhu2, beizhu3,frig);//�����¼����
		int i = srdi.addScannerRecord(sr);
		System.out.println("����������Ӽ�¼:"+i);
		if(i>0)return "frigment?action=allScannerRecord";
		else return "";
	}
	//�������� ���������������ʲ���Ų�ѯ��
	public String searchRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String zichanId = request.getParameter("searchId");
		System.out.println("�����ó�����zichanID��ʲô��"+zichanId);
		ScannerRecordDaoImpl srdi = new ScannerRecordDaoImpl();
		List<ScannerRecord> list = srdi.ScannerRecordByzichanId(zichanId);
		request.setAttribute("guolvlist", list);
		System.out.println(list.size());
		return "specialscanner.jsp";
	}
	
	
	
	/*
	 * ****************************************************************************************
	 * */
	//���䲿�ֲ��� ��ɾ����ʾ
	
	
	//��������frigment?action=allFrigӳ���ȡaction������ʵȫ�������б�
	public String allFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FrigDaoImpl fdi = new FrigDaoImpl();
		List<Frig> friglist = fdi.allFrigList();
		int allpages = friglist.size()/3;//ÿҳ��ʾ�������ݣ���ҳ��
		if(friglist.size()%3!=0){
			allpages++;
		}
		System.out.println("ttttt allpages:"+allpages);
		request.setAttribute("allPages", allpages);
		int i =1;
		if(flag){
			i = Integer.parseInt(request.getParameter("yeshu"));//��ҳ����ҳ��
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
	//��frigmanger��jspҳ�����޸ĳ����ӽ���updatefrig.jspҳ������action=getfrig��ȡ��Ϣ
	public String getFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String zichanid = request.getParameter("zichanid");
		FrigDaoImpl fdi = new FrigDaoImpl();
		Frig frig = fdi.getFrigByzichanid(zichanid);
		request.setAttribute("frig", frig);
		return "updatefrig.jsp";
	}
	//ȫ�������б������ɾ��ȷ������zichanid
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
	//��������ύform����action��ֵ��ҳ����name�ʲ�id����frig���㷽���޸����ݿ�������
	//����޸ķ���ֵΪ1���޸ĳɹ�����תȫ��������Ϣҳ��
	public String updateFrig(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FrigDaoImpl fdi = new FrigDaoImpl();
		String zichanbianhao = request.getParameter("zichanId");
		Date shengchanriqi = Timestamp.valueOf(request.getParameter("shengchanriqi"));		
		String chanpinxinghao = request.getParameter("chanpinxinghao");
		Frig frig = new Frig(zichanbianhao,shengchanriqi, chanpinxinghao); 
		int i = fdi.updateFrig(frig, zichanbianhao);
		System.out.println("�ʲ����"+zichanbianhao);
		System.out.println("frig"+frig.getZichanId());
		System.out.println(i+"ttttttttttttttttttt1");
		if(i>0) return "frigment?action=allFrig";
		else return "frigment?action=allFrig";
	}

	
	
}
