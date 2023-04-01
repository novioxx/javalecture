package chap13_objectarray.clazz;

public class Lecture {
	private String subject;
	private int lectureTime;
	private int studentCnt;

	
	public Lecture(String subject, int studentCnt, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt; 
		this.lectureTime = lectureTime;
		
		
		
	}
	
	public void proceedLectTure() {
		System.out.println(this.subject + "수업은"+ this.studentCnt + "명의 학생이 듣습니다.수업시간"+
					lectureTime + "분입니다.");
	}
	
	
	

}