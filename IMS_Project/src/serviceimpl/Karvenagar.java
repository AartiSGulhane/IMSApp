package serviceimpl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.model.Batch;
import com.model.Course;
import com.model.Faculty;
import com.model.Student;
import com.serviceI.Cjc;


public class Karvenagar implements Cjc {

	List<Course>clist= new ArrayList<>();
	List<Faculty>flist= new ArrayList<>();
	List<Batch>blist= new ArrayList<>();
	List<Student>slist= new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	
	@Override
	public void addCourse()
	{
		System.out.println("Enter the no of courses to add:");
		int add= sc.nextInt();
		
		for(int i=0; i<add; i++)
		{
		Course c= new Course();
		System.out.println("Enter Id: ");
		c.setCid(sc.nextInt());
		System.out.println("Enter Name:");
		c.setCname(sc.next());
		clist.add(c);
		
	}
	}
	
	@Override
	public void viewCourse()
	{
		Iterator<Course>itr=clist.iterator();
		while(itr.hasNext())
		{
			Course ch=itr.next();
			System.out.println(ch);
		}
	}
	
	@Override
	public void addFaculty()

	{
		Faculty f= new Faculty();
		
		System.out.println("Enter id: ");
		f.setFid(sc.nextInt());
		System.out.println("Enter Name: ");
		f.setFname(sc.next());
		f.setCourse(clist.get(0));
		flist.add(f);
		System.out.println("Select any one course:");
		viewCourse();
		System.out.println("Enter cid for faculty");
		int cid=sc.nextInt();
		
		for(Course c:clist)
		{
			if(cid==c.getCid()) {
				f.setCourse(c);
				break;
			}else {
				System.out.println("Not a match");
			}
		}
		flist.add(f);
		
	}
	
	@Override
	public void viewFaculty()
	{
		Iterator<Faculty>itr=flist.iterator();
		while(itr.hasNext())
		{
			Faculty fa= itr.next();
			System.out.println(fa);
		}
	}

	@Override
	public void addBatch() {
		Batch b= new Batch();
		System.out.println("Enter Id: ");
		b.setBid(sc.nextInt());
		System.out.println("Enter Name");
		b.setBname(sc.next());
		b.setFaculty(flist.get(0));
		blist.add(b);
		
	}

	@Override
	public void viewBatch() {
		Iterator<Batch>itr= blist.iterator();
		while(itr.hasNext())
		{
			Batch ba=itr.next();
			System.out.println(ba);
		}
		
	}

	@Override
	public void addStudent() {
		Student s= new Student();
		System.out.println("Enter Id: ");
		s.setSid(sc.nextInt());
		System.out.println("Enter Name: ");
		s.setSname(sc.next());
		s.setBatch(blist.get(0));
		slist.add(s);
	}

	@Override
	public void viewStudent() {
		Iterator<Student>itr=slist.iterator();
		while(itr.hasNext())
		{
			Student st=itr.next();
			System.out.println(st);
		}
		
	}



}
