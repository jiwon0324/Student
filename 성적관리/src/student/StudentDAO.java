package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.security.auth.Subject;


import subject.SubjectDAO;
import utiis.Utills;



public class StudentDAO {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	

	ArrayList<Student> list;

	public void initstu() {
		list = new ArrayList<Student>();
	}
	
	public boolean isExsiData() {
		if(list.size()==0) {
			return false;
		}
		return true;
	}
	

	public void  inserttstudent(Student stu) {
		list.add(stu);
	}
	
	private int getStuIDxById(String id) {
		int idx=0;
		for(Student s: list) {
			if(id.equals(s.getStuId()))
				return idx;
			idx+=1;
		}
		return-1;
	}
	
	
	public boolean isExistStuNo(int stuNo) {
		if(!isExsiData())
			return false;
		for(Student s:list) {
			if(stuNo==s.getStuNO())
				return true;
		}
		return false;
	}
	
	
	public void addStudnt() {
	
		String id= Utills.getinputvalue("ID:");
		if(getStuIDxById(id)!=-1) {
			System.out.println("이미 존재하는 아이디");
		}
		String name=Utills.getinputvalue("이름:");
		inserttstudent(new Student(name, id));
		System.out.println("추가완");
	}
	
	
	public void printAllStdentByscore(SubjectDAO subDAO) {
		if(!isExsiData()) {
			return;
		}
		for(Student s:list) {
			
			subDAO.SubjectInformation(s.getStuNO());
	     System.out.printf("%s %s\n",s.getName(),s.getStuId());
		}
		System.out.println();
	}

	
	
}
