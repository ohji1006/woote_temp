package problem3.Appender;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.NonNull;
import problem3.Backwarder;

/**
 * 역할.
 * 입력받은 char 에 따른 char 형 추가 방법(= Appender ) 을 생성하는 역할.
 */
public class AppenderFactory {
    private final Map<CustomRange, Backwarder> customRangeBackwarderMap;

    public AppenderFactory(@NonNull Map<CustomRange, Backwarder> customRangeBackwarderMap) {
        this.customRangeBackwarderMap = new HashMap<>(customRangeBackwarderMap);
    }

    public Appender create(char c) {
        Optional<CustomRange> any = customRangeBackwarderMap.keySet().stream()
            .filter(customRange -> customRange.contains(c)).findAny();

        if (any.isEmpty()) {
            return new BasicAppender();
        }

        Backwarder backwarder = customRangeBackwarderMap.get(any.get());
        return new BackwardAppender(backwarder);
    }
}
