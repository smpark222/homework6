package homework6;

public class StudentScore {
	void A03() {
		String subject[] = { "국어", "영어", "수학" };
		int[][] sub = new int[5][3];
		String input;
		int stuall[] = { 0, 0, 0, 0, 0 };
		double stuavg[] = { 0, 0, 0, 0, 0 };

		int suball[] = { 0, 0, 0 };
		double subavg[] = { 0, 0, 0 };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((i + 1) + "번 학생 " + subject[j] + " : ");
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
			System.out.println(subject[i] + "총점은 " + suball[i] + "점이고, 평균은 " + subavg[i] + " 입니다.");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번 학생의 총점은 " + stuall[i] + ", 평균은 " + stuavg[i] + "이다.");
		}
	}
}