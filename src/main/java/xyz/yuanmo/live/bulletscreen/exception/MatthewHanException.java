package xyz.yuanmo.live.bulletscreen.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName MatthewHanException
 * @Description 自定义异常类(继承运行时异常)
 * @Author MatthewHan
 * @Date 2019/4/29 3:52 PM
 * @Version 1.0
 **/
@ToString
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class MatthewHanException extends RuntimeException {


    private static final long serialVersionUID = 1L;
    /**
     * 错误编码
     */
    private Object errorCode;


    /**
     * 消息是否为属性文件中的Key
     */
    private boolean propertiesKey = true;

    /**
     * 构造一个基本异常.
     *
     * @param errorCode 信息描述
     */
    public MatthewHanException(Object errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 构造一个基本异常.
     *
     * @param message 信息描述
     */
    public MatthewHanException(String message) {
        super(message);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public MatthewHanException(Object errorCode, String message) {
        this(errorCode, message, true);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public MatthewHanException(Object errorCode, String message, Throwable cause) {
        this(errorCode, message, cause, true);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode     错误编码
     * @param message       信息描述
     * @param propertiesKey 消息是否为属性文件中的Key
     */
    public MatthewHanException(Object errorCode, String message, boolean propertiesKey) {
        super(message);
        this.setErrorCode(errorCode);
        this.setPropertiesKey(propertiesKey);
    }


    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public MatthewHanException(Object errorCode, String message, Throwable cause, boolean propertiesKey) {
        super(message, cause);
        this.setErrorCode(errorCode);
        this.setPropertiesKey(propertiesKey);
    }

    /**
     * 构造一个基本异常.
     *
     * @param message 信息描述
     * @param cause   根异常类（可以存入任何异常）
     */
    public MatthewHanException(String message, Throwable cause) {
        super(message, cause);
    }

}
