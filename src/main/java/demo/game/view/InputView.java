package demo.game.view;

import java.util.Scanner;

public class InputView {

	private static Scanner scanner = new Scanner(System.in);

    public static int inputCarNumber() {
        
    	System.out.println("�ڵ��� ����� �Է��ϼ���.");
        
    	return scanner.nextInt();
    }

    public static int inputGameRound() {
    	//
        System.out.println("�õ��� Ƚ���� �Է��ϼ���.");
        //
        return scanner.nextInt();
    }
	
}
