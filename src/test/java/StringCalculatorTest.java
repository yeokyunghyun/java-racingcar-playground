import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    @Test
    void useCommaAndColonDelimiterTest() {
        int result1 = StringCalculator.cal("1:2,3");
        Assertions.assertThat(result1).isEqualTo(6);

        int result2 = StringCalculator.cal("1:3,3");
        Assertions.assertThat(result2).isEqualTo(7);
    }

    @Test
    void useCustomDelimiter() {
        int result1 = StringCalculator.cal("//;\n1;2;3");
        Assertions.assertThat(result1).isEqualTo(6);
    }

    @Test
    void useNoNumberORMinusNumber() {
        Assertions.assertThatThrownBy(() -> StringCalculator.cal("-1,2,3")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("양수만을 입력하시오.");
        Assertions.assertThatThrownBy(() -> StringCalculator.cal("a,2,3")).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("양수만을 입력하시오.");

    }
}
