package demo.game.view;

import java.util.stream.Collectors;

import demo.game.domain.Car;
import demo.game.domain.Cars;

public class ResultView {
	
    private static final String NEW_LINE = "\n";
    private static final String POSITION_MARK = "-";
    private static final String NAME_POSITION_DELIMITER = ": ";
	    

	public static void printRoundResult(Cars racingGame) {
        String carNameAndPosition = racingGame.getRacingCars()
            .stream()
            .map(ResultView::showCarNameAndPosition) // ����� ��Ʈ���� �����ϰ� 
            .collect(Collectors.joining(NEW_LINE));  // ���͸��� ����� ��Ʈ��ȭ ��Ű��
        	//1 : ---
        	//2 : --
         	//3 : -
        	
        	//
        System.out.println(carNameAndPosition + NEW_LINE);
    }
	
	private static String showCarNameAndPosition(Car car) {
        StringBuilder trace = new StringBuilder();
        for (int i = 0; i < car.getCarPos(); i++) {
            trace.append(POSITION_MARK); // - - - -
        }
        return car.getCarId() + NAME_POSITION_DELIMITER + trace.toString(); // 1 :StringBuilder ---
    }
}
