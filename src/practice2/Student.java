package practice2;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {

		return studentNum; //비교할 대상의 해시코드값. 아래 equals의 리턴값과 관련있음.
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student student = (Student) obj;
			return student.studentNum == studentNum;
		} else {
			return false;
		}

	}

}
