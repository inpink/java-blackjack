package blackjack.controller;

import blackjack.service.GameService;
import blackjack.view.InputView;
import blackjack.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final GameService gameService;

    public GameController(final InputView inputView,
                          final OutputView outputView,
                          final GameService gameService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.gameService = gameService;
    }

    public void play() {

    }
}
