package homework6;

public class AvgScore {
	void A02() {
		String input;
		double[] num = new double[10];
		double temp = 0;
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "��° ���� �Է��Ͻÿ� : ");
			input = new ExamVariousArray().input();
			num[i] = Double.parseDouble(input);
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}
		for (int i = 1; i < 9; i++) {
			sum += num[i];
		}
		avg = sum / 8;
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ���� �����  %.1f�� �Դϴ�.\n", avg);
	}
}
