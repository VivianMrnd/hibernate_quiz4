package onetomany;

import java.util.Scanner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;

import entity_onetomany.PersonDetail;
import entity_onetomany.course;
import databaseutil.dbutil;

public class main {
	static Scanner input = new Scanner(System.in);
	static PersonDetail pd = new PersonDetail();
	static course crs = new course();

	public static void main(String[] args) {
		System.out.println("Please enter the following to insert details: ");
		System.out.print("Lastname: ");
		String lname = input.next();
		System.out.print("Firstname: ");
		String fname = input.next();
		System.out.print("Middlename: ");
		String mname = input.next();
		System.out.print("Age: ");
		int age = input.nextInt();
		System.out.print("Course: ");
		String cr = input.next();

		System.out.println("Do you want to add another details? y/n");
		Scanner ans = new Scanner(System.in);
		String answer = ans.nextLine();

		if(answer.equalsIgnoreCase("y")) {
			Session session1 = dbutil.getSession();
			Transaction tx1 = null;
			try {

				tx1 = session1.beginTransaction();

				pd.setLastname(lname);
				pd.setFirstname(fname);
				pd.setMiddlename(mname);
				pd.setAge(age);

				Set<course> courses = new HashSet<>();
				crs.setCourse(cr);
				courses.add(crs);

				pd.setCourses(courses);

				session1.save(pd);
				tx1.commit();
				main(args);

			}catch (Exception ex) {

				if (tx1 != null) {
					tx1.rollback();
				}

				ex.printStackTrace();
			} finally {
				session1.close();
			}


		}else if(answer.equalsIgnoreCase("n")) {
			Session session1 = dbutil.getSession();
			Transaction tx1 = null;
			try {

				tx1 = session1.beginTransaction();

				pd.setLastname(lname);
				pd.setFirstname(fname);
				pd.setMiddlename(mname);
				pd.setAge(age);

				Set<course> courses = new HashSet<>();
				crs.setCourse(cr);
				courses.add(crs);

				pd.setCourses(courses);

				session1.save(pd);
				tx1.commit();
				start();

			}catch (Exception ex) {

				if (tx1 != null) {
					tx1.rollback();
				}

				ex.printStackTrace();
			} finally {
				session1.close();
			}


		}else {
			System.out.println("invalid input, please try again");
			System.out.println("=======================================================================");
			main(args);
		}
	}

	private static void start() {
		// TODO Auto-generated method stub
		System.out.println("=======================================================================");
		System.out.println("Choose from the following:");
		System.out.println("1-update  2-delete  3-select");
		System.out.print("Enter chosen number: ");
		int num = input.nextInt();

		switch(num) {
		case 1: 
			String ch;
			String what; 
			do {	
				System.out.println("What do you want to update? (a-lastname, b-firstname, c-middlename, d-age, e-course)");
				System.out.print("Enter your choice: ");
				Scanner choice = new Scanner(System.in);
				String a = choice.nextLine();

				if(a.equalsIgnoreCase("a")) {	
					Session session1 = dbutil.getSession();
					Transaction tx1 = null;

					System.out.print("Enter the id number: ");
					int id = choice.nextInt();
					System.out.print("Enter updated value: ");
					Scanner choice1 = new Scanner(System.in);
					String val = choice1.nextLine();
				
					try {
						
						tx1 = session1.beginTransaction();
						pd = (PersonDetail) session1.get(PersonDetail.class, id);
						pd.setLastname(val);

						session1.update(pd);
						tx1.commit();
						System.out.println("---Detail updated---");

					} catch (Exception ex) {
						if (tx1 != null) {
							tx1.rollback();
						}
						System.out.println("NO DATA FOUND");
						System.out.println("=======================================================================");
						start();
						ex.printStackTrace();
					} finally {
						session1.close();
					}
				}		
				else if(a.equalsIgnoreCase("b")) {

					Session session1 = dbutil.getSession();
					Transaction tx1 = null;

					System.out.print("Enter the id number: ");
					int id = choice.nextInt();
					System.out.print("Enter updated value: ");
					Scanner choice1 = new Scanner(System.in);
					String val = choice1.nextLine();

					try {
						
						tx1 = session1.beginTransaction();
						pd = (PersonDetail) session1.get(PersonDetail.class, id);
						pd.setFirstname(val);

						session1.update(pd);
						tx1.commit();
						System.out.println("---Detail updated---");


					} catch (Exception ex) {
						if (tx1 != null) {
							tx1.rollback();
						}
						System.out.println("NO DATA FOUND");
						System.out.println("=======================================================================");
						start();
						ex.printStackTrace();
					} finally {
						session1.close();
					}
				}else if(a.equalsIgnoreCase("c")) {

					Session session1 = dbutil.getSession();
					Transaction tx1 = null;

					System.out.print("Enter the id number: ");
					int id = choice.nextInt();
					System.out.print("Enter updated value: ");
					Scanner choice1 = new Scanner(System.in);
					String val = choice1.nextLine();

					try {
						
						tx1 = session1.beginTransaction();
						pd = (PersonDetail) session1.get(PersonDetail.class, id);
						pd.setMiddlename(val);

						session1.update(pd);
						tx1.commit();
						System.out.println("---Detail updated---");


					} catch (Exception ex) {
						if (tx1 != null) {
							tx1.rollback();
						}
						System.out.println("NO DATA FOUND");
						System.out.println("=======================================================================");
						start();
						ex.printStackTrace();
					} finally {
						session1.close();
					}
				}else if(a.equalsIgnoreCase("d")) {
					Session session1 = dbutil.getSession();
					Transaction tx1 = null;

					System.out.print("Enter the id number: ");
					int id = choice.nextInt();
					System.out.print("Enter updated value: ");
					Scanner choice1 = new Scanner(System.in);
					String val = choice1.nextLine();

					try {

						int hel = Integer.parseInt(val);
						
						tx1 = session1.beginTransaction();
						pd = (PersonDetail) session1.get(PersonDetail.class, id);
						pd.setAge(hel);

						session1.update(pd);
						tx1.commit();
						System.out.println("---Detail updated---");


					} catch (Exception ex) {
						if (tx1 != null) {
							tx1.rollback();
						}
						System.out.println("NO DATA FOUND");
						System.out.println("=======================================================================");
						start();
						ex.printStackTrace();
					} finally {
						session1.close();
					}
				}else if (a.equalsIgnoreCase("e")) {	
					Session session1 = dbutil.getSession();
					Transaction tx1 = null;

					System.out.print("Enter the id number: ");
					int id = choice.nextInt();
					System.out.print("Enter updated value: ");
					Scanner choice1 = new Scanner(System.in);
					String val = choice1.nextLine();

					try {
						
						tx1 = session1.beginTransaction();
						pd = (PersonDetail) session1.get(PersonDetail.class, id);
						crs.setCourse(val);
						pd.getCourses().add(crs);
						session1.update(pd);
						tx1.commit();
						System.out.println("---Detail updated---");


					} catch (Exception ex) {
						if (tx1 != null) {
							tx1.rollback();
						}
						System.out.println("NO DATA FOUND");
						System.out.println("=======================================================================");
						start();
						ex.printStackTrace();
					} finally {
						session1.close();
					}
				}else {
					System.out.println("invalid input, please try again");
					System.out.println("=======================================================================");
					start();
				}

				System.out.print("do you still want to update? y/n: ");
				Scanner choice2 = new Scanner(System.in);
				ch = choice2.nextLine();
				if(!(ch.equalsIgnoreCase("y")||ch.equalsIgnoreCase("n"))) {
					System.out.println("---invalid input please try again---");
					System.out.println("=======================================================================");
					start();
				}

			}while(ch.equalsIgnoreCase("y"));
			System.out.println("---system closed---");
			System.exit(0);
			break;


		case 2:

			do {

				Session session1 = dbutil.getSession();
				Transaction tx1 = null;

				System.out.print("Enter the id number you want to delete: ");
				Scanner sc = new Scanner(System.in);
				int d = sc.nextInt();

				try {

					tx1 = session1.beginTransaction();
					pd = (PersonDetail) session1.get(PersonDetail.class, d);
					session1.delete(pd);
					tx1.commit();
					System.out.println("---Detail deleted---");

				} catch (Exception ex) {
					if (tx1 != null) {
						tx1.rollback();
					}
					System.out.println("NO DATA FOUND");
					start();
					ex.printStackTrace();
				} finally {
					session1.close();
				}

				System.out.println("Do you still want to delete? y/n");
				Scanner an = new Scanner(System.in);
				what = an.nextLine();
				if(!(what.equalsIgnoreCase("y")||what.equalsIgnoreCase("n"))) {
					System.out.println("---invalid input please try again---");
					System.out.println("=======================================================================");
					start();
				}
			}while(what.equalsIgnoreCase("y"));
			System.out.println("---System closed---");
			System.exit(0);
			break;

		case 3: 

			Session session1 = dbutil.getSession();

			session1 = dbutil.getSession();

			System.out.print("Please input the id number you want to select: ");
			Scanner sc1 = new Scanner(System.in);
			int select = sc1.nextInt();
			try {
				
				Query query = session1.createSQLQuery("select * from persondetail where Id = :Id");
				query.setParameter("Id", select);

				query.setResultTransformer(Transformers.aliasToBean(PersonDetail.class));

				pd = (PersonDetail) query.uniqueResult();
				
				List<PersonDetail> personlist = query.list();

				for(PersonDetail persons: personlist) {
					System.out.println("Persons id: " + persons.getId());
					System.out.println("Last Name: " + persons.getLastname());
					System.out.println("First Name: " + persons.getFirstname());
					System.out.println("Middle Name: " + persons.getMiddlename());
					System.out.println("Age: " + persons.getAge());
					System.out.println("=============================================================================");
					System.out.println("Program re-running please wait...");
					System.out.println("=============================================================================");
				}
				Thread.sleep(2000);
				main(null); //re run the program

			} catch (Exception ex) {
				System.out.println("---NO DATA FOUND---");
				start();
				ex.printStackTrace();
			} finally {
				session1.close();
			}

			break;

		default:
			System.out.println("Invalid input, please try again...");
			start();
		}
	}

}
