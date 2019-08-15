package xyz.yuanmo.live.bulletscreen.base;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.io.Serializable;

/**
 * @ClassName ErrorResult
 * @Description 错误的返回结果
 * @Author MatthewHan
 * @Date 2019/5/20 11:30 AM
 * @Version 2.0
 **/
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer status;

    private String message;

    private boolean success = false;

    private T data;


    public ErrorResult(String message) {
        this.message = message;
    }

    public ErrorResult(Integer status, String message) {
        this.status = status;
        this.message = message;
    }



}
