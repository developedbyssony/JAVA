package interaction;

public class Seller {
	// ������ int money(����), int mango(���)�� �����ϴ�.
	private int money; // �����
	private int mango; // ���(����)
	/// �������� ���̱� ���� ���ڴ�� �ִ� ������
	/// ī�����̽��� �ۼ����� �ʽ��ϴ�.
	private int MANGO_PRICE; 
	
	// �����ڿ��� money�� �ʱⰪ�� 0�̰�, mango�� �Է¹޵��� ���ּ���.
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
		this.MANGO_PRICE = 1000; /// �����ڿ��� �ǸŰ��� ���� �־���
	}
	
	// showSeller()�� �̿��� ���� ������, ���������� ��ȸ�ϵ��� �޼��带 �ۼ����ּ���.
	public void showSeller() {
		System.out.println("--------------�Ǹ�������----------------");
		System.out.println("��������� :" + this.money + ", ���������� :" + this.mango);
	}
	
	// sellMango(int mango)�� �̿��ؼ� ���������� �Է¹�����
	// �ڽ��� ������ �Է¹��� ����������ŭ �����ϰ�, this.money�� 
	// �������� * �������ݸ�ŭ �����ϰ� ���ּ���.
	public void sellMango(int mango) {
		// ������ ���ڶ��� "������ ���ڶ��ϴ�" ��� �ϰ� �޼��带
		// return; �� �������� ���� ���� ��������ּ���.
	// price = 3000;
		this.mango -= mango;
		this.money += mango * MANGO_PRICE;
		/// "+=" => �������� * �������ݸ�ŭ ����
		if (this.mango < mango) {
			System.out.println("������ ���ڶ��ϴ�.���� ��� : " + this.mango);
			return;
	}	
		
}
	//// �������� ���� ���� ��ȸ�� �� �ֵ��� ���� �����!
	public int getMango() {
		return mango;
	}

}