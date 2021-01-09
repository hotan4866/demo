package demo.game.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import demo.game.domain.Car;
import demo.game.domain.Round;
import demo.game.view.InputView;

public class ViewController {

	private final static int FRIST_VALUE = 1;
	
	public static List<Car> racingCarCreate() {
		
		// 1 , 2,3 
		List<Car> cars = IntStream.range(FRIST_VALUE, InputView.inputCarNumber() + 1)
				.boxed() // 박싱 래퍼 
				.map(Car::new) // 클래스 생성 
				.collect(Collectors.toList());
		
		return cars;
	}
	
	public static int gameRoundCreate() {
		int num = InputView.inputGameRound(); // 메세지 나오는 함수 인데 
		Round round = new Round(num);
        return round.getRound();
	}
}
