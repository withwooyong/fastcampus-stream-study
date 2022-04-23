package item;

import org.apache.commons.lang3.StringUtils;

public class StringTest {

    public static void main(String[] args) {
        // 기본 isEmpty 는 null 체크 안됨.
        System.out.println("기본 isEmpty 는 null 체크 안됨.");
        System.out.println("Hello".isEmpty() + "," + "Hello".isBlank()); // false, false
        System.out.println(" Hello ".isEmpty() + "," + " Hello ".isBlank()); // false, false
        System.out.println("".isEmpty() + "," + "".isBlank()); // true, true
        System.out.println(" ".isEmpty() + "," + " ".isBlank()); // false, true
        String str = null;
        if (str != null) {
            str.isBlank();
        }
        System.out.println("=========");

        boolean isBlank = StringUtils.isBlank(str);
        System.out.println("isBlank=" + isBlank);

        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("isEmpty=" + isEmpty);
        System.out.println("#############################");
        System.out.println("null 체크까지 하려면 StringUtils 사용");
        System.out.println("implementation 'org.apache.commons:commons-lang3:3.12.0'");

        System.out.println(StringUtils.isBlank(null)); // true
        System.out.println(StringUtils.isBlank("")); // true
        System.out.println(StringUtils.isBlank("value")); // false
        System.out.println(StringUtils.isBlank(" ")); // true

        //- (" ") 이거나 공백문자("") 혹은 null이면 false를 반환
        //
        //▼예제
        System.out.println(StringUtils.isNotBlank(null)); // false
        System.out.println(StringUtils.isNotBlank("")); // false
        System.out.println("이넘을 주로 쓰면 됨." + StringUtils.isNotBlank("value"));  //true
        System.out.println(StringUtils.isNotBlank(" ")); // false


//https://rios.tistory.com/entry/JAVA-NULL-%EC%9D%84-%EB%8B%A4%EB%A3%A8%EB%8A%94-%EB%B0%A9%EB%B2%95StringUtil-isEmpty-isNotEmpty-isBlank-isNotBlank
        //StringUtils.isEmpty
        //- null이나 ("")이면 true 값을 반환
        //
        //
        //▼예제
        //StringUtils.isEmpty(null) : true
        //StringUtils.isEmpty("") : true
        //StringUtils.isEmpty("value") : false
        //StringUtils.isEmpty(" ") : false
        //
        //StringUtils.isNotEmpty
        //-  null이나 ("")이면 false 값을 반환
        //
        //
        //▼예제
        //StringUtils.isNotEmpty(null) : false
        //StringUtils.isNotEmpty("") : false
        //StringUtils.isNotEmpty("value") : true
        //StringUtils.isNotEmpty(" ") : true
        //
        //
        //StringUtils. isBlank
        //- (" ") 이거나 공백문자("") 혹은 null이면 true를 반환
        //
        //▼예제
        //StringUtils.isBlank(null) : true
        //StringUtils.isBlank("") : true
        //StringUtils.isBlank("value") : false
        //StringUtils.isBlank(" ") : true
        //
        //
        //
        //
        //StringUtils.isNotBlank
        //- (" ") 이거나 공백문자("") 혹은 null이면 false를 반환
        //
        //▼예제
        //StringUtils.isNotBlank(null)      = false
        //StringUtils.isNotBlank("")        = false
        //StringUtils.isNotBlank("value")     = true
        //StringUtils.isNotBlank(" ")       = false


    }
}
