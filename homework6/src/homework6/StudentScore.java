package homework6;

public class StudentScore {
	void A03() {
		String subject[] = { "����", "����", "����" };
		int[][] sub = new int[5][3];
		String input;
		int stuall[] = { 0, 0, 0, 0, 0 };
		double stuavg[] = { 0, 0, 0, 0, 0 };

		int suball[] = { 0, 0, 0 };
		double subavg[] = { 0, 0, 0 };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((i + 1) + "�� �л� " + subject[j] + " : ");
				input = new ExamVariousArray().input();
				sub[i][j] = Integer.parseInt(input);
			}
		}

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				suball[j] += sub[i][j];
			}
			subavg[j] = suball[j] / 5.0;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				stuall[i] += sub[i][j];
			}
			stuavg[i] = stuall[i] / 3.0;
		}

		for (int i = 0; i < 3; i++) {
			System.out.printf("%s ������ %d���̰�, ����� %.1f�Դϴ�.\n", subject[i],suball[i],subavg[i]);
		}
		for (int i = 0; i < 5; i++) {
			System.out.printf( "%d�� �л��� ������ %d, ����� %.1f�̴�.\n",i+1,stuall[i],stuavg[i]);
		}
	}
}