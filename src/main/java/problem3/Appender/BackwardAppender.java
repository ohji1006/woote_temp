package problem3.Appender;

import lombok.NonNull;
import problem3.Backwarder;
import problem3.Collector;

/**
 * 역할.
 * 거꾸로 변환한 char 를 더하는 행위의 역할. ( 행위의 추상화. )
 */
public class BackwardAppender implements Appender {
    private final Backwarder backwarder;

    public BackwardAppender(@NonNull Backwarder backwarder) {
        this.backwarder = backwarder;
    }

    @Override
    public void append(@NonNull Collector sc, char c) {
        char convert = backwarder.convert(c);
        sc.append(convert);
    }
}
