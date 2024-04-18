package com.Stream.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentStreamApi {

	public static void main(String[] args) {

		List<Student> stuObj = new ArrayList<>();

		Address permObj1 = new Address("2/238", "middle street", "Thanjavur", "Tamilnadu", "613504");
		Address permObj2 = new Address("1/155", "west street", "Trichy", "Tamilnadu", "612541");
		Address permObj3 = new Address("3/108", "north street", "Erode", "Tamilnadu", "622103");
		Address permObj4 = new Address("101-A", "avalanch street", "Salem", "Tamilnadu", "654102");

		Address tempObj1 = new Address("101-A", "Kalaingar street", "Kumbakonam", "Tamilnadu", "615478");
		Address tempObj2 = new Address("202-BA", "Rahman nagar", "Pazhani", "Tamilnadu", "624562");
		Address tempObj3 = new Address("15th -A", "middle street", "Namakkal", "Tamilnadu", "502145");
		Address tempObj4 = new Address("101-A", "avalanch street", "Salem", "Tamilnadu", "654102");

		Subject semI = new Subject("82", "95", "96", "85", "75");
		Subject semII = new Subject("98", "55", "42", "89", "63");
		Subject semIII = new Subject("75", "75", "65", "52", "98");
		Subject semIV = new Subject("65", "50", "89", "41", "54");

		List<Subject> sem1 = new ArrayList<Subject>();
		List<Subject> sem2 = new ArrayList<Subject>();
		List<Subject> sem3 = new ArrayList<Subject>();
		List<Subject> sem4 = new ArrayList<Subject>();
		sem1.add(semI);
		sem2.add(semII);
		sem3.add(semIII);
		sem4.add(semIV);

		List<Sem> sems = new ArrayList<Sem>();
		sems.add(new Sem(sem1, sem2, sem3, sem4));

		Student stu1 = new Student(101, "abinaya", "Computer Science", "10-05-2002", "6984578956","9654782548", Gender.female,
				permObj1, tempObj1, sem1);
		Student stu2 = new Student(102, "indhra", "Maths", "10-03-1989", "8451258965","6547852541", Gender.female, permObj2,
				tempObj2, sem2);
		Student stu3 = new Student(103, "kalai", "Physics", "09-10-1995", "7300154852","9878451256", Gender.female, permObj3,
				tempObj3, sem3);
		Student stu4 = new Student(104, "janani", "Chemistry", "10-05-2002", "7845124589","6324587412", Gender.female, permObj4,
				tempObj4, sem4);

		stuObj.add(stu1);
		stuObj.add(stu2);
		stuObj.add(stu3);
		stuObj.add(stu4);
		
		stuObj.stream().forEach((x) -> {
			System.out.println(x);
		});

		stuObj.stream().limit(3).forEach((x) -> {
			System.out.println(x.getName());
		});
		

	}

}
