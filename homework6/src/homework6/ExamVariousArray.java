package homework6;

import java.util.*;

public class ExamVariousArray {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. 두번째로 큰 수 찾기");
			System.out.println("2. 심사 점수 계산");
			System.out.println("3. 학생 총점, 평균값 구하기");
			System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
			System.out.println("5. 겹치치 않는 숫자 10개 입력받기");
			System.out.println("6. 프로그램 종료하기");
			System.out.println("원하는 메뉴는 >> ");
			String input = input();
			int inputNum = Integer.parseInt(input);

			switch (inputNum) {
			case 1:
				new SecondMax().A01();
				break;
			case 2:
				new AvgScore().A02();
				break;
			case 3:
				new StudentScore().A03();
				break;
			case 4:
				new AptPersonCount().A04();
				break;
			case 5:
				new OnlyNumber().A05();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("숫자를 다시  입력해주세요");
				break;
			}
		}
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
