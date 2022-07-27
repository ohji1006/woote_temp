package problem3.Appender;

import lombok.NonNull;
import problem3.Collector;

/**
 * 역할.
 * 입력 받은 char 을 더하는 역할 ( 행위의 추상화. )
 */
public class BasicAppender implements Appender {
    @Override
    public void append(@NonNull Collector sc, char c) {
        sc.append(c);
    }
}
