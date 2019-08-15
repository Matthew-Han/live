package xyz.yuanmo.live.bulletscreen.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import xyz.yuanmo.live.bulletscreen.enums.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @ClassName BaseResult
 * @Description @JsonInclude该注解可以使value为Null屏蔽
 * @Author MatthewHan
 * @Date 2019/4/30 6:54 PM
 * @Version 2.0
 **/
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult<T> implements Serializable {


    private static final long serialVersionUID = 1L;

    private Integer status = HttpCodeEnum.SUCCESS.getCode();

    private Boolean success = true;

    private String message = HttpCodeEnum.SUCCESS.getMessage();

    private T data;

    private Integer num;

    private PageModel page;

    private LocalDateTime time;


    public BaseResult(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResult(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public BaseResult(Integer status, String message, LocalDateTime time) {
        this.status = status;
        this.message = message;
        this.time = time;
    }

    public BaseResult(Integer status, String message, T data, PageModel page) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.page = page;
    }

    public BaseResult(Integer status, String message, T data, LocalDateTime time) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.time = time;
    }

    // ========================错误响应===========================

    public BaseResult(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public BaseResult(Integer status, Boolean success, String message) {
        this.status = status;
        this.success = success;
        this.message = message;
    }

    public BaseResult(Integer status, Boolean success, String message, T data) {
        this.status = status;
        this.success = success;
        this.message = message;
        this.data = data;
    }


}
