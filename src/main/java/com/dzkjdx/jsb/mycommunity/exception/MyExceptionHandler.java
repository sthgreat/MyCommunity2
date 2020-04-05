package com.dzkjdx.jsb.mycommunity.exception;

import com.dzkjdx.jsb.mycommunity.Enum.StatusCode;
import com.dzkjdx.jsb.mycommunity.vo.ResponseVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler
    @ResponseBody
    public ResponseVo UserLoginHandle() {
        return ResponseVo.error(StatusCode.NEED_LOGIN);
    }
}
