package problem3;

/**
 * 역할.
 * 단어를 지정 범위 안에서 거꾸로 변환하는 역할.
 */
public class Backwarder {
    private final char startInclusive;
    private final char endExclusive;

    public Backwarder(char startInclusive, char endExclusive) {
        if (startInclusive > endExclusive) {
            throw new RuntimeException("start is bigger than end.");
        }

        this.startInclusive = startInclusive;
        this.endExclusive = endExclusive;
    }

    public char convert(char c) {
        return (char) (endExclusive - (c - startInclusive));
    }
}
