package javaprogram2;

import java.util.*;

public class student extends people {
	student(){};
	//�������๹�췽�����������ø���people�Ĺ��췽��
	student(int year){
		super(year);
	};
	int number;
	//�������ͱ���stop������¼�û���������Ĵ���
	int stop;
	// �،�classselect����
	void classselect() {
		Login login = new Login();
		//�����б���ѧ����Ϣ��������
		String name[] = { "С��", "�ŷ�", "����", "�", "�Ż�", "����", "̩��", "��־", "ŷ������", "��ػ�" };
		String sex[] = { "��", "Ů", "��", "Ů", "��", "��", "Ů", "��", "Ů", "��" };
		//�û���������ţ�����Ŵ��ڣ����������룬�������ڣ����������룬�������޴ε�����
		int time = 0;
		while (time == 0) {
			System.out.println("���������ı�ţ����Ϊ���ڵ���������֣���");
			Scanner readerone = new Scanner(System.in);
			this.number = readerone.nextInt();
			if (number < 0 || number >= login.studentaccount.length) {
				System.out.println("�����ҵ��ñ����Ϣѧ��,����������!");
				time = 0;
			} else if (number == login.studentaccount[number]) {
				time = 1;
			}
		}
		//���û����������ȷ�ǣ���ʼ�������룬��¼����
		int time1 = 0;
		while (time1 == 0) {
			System.out.println("��������������(���������)��");
			Scanner readertwo = new Scanner(System.in);
			int password = readertwo.nextInt();
			if (password == login.password[number]) {
				System.out.println("��¼�ɹ����ɹ�����ѧ��ѡ��ϵͳ");
				//��ʾѧ����Ϣ
				switch (number) {
				case 0:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 1:
					System.out.println("��ã���" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 2:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("��ţ�" + number);
					break;
				case 3:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 4:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 5:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 6:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 7:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 8:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				case 9:
					System.out.println("��ã�" + name[number]);
					System.out.println("�����Ա��ǣ�" + sex[number]);
					System.out.println("���ı���ǣ�" + number);
					break;
				default:
					System.out.print("�������");

				};
				time1 = 1;
			} else {
			//������������Σ�����������
				if(stop >= 5) {
					break;};
				System.out.println("�����������������");
				time1 = 0;
				stop++;
			}
		}
		
	};
	//��ѧ��ѡ�γɹ������ӡѧ��ѡ��γ���Ϣ
	void getclass() {
		teacher T = new teacher();
		Scanner readerthree = new Scanner(System.in);
		 int studentclass = readerthree.nextInt();
		 super.classselect();
		 System.out.println("��ѡ�����"+T.name[studentclass]+"��ʦ��"+T.courses[studentclass]+"�γ�");
		 System.out.println("�Ͽεص���"+T.place[studentclass]);
		 System.out.println("�Ͽ�ʱ��Ϊ"+T.classTime[studentclass]);
	};
	//��������������ӡѧ��ѡ��γ���Ϣ
	void getclass1(int t) {
		teacher T = new teacher();
		//���ø��౻���ǵ�classselect()����
		super.classselect();
		 System.out.println("��ѡ�����"+T.name[t]+"��ʦ��"+T.courses[t]+"�γ�");
		 System.out.println("�Ͽεص���"+T.place[t]);
		 System.out.println("�Ͽ�ʱ��Ϊ"+T.classTime[t]);
		 
	};
}