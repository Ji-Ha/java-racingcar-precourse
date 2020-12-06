package inpututils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputRepetitions extends Input {
	private boolean CHECKEDERROR = false;

	public inputRepetitions(Scanner scanner) {
		super(scanner);
	}

	public int inputanswer() {
		int repeat = 0;
		do {
			System.out.println("시도할 회수는 몇회인가요?");
			try {
				repeat = scanner.nextInt();
				CHECKEDERROR = true;
			} catch (InputMismatchException i) {
				System.out.println("[ERROR] 시도 회수는 숫자여야합니다. 다시 입력해주세요!");
				scanner = new Scanner(System.in);
			}
		} while (CHECKEDERROR == false);
		return repeat;
	}
}
