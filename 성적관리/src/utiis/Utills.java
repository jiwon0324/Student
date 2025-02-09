package utiis;

import java.io.FileWriter;
import java.util.Scanner;



public class Utills {
	

		private static String data;
		private static Scanner sc = new Scanner(System.in);

	
		private static final String CUR_PATH = System.getProperty("user.dir") + "/src/" + Utills.class.getPackageName()
				+ "/";
		private static final String filePath = CUR_PATH + "member.txt";

		public static int getValue(String msg, int start, int end) {
			System.out.println(msg);
			int num = sc.nextInt();
			return num;
		}
		
		
		public static void filedata(String data) {
			try (FileWriter fw = new FileWriter(filePath);){
				fw.write(data);
				System.out.println(filePath + " 파일 쓰기 성공");
			} catch (Exception e) {
				
				System.out.println(filePath + " 파일 쓰기 실패");
			}
		}
		public static String getinputvalue(String msg) {
			System.out.println(msg);
			String ids1=sc.next();
			
			return ids1;
		}
		
		
		
}
