package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static lotto.Util.Paser.createWinningLotto;
import static lotto.Util.Validate.validateTypeInt;

public class InputView {
    private static final String INPUT_LOTTO_BUY = "구입금액을 입력해 주세요.";
    private static final String INPUT_LOTTO_WINNING = "당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";

    public static String inputPlayerAmount() {
        System.out.println(INPUT_LOTTO_BUY);
        return Console.readLine();
    }

    public static List<Integer> inputLottoWinningNum() {
        System.out.println(INPUT_LOTTO_WINNING);
        return createWinningLotto(Console.readLine());
    }

    public static int inputBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER);
        return validateTypeInt(Console.readLine());
    }
}