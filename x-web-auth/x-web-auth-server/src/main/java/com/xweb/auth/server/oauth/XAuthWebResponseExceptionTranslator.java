package com.xweb.auth.server.oauth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.BadClientCredentialsException;
import org.springframework.security.oauth2.common.exceptions.InvalidScopeException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.DefaultWebResponseExceptionTranslator;

public class XAuthWebResponseExceptionTranslator extends DefaultWebResponseExceptionTranslator {

    public ResponseEntity<OAuth2Exception> translate(Exception e) throws Exception{
        if(e instanceof BadClientCredentialsException){
            ResponseEntity<OAuth2Exception> responseEntity = new ResponseEntity(new OAuth2Exception("Client 不存在"),HttpStatus.BAD_REQUEST);
            return responseEntity;

        }else if(e instanceof InvalidScopeException){
            ResponseEntity<OAuth2Exception> responseEntity = new ResponseEntity(new OAuth2Exception(e.getMessage()),HttpStatus.BAD_REQUEST);
            return responseEntity;
        }
        else{
            return super.translate(e);

        }

    }
}
