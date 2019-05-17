package org.mayanjun.core;

/**
 * @author mayanjun
 * @since 2018/7/6
 */
public class Message {

    private int code;

    private String description;

    private Throwable exception;

    public Message(int code, String description, Throwable exception) {
        this.code = code;
        this.description = description;
        this.exception = exception;
    }

    public Message(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public Message() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }
}
