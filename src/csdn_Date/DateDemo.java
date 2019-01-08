package csdn_Date;

import java.text.*;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		// 初始化 Date 对象
	    Date date = new Date();  
	    // 使用 toString() 函数显示当前日期时间
	    System.out.println(date.toString());
	    Thread.sleep(1000*5); //系统休眠5秒
	    Date date2 = new Date();  
	    System.out.println(date2.toString());
//	    
//	    System.out.printf("%1$s %2$tB %2$td, %2$tY","Due date:", date);
//	    System.out.println( );
	    
	    //利用SimpleDateFormat自定义日期格式
	    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	    System.out.println("Current Date: " + ft.format(date));

	}
	
//	public static void main(String args[]) {
//	     // 初始化 Date 对象
//	     Date date = new Date();
//	 
//	     //c的使用  
//	    System.out.printf("全部日期和时间信息：%tc%n",date);          
//	    //f的使用  
//	    System.out.printf("年-月-日格式：%tF%n",date);  
//	    //d的使用  
//	    System.out.printf("月/日/年格式：%tD%n",date);  
//	    //r的使用  
//	    System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
//	    //t的使用  
//	    System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
//	    //R的使用  
//	    System.out.printf("HH:MM格式（24时制）：%tR",date);  
//	  }
	
//	
//	 public static void main(String args[]) {
//		 Scanner sc=new Scanner(System.in);
//		 String  time=sc.nextLine();
//	     SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
//	     String input = time.length() == 0 ? "1818-11-11" : time; //没有输入日期按照1818-11-11
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
