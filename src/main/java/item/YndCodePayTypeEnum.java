package item;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum YndCodePayTypeEnum {
    CARD("11", "Card", "신용카드", "CARD", "신용카드"),

    REMITTANCE("12", "VBank", "무통장입금", "REMITTANCE", "무통장"),

    ACCOUNT("13", "DirectBank", "실시간 계좌이체", "ACCOUNT", "계좌이체"),

    PHONE("16", "HPP", "휴대폰결제", "PHONE", "휴대폰결제"),

    PAYCO("18", "onlypayco", "페이코", "PAYCO", "페이코"),

    FREE("9", "", "전액할인", "CARD", "전액할인"),

    KAKAO("61", "onlykakaopay", "카카오페이", "KAKAO", "카카오페이"),

    NPAY("50", "", "네이버페이", "NPAY", "네이버페이"),

    TOSS("31", "", "토스", "TOSS", "토스");

    final String pmCode;
    final String oldCode;
    final String oldValue;
    final String newCode;
    final String newValue;

    public static String oCode(String pmCode) {
        return Arrays.stream(values())
                .filter(v -> pmCode.equals(v.pmCode))
                .findFirst().orElseThrow(NoSuchFieldError::new).getOldCode();
//        return result.getOldCode();

//        return Arrays.stream(values())
//                .filter(v -> pmCode.equals(v.pmCode))
//                .findFirst().get().oldCode;
    }

    public static String nCode(String pmCode) {
        return Arrays.stream(values())
                .filter(v -> pmCode.equals(v.pmCode))
                .findFirst().get().newCode;
    }

    public static String oValue(String oCode) {
        return Arrays.stream(values())
                .filter(v -> oCode.equals(v.oldCode))
                .findFirst().get().oldValue;
    }

    public static String nValue(String nCode) {
        return Arrays.stream(values())
                .filter(v -> nCode.equals(v.newCode))
                .findFirst().get().newValue;
    }
}