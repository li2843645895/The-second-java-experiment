package javaprogram2;

import java.util.*;

public class teacher extends people {
	int number;
	//创建列表，储存各个老师信息及开授课程信息
	int teanum[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16 };
	String courses[] = { "离散数学", "C语言程序", "java", "高等数学", "大学英语", "线性代数", "机械制图", "先进成图技术", "工程制图", "python", "工程训练",
			"web程序", "数据结构", "计算机网络", "计算机组成", "软件工程", "大学物理" };
	String name[] = { "杜海", "邓棋", "蔡坤", "詹斯", "久里", "李白", "婧祎", "炎亚", "鹿康", "宋威", "华宇", "刘东", "杠云", "马化天", "刘伟", "城府",
			"康康" };
	String sex[] = { "男", "男", "女", "男", "女", "男", "女", "男", "女", "男", "男", "女", "男", "男", "女", "男", "男" };
	String place[] = { "教301", "综5162", "图书管502", "教104", "教403", "教210", "综6350", "教205", "教404", "图书馆302", "教525",
			"教302", "综6321", "教302", "教601", "综7651", "教230" };
	String classTime[]= {"周一13:00","周三15:00","周六08:00","周日14:00","周三13:15","周一09:20","周四15:20","周日13:00","周二08:00","周五18:00","周五20:00","周一19:00","周一15:00","周二15:00","周六9:00","周一15:00","周一13:00"};
	
	//在控制台上输出各个老师的信息及开课信息
	
	void selectclass() {
		//调用父类重写的toString方法
		System.out.println(toString());
		//输出老师编号
		for (int i = 0; i < teanum.length; i++) {
			System.out.print(teanum[i] + "\t" + "\t");
		}
		System.out.println();
		//输出老师姓名
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//输出老师性别
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//输出老师开授课程信息
		for (int i = 0; i < courses.length; i++) {
			System.out.print(courses[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//输出老师开设课程的授课地点
		for (int i = 0; i < place.length; i++) {
			System.out.print(place[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//输出老师开设课程的时间
		for (int i = 0; i < classTime.length; i++) {
			System.out.print(classTime[i] + "\t" + "\t");
		}
		;
		System.out.println();
	};
	
	// 重写people类的classselect方法，用户输入编号，在控制台上输出显示用户选择的老师的信息

	void classselect() {

		Scanner reader = new Scanner(System.in);
		this.number = reader.nextInt();
		switch (number) {
		case 1:
			System.out.println("老师姓名" + name[0]);
			System.out.println("性别" + sex[0]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[0]);
			break;
		case 2:
			System.out.println("老师姓名" + name[1]);
			System.out.println("性别" + sex[1]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[1]);
			break;
		case 3:
			System.out.println("老师姓名" + name[2]);
			System.out.println("性别" + sex[2]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[2]);
			break;
		case 4:
			System.out.println("老师姓名" + name[3]);
			System.out.println("性别" + sex[3]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[3]);
			break;
		case 5:
			System.out.println("老师姓名" + name[4]);
			System.out.println("性别" + sex[4]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[4]);
			break;
		case 6:
			System.out.println("老师姓名" + name[5]);
			System.out.println("性别" + sex[5]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[5]);
			break;
		case 7:
			System.out.println("老师姓名" + name[6]);
			System.out.println("性别" + sex[6]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[6]);
			break;
		case 8:
			System.out.println("老师姓名" + name[7]);
			System.out.println("性别" + sex[7]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[7]);
			break;
		case 9:
			System.out.println("老师姓名" + name[8]);
			System.out.println("性别" + sex[8]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[8]);
			break;
		case 10:
			System.out.println("老师姓名" + name[9]);
			System.out.println("性别" + sex[9]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[9]);
			break;
		case 11:
			System.out.println("老师姓名" + name[10]);
			System.out.println("性别" + sex[10]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[10]);
			break;
		case 12:
			System.out.println("老师姓名" + name[11]);
			System.out.println("性别" + sex[11]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[11]);
			break;
		case 13:
			System.out.println("老师姓名" + name[12]);
			System.out.println("性别" + sex[12]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[12]);
			break;
		case 14:
			System.out.println("老师姓名" + name[13]);
			System.out.println("性别" + sex[13]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[13]);
			break;
		case 15:
			System.out.println("老师姓名" + name[14]);
			System.out.println("性别" + sex[14]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[14]);
			break;
		case 16:
			System.out.println("老师姓名" + name[15]);
			System.out.println("性别" + sex[15]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[15]);
			break;
		case 17:
			System.out.println("老师姓名" + name[16]);
			System.out.println("性别" + sex[16]);
			System.out.println("老师编号" + number);
			System.out.println("该老师开授了" + courses[16]);
			break;
		default:
			System.out.println("输入错误");
		}
	}
}