package static1;

public class Main02P276 {
    public static void main(String[] args) {
    	// Static ������ ���� ���̵� Ȱ���� �� �ִ�. / out.println(StaticTest.num1); -> num1�� X
    	System.out.println(StaticTest.num2);

    	// Static �޼���� ��ü�� ������ �ʾƵ� ȣ���� �� �ִ�.
    	// Ŭ������.�޼����()���� �����޼��带 ȣ���� �� �ֽ��ϴ�.
    	StaticTest.check();
    	
    	// StaticTest s1�� ������ �� s1.check();
    	// �� ȣ���غ�����.
    	StaticTest s1 = new StaticTest();
    	s1.check();
    	
	}

}