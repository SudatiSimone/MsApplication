package com.app.api.account.error;

import feign.Response;
import feign.codec.ErrorDecoder;
import com.app.api.account.error.UserError;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()){
            case 400:
            	System.out.println(response.body().toString());
                return new Exception();
                //return new  BadRequestException();
            case 404:
            	System.out.println(response.body().toString());
                return new Exception("My 404 error: "+response.body().toString());
                		//new NotFoundException();
            case 500:
            	UserError error= new UserError();
            	return error ;
            default:
            	System.out.println(response.body().toString());
                return new Exception("Generic error");
        }
    }
}