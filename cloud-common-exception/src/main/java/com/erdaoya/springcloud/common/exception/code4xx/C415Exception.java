package com.erdaoya.springcloud.common.exception.code4xx;


import com.erdaoya.springcloud.common.exception.RESTfull4xxBaseException;
import com.erdaoya.springcloud.common.exception.util.ErrorUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;
@ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
public class C415Exception extends RESTfull4xxBaseException implements Serializable {
	private static final long serialVersionUID = 551808489769571904L;

	public C415Exception(String message) {
		super(message);
	}
	public C415Exception(String message,Error error){
		super(ErrorUtil.appendError(message,error));
	}
}
