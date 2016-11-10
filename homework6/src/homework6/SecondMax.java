package homework6;

public class SecondMax {
	void A01() {
		String input;
		int[] num = new int[10];
		int[] max = new int[10];
		int temp = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번째 수를 입력하시오 : ");
			input = new ExamVariousArray().input();
			num[i] = Integer.parseInt(input);
			max[i] = num[i];
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (max[i] > max[j]) {
					temp = max[i];
					max[i] = max[j];
					max[j] = temp;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			if (num[i] == max[1])
				System.out.println("두번째로 큰 수는 " + (i + 1) + "번째수 " + num[i] + "입니다.");
		}
	}
}
