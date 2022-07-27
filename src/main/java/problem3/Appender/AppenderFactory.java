package problem3.Appender;

import java.util.HashMap;
import java.util.Map;
import kotlin.ranges.IntRange;
import lombok.NonNull;
import problem3.Backwarder;

/**
 * 역할.
 * 입력받은 char 에 따른 char 형 추가 방법(= Appender ) 을 생성하는 역할.
 */
public class AppenderFactory {
    private final Map<IntRange, Backwarder> intRangeBackwarderMap;

    public AppenderFactory(@NonNull Map<IntRange, Backwarder> intRangeBackwarderMap) {
        this.intRangeBackwarderMap = new HashMap<>(intRangeBackwarderMap);
    }

    public Appender create(char c) {
        return intRangeBackwarderMap.entrySet().stream()
            .filter(entry -> entry.getKey().contains(c))
            .map(entry -> (Appender) new BackwardAppender(entry.getValue()))
            .findFirst()
            .orElseGet(BasicAppender::new);
    }
}
