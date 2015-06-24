/**
 * Description: Enum to denote different logging levels
 *
 * @author Created by deepmistry
 *         6/24/15.
 */
public enum LoggingLevel {
    ERROR(0), WARN(1), INFO(2), DEBUG(3), DEBUG_HIGH(4), TRACE(5);

    int level;
    LoggingLevel(int i) {
        this.level = i;
    }
}
