package javaprogram2;

import java.util.*;

public class SecondTest{

	public static void main(String[] args) {
		System.out.println(
				"----------------------------------��ӭ����ѧ��ѧ��ϵͳ--------------------------------------------");
		people A;
		people D;
		teacher B = new teacher();
		student C = new student(2023);
		A = new student();
		D = new teacher();
		C.classselect();
		//���������������������ǣ���ϵͳ��Ҫ�˳�������ӡ��������Ϣ
		if(C.stop >=5) {
			System.out.println("���棺������������ﵽ���ޣ��������������������зǷ���¼�����������������������ڵ�½ϵͳѡ�Σ�����");
		}else {
			//�û�ѡ���Ƿ���Ҫ������ѯ��ʦ��Ϣ
		System.out.println("�Ƿ���Ҫ������ѯ��ʦ������Ϣ(��0Ϊ������ѯ��ʦ��Ϣ����1Ϊ��ѯȫ����ʦ������Ϣ)");
		Scanner readerfour = new Scanner(System.in);
		int findinf = readerfour.nextInt();
		//�û�ѡ����Ҫ��ѯ����ʦ����Ϣ��������Ҫ�����ӡ��ʦ��Ϣ�������û�ѡ����Ҫѡ�޵Ŀγ�
		if (findinf == 0) {
			System.out.println("��������ʦ��ţ�");
			B.classselect();
			//�û�ѡ���Ƿ�ѡ���ѯ��ʦ�Ŀγ�
			System.out.println("�Ƿ�ѡ�����ʦ�γ�(1Ϊ�ǣ�0Ϊ��)");
			Scanner readerfive = new Scanner(System.in);
			int selectcourse = readerfive.nextInt();
			//����ѡ�γɹ�����ӡ��ѡ��γ̵���Ϣ
			if (selectcourse == 1) {
				teacher T = new teacher();
				System.out.println(
						"-------------------------------------------ѡ�γɹ���-----------------------------------------------");
				System.out.println("��ѡ�����" + T.name[B.number] + "��ʦ��" + T.courses[B.number] + "�γ�");
				System.out.println("�Ͽεص���" + T.place[B.number]);
			} else if (selectcourse == 0){
				//�����ӡ������ʦ���ε���Ϣ����ѡ����ѡ����ʦ�ı��
				B.selectclass();
				System.out.println("����������ѡ�޵Ŀγ���ʦ��ţ�");
				C.getclass();
			}
			;
		} else if (findinf == 1) {
			System.out.println("�����Ǹ�����ʦ�������γ���Ϣ:");
			B.selectclass();
			System.out.println("����������ѡ�޵Ŀγ���ʦ��ţ�");
			C.getclass();
		}
		;
	}
	}
}
