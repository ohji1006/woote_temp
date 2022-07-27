package problem3;

/**
 * 역할.
 * string 을 모으는 역할.
 * stringbuilder 가 다양한 역할을 하기 때문에 예상하지 못한 행위를 수행할수 있다.
 * 이것을 class 로 감쌈으로써 하나의 역할만을 수행할수 있는 객체로 생성하였다.
 */
public class Collector {
    private final StringBuilder sb = new StringBuilder();

    public void append(char ch) {
        sb.append(ch);
    }

    public String get() {
        return sb.toString();
    }
}
