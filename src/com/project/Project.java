package com.project;

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		char r;
	       
	      do {
			System.out.println("------LIBRARY MANAGEMENT SYSTEM------");
			System.out.println("Press 1 to add book");
			System.out.println("Press 2 to issued a book");
			System.out.println("Press 3 to return a book");
			System.out.println("Press 4 to print complete issue details");
			System.out.println("Press 5 to exit");
		
	Scanner obj1 = new Scanner(System.in);
			int x = obj1.nextInt();
	 	
	switch(x) {
			case 1:
				Library aa = new Library();
				aa.add();
				break;
			case 2:
				Library bb = new Library();
				bb.iss();
				break;
			case 3:
				Library cc = new Library();
				cc.ret();
				break;
			case 4:
				Library dd = new Library();
				dd.details();
				break;
			case 5:
				Library ee = new Library();
				ee.exit();
				break;
				default:
					System.out.println("Invalid number");
			}
			
		    System.out.println("You want to select next option Y/N");
		    r = obj1.next().charAt(0);
			}while(r=='y' || r=='Y');

		    if(r=='n' || r=='N') {
		    	Library z = new Library();
		    	z.exit();
	  }	
	 }
	}
	 class Library {
		static String str, b, d;
		static int a, c;
		
		void add() {
			System.out.println("Enter Book_name, Price and Book_no");
			Scanner obj2 = new Scanner(System.in);
			String str = obj2.nextLine();
			float price = obj2.nextFloat();
			int bookno = obj2.nextInt();
			System.out.println("Your details is " + str + price + bookno);
		}
	 void iss() {
			Scanner obj3 = new Scanner(System.in);
			System.out.println("Book Name");
			str = obj3.nextLine();
			System.out.println("Book Id");
			a = obj3.nextInt();
			obj3.nextLine();
			System.out.println("Issue Date");
			b = obj3.nextLine();
			System.out.println("Total number of book issued");
			c = obj3.nextInt();
			obj3.nextLine();
			System.out.println("Return book date");
			d = obj3.nextLine();
		}
	int getid() {
			return a;
		}
		
		
		void ret() {
			System.out.println("Enter Student_name & Book_id");
			Scanner obj4 = new Scanner(System.in);
			String stuName = obj4.nextLine();
			int bookId = obj4.nextInt();
			if(a == bookId) {
				System.out.println("Total Details");
				System.out.println("Book Name: " + Library.str);
				System.out.println("Book Id: " + Library.a);
				System.out.println("Issue Date: " + Library.b);
				System.out.println("Total number of book issued: " + Library.c);
				System.out.println("Return book date: " + Library.d);
				
			}else {
				System.out.println("Wrong id, please enter correct id");
			}
		}
	 void details() {
			System.out.println("Book Name: " + Library.str);
			System.out.println("Book Id: " + Library.a);
			System.out.println("Issue Date: " + Library.b);
			System.out.println("Total number of book issued: " + Library.c);
			System.out.println("Return book date: " + Library.d);
		}
	void exit() {
			System.exit(0);
		}

}
