package csdn_Date;

import java.text.*;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		// ��ʼ�� Date ����
	    Date date = new Date();  
	    // ʹ�� toString() ������ʾ��ǰ����ʱ��
	    System.out.println(date.toString());
	    Thread.sleep(1000*5); //ϵͳ����5��
	    Date date2 = new Date();  
	    System.out.println(date2.toString());
//	    
//	    System.out.printf("%1$s %2$tB %2$td, %2$tY","Due date:", date);
//	    System.out.println( );
	    
	    //����SimpleDateFormat�Զ������ڸ�ʽ
	    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	    System.out.println("Current Date: " + ft.format(date));

	}
	
//	public static void main(String args[]) {
//	     // ��ʼ�� Date ����
//	     Date date = new Date();
//	 
//	     //c��ʹ��  
//	    System.out.printf("ȫ�����ں�ʱ����Ϣ��%tc%n",date);          
//	    //f��ʹ��  
//	    System.out.printf("��-��-�ո�ʽ��%tF%n",date);  
//	    //d��ʹ��  
//	    System.out.printf("��/��/���ʽ��%tD%n",date);  
//	    //r��ʹ��  
//	    System.out.printf("HH:MM:SS PM��ʽ��12ʱ�ƣ���%tr%n",date);  
//	    //t��ʹ��  
//	    System.out.printf("HH:MM:SS��ʽ��24ʱ�ƣ���%tT%n",date);  
//	    //R��ʹ��  
//	    System.out.printf("HH:MM��ʽ��24ʱ�ƣ���%tR",date);  
//	  }
	
//	
//	 public static void main(String args[]) {
//		 Scanner sc=new Scanner(System.in);
//		 String  time=sc.nextLine();
//	     SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
//	     String input = time.length() == 0 ? "1818-11-11" : time; //û���������ڰ���1818-11-11
//	     System.out.print(input + " Parses as "); 
//	     Date t; 
//	     try { 
//	         t = ft.parse(input); 
//	         System.out.println(t); 
//	     } catch (ParseException e) { 
//	         System.out.println("Unparseable using " + ft); 
//	     }
//	  }
	

}
