package interaction;

public class Main01 {
	public static void main(String[] args) {
    Seller s1 = new Seller(100); ///// ������ ���� ������ 100��
    s1.showSeller();
    
	Buyer b1 = new Buyer(10000); ///// �������� �������� 10000��
	b1.showBuyer();
	b1.buyMango(s1, 101); /// �ּҰ�, ��������
	/// ���ǿ����� �����ڰ� �Ǹ��ڸ� ������ ������ ���̾�� ������ ���� ȣ���ؼ� ó���մϴ�.
	
	b1.showBuyer();
    s1.showSeller();
	
}
}