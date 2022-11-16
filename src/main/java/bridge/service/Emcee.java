package bridge.service;

import bridge.io.OutputView;

public class Emcee {

    private final OutputView outputView = new OutputView();

    public void guideGame() {
        String guide = "다리 건너기 게임을 시작합니다.\n" +
                "다리는 위쪽과 아래쪽으로 구별되며 왼쪽에서 오른쪽으로 건너갑니다.\n" +
                "위쪽과 아래쪽 중에서 하나의 칸만 이동이 가능합니다.\n";
        outputView.printGuide(guide);
    }

    public void guideEnteringBridgeLength() {

    }

    public void guideEnteringMovement() {

    }

    public void guideEnteringRetryStatus() {

    }

    public void showBridgeMovementStatus() {

    }

    public void showGameResult() {

    }
}
