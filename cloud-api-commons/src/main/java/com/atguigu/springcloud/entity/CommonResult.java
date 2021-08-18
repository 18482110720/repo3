package com.atguigu.springcloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private String code;
    private String message;
    private T data;

    public CommonResult(String code, String message){
       this(code,message,null);
    }
    public static<T> CommonResult<T> success(T t){
        return new CommonResult("200","success",t);
    }
}
