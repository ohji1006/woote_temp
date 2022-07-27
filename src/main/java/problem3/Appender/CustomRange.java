package problem3.Appender;

import kotlin.ranges.IntRange;

/**
 * 역할.
 * backward 를 지칭하기 위한 vo 성 역할.
 */
public class CustomRange {
    private final IntRange range;

    public CustomRange(IntRange range) {
        this.range = range;
    }

    public static CustomRange of(char startInclusive, char endInclusive) {
        if (startInclusive >= endInclusive) {
            throw new RuntimeException("range err.");
        }

        return new CustomRange(new IntRange(startInclusive, endInclusive));
    }

    public boolean contains(char ch) {
        return range.contains(ch);
    }
}
