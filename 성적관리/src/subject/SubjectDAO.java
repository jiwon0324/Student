package subject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import student.Student;
import student.StudentDAO;
import utiis.Utills;



public class SubjectDAO {

	Scanner sc= new Scanner(System.in);
	Random rd= new Random();
	ArrayList<Subject> list;
	
	public void init() {
		list=new ArrayList<Subject> ();
		
	}
	
	
	public void insertSubject(Subject sub) {
		list.add(sub);
	}
	
	public void SubjectInformation(int num) {
		
	  for(Subject su:list)
		  if(su.getStuNo()==num) {
		  System.out.printf("%d %s %s점",su.getStuNo(),su.getSubName(),su.getScore());
		  }
	}
	
	public void deletSubjectBystudentNo(StudentDAO stuDAO) {
		int hackbun=Utills.getValue("학번", 1001, 1099);
		for(Subject su:list) {
			if(hackbun==su.getStuNo()) {
				
				
			}
			
		}
	}
	
	
	
	public void addSubjectToAStudnt(StudentDAO stuDAO) {
		System.out.println("ID:");
		int  stuNo=sc.nextInt();
		if(!stuDAO.isExistStuNo(stuNo)) {
			System.out.println("존재하지 않는 학번");
			return;
		}
		
		String name=Utills.getinputvalue("추가 과목:");
		
		int num=rd.nextInt(51)+50;
		
		insertSubject(new Subject(stuNo,name,num));
		System.out.println("과목 추가완");
		
	}


	
	
	
	
	
}
