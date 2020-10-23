package javaprogram2;

import java.util.*;

public class SecondTest{

	public static void main(String[] args) {
		System.out.println(
				"----------------------------------欢迎来到学生学课系统--------------------------------------------");
		people A;
		people D;
		teacher B = new teacher();
		student C = new student(2023);
		A = new student();
		D = new teacher();
		C.classselect();
		//当密码输入次数超过五次是，则系统需要退出，不打印出其他信息
		if(C.stop >=5) {
			System.out.println("警告：密码输入次数达到上限！！！！！！！！可能有非法登录————————请明天在登陆系统选课！！！");
		}else {
			//用户选择是否需要单独查询老师信息
		System.out.println("是否需要单独查询老师开课信息(点0为单独查询老师信息，点1为查询全部老师开课信息)");
		Scanner readerfour = new Scanner(System.in);
		int findinf = readerfour.nextInt();
		//用户选择需要查询的老师的信息，若不需要，则打印老师信息，并让用户选择需要选修的课程
		if (findinf == 0) {
			System.out.println("请输入老师编号：");
			B.classselect();
			//用户选择是否选择查询老师的课程
			System.out.println("是否选择该老师课程(1为是，0为否)");
			Scanner readerfive = new Scanner(System.in);
			int selectcourse = readerfive.nextInt();
			//是则选课成功，打印已选择课程的信息
			if (selectcourse == 1) {
				teacher T = new teacher();
				System.out.println(
						"-------------------------------------------选课成功！-----------------------------------------------");
				System.out.println("你选择的是" + T.name[B.number] + "老师的" + T.courses[B.number] + "课程");
				System.out.println("上课地点在" + T.place[B.number]);
			} else if (selectcourse == 0){
				//否则打印各个老师开课的信息，并选择想选择老师的编号
				B.selectclass();
				System.out.println("请输入您想选修的课程老师编号：");
				C.getclass();
			}
			;
		} else if (findinf == 1) {
			System.out.println("以下是各个老师及所开课程信息:");
			B.selectclass();
			System.out.println("请输入您想选修的课程老师编号：");
			C.getclass();
		}
		;
	}
	}
}
