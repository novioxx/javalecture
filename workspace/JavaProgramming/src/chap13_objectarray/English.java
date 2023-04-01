package chap13_objectarray;

import chap13_objectarray.clazz.ILecture;
import chap13_objectarray.clazz.Lecture;

public class English implements ILecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecture[] lecArr = new Lecture[3];
		
		lecArr[0] = new Lecture("English", 16, 28);
		lecArr[1] = new Lecture("Mathmetics", 29, 45);
		lecArr[2] = new Lecture("Programming", 46, 51);
		
		//객체의 사용
		for(int i = 0; i < lecArr.length; i++) {
			lecArr[i].proceedLectTure();
		}
		

	}

}
