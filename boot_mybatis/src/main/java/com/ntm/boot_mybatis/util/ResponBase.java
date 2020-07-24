package com.ntm.boot_mybatis.util;

/**
 * @ClassName ResponBase
 * @Author Tian
 * @Date 2020/7/24 11:22
 * @Description TODO
 * @Version 1.0
 */
public class ResponBase {
    //响应状态
    public int statecode;
    //错误信息
    public String errormsg;
    //响应实体
    public Object data;
    //操作是否成功
    public boolean success;

    public int getStatecode() {
        return statecode;
    }

    public void setStatecode(int statecode) {
        this.statecode = statecode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
