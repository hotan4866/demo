package demo.game.view;

import java.util.Scanner;

public class InputView {

	private static Scanner scanner = new Scanner(System.in);

    public static int inputCarNumber() {
        
    	System.out.println("자동차 댓수을 입력하세요.");
        
    	return scanner.nextInt();
    }

    public static int inputGameRound() {
    	//
        System.out.println("시도할 횟수를 입력하세요.");
        //
        return scanner.nextInt();
    }
	
}
