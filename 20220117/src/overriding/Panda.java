package overriding;

public class Panda extends Animal {
	public String color;
	
	public void howl() {
		System.out.println("����");
	}
	
	public void getPandaInfo() {
		System.out.println("�̸� : " + name + ", ���� : " + age + ", ���� :" + gender + ", ���� :" + color);
	}
	
}
