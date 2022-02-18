package practice2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용권"));
		set.add(new Student(1,"조민우"));

		Iterator<Student> it =  set.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println(student.studentNum + ":"+student.name);
			}
	}

}
