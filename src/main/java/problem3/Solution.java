package problem3;

import java.util.Map;
import kotlin.ranges.IntRange;
import problem3.Appender.Appender;
import problem3.Appender.AppenderFactory;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution("I love you"));
    }

    public static String solution(String word) {
        Collector collector = new Collector();

        AppenderFactory appenderFactory = new AppenderFactory(Map.of(new IntRange(65, 90), new Backwarder(65, 90),
                                                                     new IntRange(97, 122), new Backwarder(97, 122)));

        for (char ch : word.toCharArray()) {
            Appender appender = appenderFactory.create(ch);
            appender.append(collector, ch);
        }

        return collector.get();
    }
}
