package net.happystudy.xxyms.utils;

/**
 * JSON交互数据，0==code时为成功，-1为数据库操作异常，-100==code为未登录，-101不权限不足
 * 其他小于0为系统异常，大于0为业务异常
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class JsonBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final int CODE_SUCCESS = 0;
	public static final String MSG_SUCCESS = "success";
	
	private int code;
	private String msg;
	private T data;
	private String target;
	private JSONObject attachment;
	
	public void setSuccess(T data){
		code = CODE_SUCCESS;
		msg = MSG_SUCCESS;
		this.data = data;
	}
	
	public void setFail(Integer code, String msg){
		this.code = code;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

    public Object getAttachment(String key) {
        if(null != attachment){
            return attachment.get(key);
        }
        return null;
    }
    public void addAttachment(String key, Object value) {
        if(null == attachment){
            attachment = new JSONObject();
        }
        attachment.put(key, value);
    }
	
}
