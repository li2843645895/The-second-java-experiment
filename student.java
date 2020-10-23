package javaprogram2;

import java.util.*;

public class student extends people {
	student(){};
	//创造子类构造方法，用来调用父类people的构造方法
	student(int year){
		super(year);
	};
	int number;
	//创建整型变量stop用来记录用户输入密码的次数
	int stop;
	// 重寫classselect方法
	void classselect() {
		Login login = new Login();
		//创建列表，将学生信息存在其中
		String name[] = { "小明", "张飞", "刘翔", "李俊", "张华", "景驰", "泰宇", "刘志", "欧阳艄公", "李回回" };
		String sex[] = { "男", "女", "男", "女", "男", "男", "女", "男", "女", "男" };
		//用户输入其标编号，若编号存在，则输入密码，若不存在，则重新输入，可以无限次的输入
		int time = 0;
		while (time == 0) {
			System.out.println("请输入您的编号（编号为大于等于零的数字）：");
			Scanner readerone = new Scanner(System.in);
			this.number = readerone.nextInt();
			if (number < 0 || number >= login.studentaccount.length) {
				System.out.println("不能找到该编号信息学生,请重新输入!");
				time = 0;
			} else if (number == login.studentaccount[number]) {
				time = 1;
			}
		}
		//当用户编号输入正确是，开始输入密码，记录次数
		int time1 = 0;
		while (time1 == 0) {
			System.out.println("请输入您的密码(由数字组成)：");
			Scanner readertwo = new Scanner(System.in);
			int password = readertwo.nextInt();
			if (password == login.password[number]) {
				System.out.println("登录成功，成功进入学生选课系统");
				//显示学生信息
				switch (number) {
				case 0:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 1:
					System.out.println("你好：：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 2:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("编号：" + number);
					break;
				case 3:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 4:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 5:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 6:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 7:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 8:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				case 9:
					System.out.println("你好：" + name[number]);
					System.out.println("您的性别是：" + sex[number]);
					System.out.println("您的编号是：" + number);
					break;
				default:
					System.out.print("输入错误");

				};
				time1 = 1;
			} else {
			//当次数超过五次，则不能再输入
				if(stop >= 5) {
					break;};
				System.out.println("密码错误请重新输入");
				time1 = 0;
				stop++;
			}
		}
		
	};
	//若学生选课成功，则打印学生选择课程信息
	void getclass() {
		teacher T = new teacher();
		Scanner readerthree = new Scanner(System.in);
		 int studentclass = readerthree.nextInt();
		 super.classselect();
		 System.out.println("你选择的是"+T.name[studentclass]+"老师的"+T.courses[studentclass]+"课程");
		 System.out.println("上课地点在"+T.place[studentclass]);
		 System.out.println("上课时间为"+T.classTime[studentclass]);
	};
	//创建方法用来打印学生选择课程信息
	void getclass1(int t) {
		teacher T = new teacher();
		//调用父类被覆盖的classselect()方法
		super.classselect();
		 System.out.println("你选择的是"+T.name[t]+"老师的"+T.courses[t]+"课程");
		 System.out.println("上课地点在"+T.place[t]);
		 System.out.println("上课时间为"+T.classTime[t]);
		 
	};
}