package bridge;

import camp.nextstep.edu.missionutils.Console;

import static bridge.Code.ErrorCode.*;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String singleInput = Console.readLine();
        try {
            return Integer.parseInt(singleInput);
        } catch (IllegalArgumentException e){
            System.out.println(NO_INTEGER.getMessage());
            return readBridgeSize();
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }



    public int validateBridgeLength(int length){
        if (length<3 || length>20) {
            System.out.println(BRIDGE_LENGTH_LIMIT.getMessage());
            return readBridgeSize();
        }
        return length;
    }
}
