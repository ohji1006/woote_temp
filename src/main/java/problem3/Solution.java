package problem3;

import java.util.Map;
import problem3.Appender.Appender;
import problem3.Appender.AppenderFactory;
import problem3.Appender.CustomRange;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution("I love you"));
    }

    public static String solution(String word) {
        Collector collector = new Collector();

        AppenderFactory appenderFactory = new AppenderFactory(
            Map.of(CustomRange.of('a', 'z'), new Backwarder('a', 'z'),
                   CustomRange.of('A', 'Z'), new Backwarder('A', 'Z'))
        );

        for (char ch : word.toCharArray()) {
            Appender appender = appenderFactory.create(ch);
            appender.append(collector, ch);
        }

        return collector.get();
    }
}
