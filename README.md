# java-lishengxiang
java任务仓库
# java实验报告
###  课程名称：Java程序语言设计
### 实验名称：设计学生选课系统
### 班级： 计191
### 姓名： 李胜祥 
### 学号： 2019311326
### 教师： 张世博
## 一.实验目的
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性及其方法；  
2·掌握面对对象的类的设计方法（属性，方法）；  
3· 掌握类的继承用法，通过构造方法实例化对象；  
4· 学会使用super（），用于实例化子类；  
5.掌握使用Object根类的toString()方法，·应用在相关对象的信息输出中。  
## 二·实验过程
  本次实验一共创造了5个文件夹，Login.java的Login类用来储存学生的账户编号和账户密码；people.java中重写了toString（）方法；  
  student.java，teacher.java文件中student类和teacher类继承了people类，同时重写了people类中的classselect()方法。  
  在student类重写的的classselect（）方法中：创建多个数组，将学生信息存在其中，同时编写while语句和if语句，用来判断学生输入自  
  己的编号是否存在，若存在则开始让用户输入密码，若不存在，则需要重新输入。利用while语句和if语句，用来判断密码是否输入正确，若
  正确，则登录成功，若输入错误则重新输入，当用户输入密码错误连续超过5次时，则用户没有输入机会。当登录成功后，控制台会打印出学生
  个人信息；同时创建void getclass()方法和void getclass1()方法，用来打印学生已选课课程信息。
  在teacher类中创建数个数组，用来储存老师个人信息和开设课程信息，在teacher重写classselect（）方法中，用户用通过输入老师的编号，
  控制台输出老师的信息和所开设课程信息，同时创建 selectclass() 方法，用来列出所有老师信息的信息及其所开设课程信息，同时打印在控制台。  
  在student.java存放着主类student，调用student和teacher类中的方法，通过使用if语句，判断是否输入密码次数超过五次，若超过五次，
  则不能进入选课阶段，若登录成功，则开始选课，接着设计单独查询老师及课程信息，若选择查询，会出现是否选择已查询老师课程，若选择是，
  则选课成功，打印选课单。若选择否，则打印全部选课信息，学生开始选课，选课成功，打印选课单。
## 三·核心方法
###  在student类中：
	student(int year){
		super(year);
    此模块用来创造子类构造方法，用来调用父类people的构造方法
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
  此模块用来让用户输入个人编号（可以输入无限次），同时让用户输入密码，若输入错误次数超过五次，则不可以再输入。若登录成功，则会打印出学生个人信息 
  
	void getclass() {
		teacher T = new teacher();
		Scanner readerthree = new Scanner(System.in);
		 int studentclass = readerthree.nextInt();
		 super.classselect();
		 System.out.println("你选择的是"+T.name[studentclass]+"老师的"+T.courses[studentclass]+"课程");
		 System.out.println("上课地点在"+T.place[studentclass]);
		 System.out.println("上课时间为"+T.classTime[studentclass]);
     此构造方法用来打印学生所选课程的具体信息
  ###  在teacher类中：
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
  此模块用来列出所有老师信息及其开设课程信息
   ###  在teacher类中：
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
  此模块用来判断是否用户输入密码次数超过五次，若超过，则退出系统；若登录成功，则学生开始选课，学生可以通过单独查询老师信息选课或者观看全部选课列表选课。
## 四.流程图
https://github.com/li2843645895/java-/blob/main/%E6%AC%A2%E8%BF%8E%E6%9D%A5%E5%88%B0%E5%AD%A6%E7%94%9F%E9%80%89%E8%AF%BE%E7%B3%BB%E7%BB%9F.png
## 五·实验结果
当登录成功时，选择单独查询老师信息，并选择已查询老师所开课程
https://github.com/li2843645895/java-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201024013814.png
当登录成功时，选择单独查询老师信息，不选择已查询老师所开课程
https://github.com/li2843645895/java-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201024013828.png
当登录成功时，不选择单独查询老师信息，开始选课
https://github.com/li2843645895/java-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201024013835.png
## 六·实验感想
本次实验我深刻体会到了分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性及其方法；掌握面对对象的类的设计方法（属性，方法），
类的继承用法，通过构造方法实例化对象；同时也学会使用super（）语句，用于实例化子类；学会了使用Object根类的toString()方法，应用在相关对象的信息输出中。
通过这次试验，我深刻体验到如何通过设计程序去解决问题，让我对java语言更加的热爱。

