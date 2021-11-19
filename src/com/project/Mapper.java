package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Mapper {
	public static void main(String[] args) {
		
		Book p = new Book( 1, "phy","physics", 5,"Rc", "K.Das") ;
		Book q = new Book( 23, "che","chemistry", 6,"Lc", "S.Das") ;
		Book r = new Book( 67, "Math","Mathematics", 7,"sc", "B.pattanaik") ;
		
		List<Book> booklist = new ArrayList< >();
		
		booklist.add(p);
		booklist.add(q);
		booklist.add(r);
		
		Student bimal = new Student(2,"lula", "CSE", 6);
		Student pattanaik = new Student(4,"tiki", "EE", 1);
		Student babul = new Student(9,"Nirmal", "Civel", 2);
		
		List<Student> studentlist = new ArrayList<>();
		
		studentlist.add(bimal);
		studentlist.add(pattanaik);
		studentlist.add(babul);		
			
		Tray obj = new Tray(booklist,studentlist);
		System.out.println("obj has :" +obj.getStudents());
		System.out.println("obj has :" +obj.getUnoccupiedList());
		
			System.out.println("book name:"+p.getName());
			System.out.println("dept name:"+babul.getDept());
			System.out.println("subject name:"+r.getSub());
			
			Scanner scan = new Scanner(System.in);
			System.out.print ("Enter student id"); 
			
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("input for :");
			String input = scanner.nextLine();
			if (input.equals("book issue")) {
				System.out.println("Provide Student ID :");
				String studentId = scanner.nextLine();
				
				List<Student> studentrep = obj.getStudents();
				if(studentrep == null) {
				continue;
			}
				List<Book> bookrep = obj.getBook();
				if(bookrep.count < 3) {
					System.out.println("Provide Book Name :");
					String bookname = scanner.nextLine();
					
					System.out.println("Provide Auther name :");
					String auther = scanner.nextLine();
					
					List<Book> rep = obj.getBook();
				   obj.issuebook(studentId, bookrep, rep);
				   
				}
				
				else { 
				}
					System.out.println("rejected you have already 3 books"); 
			}
				 
				else if (input.equals("book return")){
						System.out.println("provide Student id :");
						String studentId = scanner.nextLine();
						List<Book> rep = obj.getBook();
					}else if(input.equals("close library")) {
						break;
					}
				}
		}
	
}
			      


