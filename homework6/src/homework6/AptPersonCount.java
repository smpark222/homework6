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
				System.out.print((i + 1) + "0" +(j+1)+"호에 살고 있는 사람의 숫자 : ");
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
		System.out.println("이 아파트의 거주자는 모두 "+ all+"명입니다.");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 + "층에 사는 거주자는 모두 "+ floor[i] +"명입니다.");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1 + "호 라인에 사는 거주자는 모두 "+ line[i] +"명");
		}
	}
}