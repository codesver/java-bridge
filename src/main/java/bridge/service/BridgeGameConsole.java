package bridge.service;

public class BridgeGameConsole {

    private final Emcee emcee = new Emcee();
    private final Player player = new Player();

    public void run() {
        // 게임 시작 안내문을 출력한다.
        // 다리 길이를 입력 받는다.
        // 다리 생성
        // 다리 건너기
        // 게임 결과 출력
    }

    private int createBridgeLength() {
        emcee.guideEnteringBridgeLength();
        return player.enterBridgeLength();
    }

    private void playGame(BridgeGame bridgeGame) {
        int attemptCount = 0;
        boolean playGame = true;
        while (playGame) {
            attemptCount++;
            boolean shouldCrossMore = true;

            while (shouldCrossMore) {
                emcee.guideEnteringMovement();
                String movement = player.enterMovement();
                boolean availableMovement = bridgeGame.move(movement);
                String movementStatus = bridgeGame.createMovementStatus();
                emcee.showBridgeMovementStatus(movementStatus);

                if (!availableMovement) {
                    emcee.guideEnteringRetryStatus();
                    String retryStatus = player.enterRetryStatus();
                    if (retryStatus.equals("R")) {
                        bridgeGame.retry();
                        break;
                    } else {
                        playGame = false;
                        break;
                    }
                } else {
                    shouldCrossMore = !bridgeGame.crossedBridge();
                }
            }
        }
        emcee.showGameResult(bridgeGame.createMovementStatus(), bridgeGame.crossedBridge(), attemptCount);
    }
}
