package homework6;

public class OnlyNumber {
	void A05() {
		String input;
		int[] num = new int[10];
		double temp = 0;
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "��° ���� �Է��Ͻÿ� : ");
			input = new ExamVariousArray().input();
			num[i] = Integer.parseInt(input);
			if (num[i] > 100 || num[i] < 1) {
				i--;
			} else {
				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
						i--;
					}
				}
			}
		}
		for (int i = 9; i >= 0; i--) {
			System.out.println(i + 1 + "��° ���ڴ� " + num[i] + "�Դϴ�.");
		}
	}
}
