package homework6;

public class AptPersonCount {
	void A04(){
		int[][] apart = new int[5][3];
		String input;
		int floor[] = { 0, 0, 0, 0, 0 };
		int line[] = { 0, 0, 0 };
		int all = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((i + 1) + "0" +(j+1)+"ȣ�� ��� �ִ� ����� ���� : ");
				input = new ExamVariousArray().input();
				apart[i][j] = Integer.parseInt(input);
			}
		}
		for(int i = 0; i <5; i++){
			for(int j = 0; j<3;j++){
				all += apart[i][j];
			}
		}
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				line[j]+= apart[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j< 3; j++) {
				floor[i] += apart[i][j];
			}
		}
		System.out.println("�� ����Ʈ�� �����ڴ� ��� "+ all+"���Դϴ�.");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 + "���� ��� �����ڴ� ��� "+ floor[i] +"���Դϴ�.");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1 + "ȣ ���ο� ��� �����ڴ� ��� "+ line[i] +"��");
		}
	}
}