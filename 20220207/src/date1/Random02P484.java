package date1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random��ü�� ������ ���� nextBoolean() ����� �̿��ؼ�
		// ���������� ī���� ���α׷��� ������ּ���.
		// nȸ ������ �� true�� ������ �ո�, false�� ������ �޸����� �����ؼ�
		// ���α׷��� �� ������ ��, �ո� �� ȸ, �޸� �� ȸ����
		// �ܼ�â�� ������ּ���.
		// ���� Ƚ�� nȸ�� ��ĳ�ʷ� �Է¹޽��ϴ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� Ƚ���� �˷��ּ���.");
		int count = scan.nextInt();
		
		int front = 0;
		int back = 0;
		
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			if(random.nextBoolean()) {
				front++;
			} else {
				back++;//////���̰� ����!!!
			}
		}
		
		System.out.println(count + "���� ���� �����");
		System.out.println("�ո� :" + front);
		System.out.println("�޸� :" + back);

	}

}