package algorithm;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class NumericChecker {

    /**
     * 文字列が厳密に数値かどうかを判定します。
     * 全角・半角数字のみで構成されているか、数値としてパース可能かをチェックします。
     *
     * @param str 判定する文字列。nullまたは空文字列の場合はfalseを返します。
     * @return 文字列が厳密に数値であればtrue、そうでなければfalse。
     */
    public static boolean isStrictlyNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // 前後の空白（全角・半角含む）を除去
        str = str.strip();

//		文字列がマイナスの数の場合もtrueにする場合はコメントを外す
//        boolean isNegative = str.startsWith("-");
//        if (isNegative) {
//            str = str.substring(1);
//            if (str.isEmpty()) {
//                return false;
//            }
//        }

        if (!Pattern.matches("[0-9０-９]+", str)) {
        //if (!Pattern.matches("^-?[0-9０-９]+", str)) { // マイナス記号を許可する場合の正規表現

            return false;
        }

        // 全角数字を半角数字に変換し、すべての空白を削除
        String halfWidthStr = str.trim().replaceAll("[０-９]", "0").replaceAll("\\s", "");

        // 空文字列の場合はfalseを返す
        if (halfWidthStr.isEmpty()) {
            return false;
        }

        try {
            new BigInteger(halfWidthStr); // BigIntegerでパースするだけ
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // テスト例
        System.out.println("--- 半角数字 ---");
        System.out.println("12345: " + isStrictlyNumeric("12345"));        // true
        System.out.println("0: " + isStrictlyNumeric("0"));            // true
        System.out.println("9223372036854775807: " + isStrictlyNumeric("9223372036854775807")); // true (Long最大値)
        System.out.println("9223372036854775808: " + isStrictlyNumeric("9223372036854775808")); // true (Long最大値 + 1)
        System.out.println("9999999999999999999: " + isStrictlyNumeric("9999999999999999999")); // true (Longの範囲を超えるが数値)
        System.out.println("0123: " + isStrictlyNumeric("0123"));       // true
        System.out.println("-9223372036854775808: " + isStrictlyNumeric("-9223372036854775808")); // false (マイナス記号を許可しない場合) ★修正


        System.out.println("\n--- 全角数字 ---");
        System.out.println("１２３４５: " + isStrictlyNumeric("１２３４５"));      // true
        System.out.println("０: " + isStrictlyNumeric("０"));          // true
        System.out.println("９２２３３７２０３６８５４７７５８０７: " + isStrictlyNumeric("９２２３３７２０３６８５４７７５８０７")); // true (Long最大値)

        System.out.println("\n--- 半角・全角混合 ---");
        System.out.println("123４５: " + isStrictlyNumeric("123４５"));      // true
        System.out.println("１２３45: " + isStrictlyNumeric("１２３45"));      // true

        System.out.println("\n--- 全角スペースを含む ---");
        System.out.println("　１２３４５　: " + isStrictlyNumeric("　１２３４５　"));      // true (前後の全角スペース)
        System.out.println("１　２３４５: " + isStrictlyNumeric("１　２３４５"));      // false (途中の全角スペース)
        System.out.println("999　9999999999999999: "+ isStrictlyNumeric("999　9999999999999999")); //true (途中の全角スペース)
        System.out.println("　　　: " + isStrictlyNumeric("　　　"));          // false (スペースのみ)
        System.out.println(" 123 " + isStrictlyNumeric(" 123 ")); // true 前後半角スペース追加
        System.out.println("　１２３　" + isStrictlyNumeric("　１２３　")); // true 前後全角スペース追加

        System.out.println("\n--- 英字混じり ---");
        System.out.println("123abc: " + isStrictlyNumeric("123abc"));      // false
        System.out.println("abc123: " + isStrictlyNumeric("abc123"));      // false
        System.out.println("１２３abc: " + isStrictlyNumeric("１２３abc"));      // false

        System.out.println("\n--- 記号混じり ---");
        System.out.println("123-45: " + isStrictlyNumeric("123-45"));      // false
        System.out.println("123.45: " + isStrictlyNumeric("123.45"));      // false

        System.out.println("\n--- 空文字列 ---");
        System.out.println("空文字列: " + isStrictlyNumeric(""));          // false

        System.out.println("\n--- null ---");
        System.out.println("null: " + isStrictlyNumeric(null));        // false

        System.out.println("\n--- 大きすぎる数(Long超え) ---");
        System.out.println("9999999999999999999999999999999999999: " + isStrictlyNumeric("999999999999999999999999999999999999"));



    }
}

