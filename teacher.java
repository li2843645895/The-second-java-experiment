package javaprogram2;

import java.util.*;

public class teacher extends people {
	int number;
	//�����б����������ʦ��Ϣ�����ڿγ���Ϣ
	int teanum[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16 };
	String courses[] = { "��ɢ��ѧ", "C���Գ���", "java", "�ߵ���ѧ", "��ѧӢ��", "���Դ���", "��е��ͼ", "�Ƚ���ͼ����", "������ͼ", "python", "����ѵ��",
			"web����", "���ݽṹ", "���������", "��������", "�������", "��ѧ����" };
	String name[] = { "�ź�", "����", "����", "ղ˹", "����", "���", "溵t", "����", "¹��", "����", "����", "����", "����", "����", "��ΰ", "�Ǹ�",
			"����" };
	String sex[] = { "��", "��", "Ů", "��", "Ů", "��", "Ů", "��", "Ů", "��", "��", "Ů", "��", "��", "Ů", "��", "��" };
	String place[] = { "��301", "��5162", "ͼ���502", "��104", "��403", "��210", "��6350", "��205", "��404", "ͼ���302", "��525",
			"��302", "��6321", "��302", "��601", "��7651", "��230" };
	String classTime[]= {"��һ13:00","����15:00","����08:00","����14:00","����13:15","��һ09:20","����15:20","����13:00","�ܶ�08:00","����18:00","����20:00","��һ19:00","��һ15:00","�ܶ�15:00","����9:00","��һ15:00","��һ13:00"};
	
	//�ڿ���̨�����������ʦ����Ϣ��������Ϣ
	
	void selectclass() {
		//���ø�����д��toString����
		System.out.println(toString());
		//�����ʦ���
		for (int i = 0; i < teanum.length; i++) {
			System.out.print(teanum[i] + "\t" + "\t");
		}
		System.out.println();
		//�����ʦ����
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//�����ʦ�Ա�
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//�����ʦ���ڿγ���Ϣ
		for (int i = 0; i < courses.length; i++) {
			System.out.print(courses[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//�����ʦ����γ̵��ڿεص�
		for (int i = 0; i < place.length; i++) {
			System.out.print(place[i] + "\t" + "\t");
		}
		;
		System.out.println();
		//�����ʦ����γ̵�ʱ��
		for (int i = 0; i < classTime.length; i++) {
			System.out.print(classTime[i] + "\t" + "\t");
		}
		;
		System.out.println();
	};
	
	// ��дpeople���classselect�������û������ţ��ڿ���̨�������ʾ�û�ѡ�����ʦ����Ϣ

	void classselect() {

		Scanner reader = new Scanner(System.in);
		this.number = reader.nextInt();
		switch (number) {
		case 1:
			System.out.println("��ʦ����" + name[0]);
			System.out.println("�Ա�" + sex[0]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[0]);
			break;
		case 2:
			System.out.println("��ʦ����" + name[1]);
			System.out.println("�Ա�" + sex[1]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[1]);
			break;
		case 3:
			System.out.println("��ʦ����" + name[2]);
			System.out.println("�Ա�" + sex[2]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[2]);
			break;
		case 4:
			System.out.println("��ʦ����" + name[3]);
			System.out.println("�Ա�" + sex[3]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[3]);
			break;
		case 5:
			System.out.println("��ʦ����" + name[4]);
			System.out.println("�Ա�" + sex[4]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[4]);
			break;
		case 6:
			System.out.println("��ʦ����" + name[5]);
			System.out.println("�Ա�" + sex[5]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[5]);
			break;
		case 7:
			System.out.println("��ʦ����" + name[6]);
			System.out.println("�Ա�" + sex[6]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[6]);
			break;
		case 8:
			System.out.println("��ʦ����" + name[7]);
			System.out.println("�Ա�" + sex[7]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[7]);
			break;
		case 9:
			System.out.println("��ʦ����" + name[8]);
			System.out.println("�Ա�" + sex[8]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[8]);
			break;
		case 10:
			System.out.println("��ʦ����" + name[9]);
			System.out.println("�Ա�" + sex[9]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[9]);
			break;
		case 11:
			System.out.println("��ʦ����" + name[10]);
			System.out.println("�Ա�" + sex[10]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[10]);
			break;
		case 12:
			System.out.println("��ʦ����" + name[11]);
			System.out.println("�Ա�" + sex[11]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[11]);
			break;
		case 13:
			System.out.println("��ʦ����" + name[12]);
			System.out.println("�Ա�" + sex[12]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[12]);
			break;
		case 14:
			System.out.println("��ʦ����" + name[13]);
			System.out.println("�Ա�" + sex[13]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[13]);
			break;
		case 15:
			System.out.println("��ʦ����" + name[14]);
			System.out.println("�Ա�" + sex[14]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[14]);
			break;
		case 16:
			System.out.println("��ʦ����" + name[15]);
			System.out.println("�Ա�" + sex[15]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[15]);
			break;
		case 17:
			System.out.println("��ʦ����" + name[16]);
			System.out.println("�Ա�" + sex[16]);
			System.out.println("��ʦ���" + number);
			System.out.println("����ʦ������" + courses[16]);
			break;
		default:
			System.out.println("�������");
		}
	}
}