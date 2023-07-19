package problems;

import java.util.Scanner;

public class TestQ01 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void inputData() { //입력
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름: ");
		name=input.next();
		System.out.print("국어 점수: ");
		kor=input.nextInt();
		System.out.print("영어 점수: ");
		eng=input.nextInt();
		System.out.print("수학 점수: ");
		math=input.nextInt();
	}
	
	public void sumFunc() { //총점
		
		sum = kor+eng+math;
		
		
		
	}
	
	public void avgFunc() { //평균
		
		avg=sum/3;
		
		
	}
	
	public void gradeFunc() { //등급
		
		if(avg>=90) {
			grade="A";
		}else if(avg>=80 && avg<90) {
			grade="B";
		}else if(avg>=70 && avg<80) {
			grade="c";
		}
		
		
	}
	
	public void print() {
		
		System.out.println(name);
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("등급: "+grade);
	}
	
	
	
	
}//class
