package demo.game;

import java.util.List;

import demo.game.controller.RoundController;
import demo.game.controller.ViewController;
import demo.game.domain.Car;
import demo.game.domain.Cars;


public class Game {

	public void initGame() {
		
		// �ڵ� �� ���ڸ� �ް� 
        final List<Car> racingCars = ViewController.racingCarCreate();
        // ȸ�� 
        final int GameRound = ViewController.gameRoundCreate();
        	
        //ī���� �迭  
        Cars racingGame = new Cars(racingCars);
        
        
        RoundController racingStadium = new RoundController();
        //���� 
        racingStadium.startRound(GameRound, racingGame);
	
	}
}
