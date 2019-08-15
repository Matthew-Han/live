package xyz.yuanmo.live.bulletscreen.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yuanmo.live.bulletscreen.base.ErrorResult;
import xyz.yuanmo.live.bulletscreen.enums.HttpCodeEnum;


/**
 * @ClassName ExceptionHandler
 * @Description 绑定Checked(可控)异常信息，返回标准集合
 * @Author MatthewHan
 * @Date 2019/5/20 10:55 AM
 * @Version 1.0
 **/
@ResponseBody
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * @ControllerAdvice
     */
    @ExceptionHandler(Exception.class)
    public ErrorResult handleException(Exception e) {
        e.printStackTrace();
        return new ErrorResult(HttpCodeEnum.EXCEPTION.getCode(),e.toString());
    }
    /**
     * 通用
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MatthewHanException.class)
    public ErrorResult handleMatthewHanException(MatthewHanException e) {
        Object ec = e.getErrorCode();
        String msg = e.getMessage();
        return new ErrorResult((Integer) ec, msg);
    }


}