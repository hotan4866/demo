package demo.game.controller;

import demo.game.domain.Cars;
import demo.game.view.ResultView;

public class RoundController {
	
	public void startRound(int playRound, Cars racingGame) {
       
        for (int i = 0; i < playRound; i++) {
            racingGame.moveCar();
            System.out.println((i+1)+"번째 트랙 \n");
            ResultView.printRoundResult(racingGame);
        }
        
    }
}
