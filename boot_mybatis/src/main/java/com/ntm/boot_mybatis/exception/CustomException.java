package com.ntm.boot_mybatis.exception;

import com.ntm.boot_mybatis.model.ResultJson;
import lombok.Getter;


@Getter
public class CustomException extends RuntimeException{
    private ResultJson resultJson;

    public CustomException(ResultJson resultJson) {
        this.resultJson = resultJson;
    }
}
