package homework6;

import java.util.*;

public class ExamVariousArray {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. �ι�°�� ū �� ã��");
			System.out.println("2. �ɻ� ���� ���");
			System.out.println("3. �л� ����, ��հ� ���ϱ�");
			System.out.println("4. 5�� ����Ʈ�� ������ ���� ���ϱ�");
			System.out.println("5. ��ġġ �ʴ� ���� 10�� �Է¹ޱ�");
			System.out.println("6. ���α׷� �����ϱ�");
			System.out.println("���ϴ� �޴��� >> ");
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
				System.out.println("���ڸ� �ٽ�  �Է����ּ���");
				break;
			}
		}
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
