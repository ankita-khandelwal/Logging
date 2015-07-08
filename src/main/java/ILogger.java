/**
 * Description: Main interface to specify the behavior of the wrapper to log4j.
 *
 * @author Created by deepmistry
 * 6/24/15.
 */
public interface ILogger {

    /**
     * Error level log entry
     *
     * @param message The message to log
     */
    void error(String message);
    /**
     * Error level log entry
     *
     * @param message The message to log
     * @param e The exception that occurred
     */
    void error(String message, Exception e);
    /**
     * Warn level log entry
     *
     * @param message The message to log
     */
    void warn(String message);
    /**
     * Error level log entry
     *
     * @param message The message to log
     * @param e The exception that occurred
     */
    void warn(String message, Exception e);
    /**
     * Info level log entry
     *
     * @param message The message to log
     */
    void info(String message);
    /**
     * Error level log entry
     *
     * @param message The message to log
     * @param e The exception that occurred
     */
    void info(String message, Exception e);
    /**
     * Debug level log entry
     *
     * @param message The message to log
     */
    void debug(String message);
    /**
     * Error level log entry
     *
     * @param message The message to log
     * @param e The exception that occurred
     */
    void debug(String message, Exception e);
    /**
     * Debug High level log entry
     *
     * @param message The message to log
     */
    void debugHigh(String message);
    /**
     * Error level log entry
     *
     * @param message The message to log
     * @param e The exception that occurred
     */
    void debugHigh(String message, Exception e);
    /**
     * Trace level log entry
     *
     * @param message The message to log
     */
    void trace(String message);
    /**
     * Error level log entry
     *
     * @param message The message to log
     * @param e The exception that occurred
     */
    void trace(String message, Exception e);

}
