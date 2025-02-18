package algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumericCheckerTest {

    @Test
    @DisplayName("正常な半角数字のテスト")
    void testIsStrictlyNumeric_validNumber() {
        assertTrue(NumericChecker.isStrictlyNumeric("12345"));
        assertTrue(NumericChecker.isStrictlyNumeric("0"));
        assertTrue(NumericChecker.isStrictlyNumeric("9223372036854775807")); // Long最大値
        assertTrue(NumericChecker.isStrictlyNumeric("9223372036854775808")); // Long最大値+1
        assertTrue(NumericChecker.isStrictlyNumeric("9999999999999999999")); // Long超え
        assertTrue(NumericChecker.isStrictlyNumeric("0123")); // 先頭に0

    }

    @Test
    @DisplayName("正常な全角数字のテスト")
    void testIsStrictlyNumeric_validNumber_zenkaku() {
        assertTrue(NumericChecker.isStrictlyNumeric("１２３４５"));
        assertTrue(NumericChecker.isStrictlyNumeric("０"));
        assertTrue(NumericChecker.isStrictlyNumeric("９２２３３７２０３６８５４７７５８０７")); // Long最大値
    }

    @Test
    @DisplayName("無効な半角数字(マイナス)のテスト")
    void testIsStrictlyNumeric_minus() {
    	assertFalse(NumericChecker.isStrictlyNumeric("-9223372036854775808"));
    }

    @Test
    @DisplayName("無効な文字を含むテスト")
    void testIsStrictlyNumeric_invalidCharacter() {
        assertFalse(NumericChecker.isStrictlyNumeric("123abc"));
        assertFalse(NumericChecker.isStrictlyNumeric("abc123"));
        assertFalse(NumericChecker.isStrictlyNumeric("１２３abc"));
        assertFalse(NumericChecker.isStrictlyNumeric("123-45"));
        assertFalse(NumericChecker.isStrictlyNumeric("123.45"));
    }

    @Test
    @DisplayName("無効な空白を含むテスト")
    void testIsStrictlyNumeric_invalidSpace() {
        assertFalse(NumericChecker.isStrictlyNumeric("１　２３４５")); // 途中の全角スペース
        assertFalse(NumericChecker.isStrictlyNumeric("　　　")); // スペースのみ
        assertFalse(NumericChecker.isStrictlyNumeric("1 2 3")); // 途中の半角スペース

    }

    @Test
    @DisplayName("有効な空白を含むテスト")
    void testIsStrictlyNumeric_validSpace() {
        assertTrue(NumericChecker.isStrictlyNumeric("　１２３４５　")); // 前後の全角スペース
        assertTrue(NumericChecker.isStrictlyNumeric(" 123 ")); // 前後の半角スペース
    }

    @Test
    @DisplayName("nullまたは空文字列のテスト")
    void testIsStrictlyNumeric_nullOrEmpty() {
        assertFalse(NumericChecker.isStrictlyNumeric(null));
        assertFalse(NumericChecker.isStrictlyNumeric(""));
    }
}
