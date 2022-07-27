package problem3.Appender;

import problem3.Collector;

/**
 * 생성이유.
 * 동일한 append 행위가 char 의 범위에따라 조금씩 다르기 때문에 생성함.
 */
public interface Appender {
    void append(Collector collector, char c);
}
