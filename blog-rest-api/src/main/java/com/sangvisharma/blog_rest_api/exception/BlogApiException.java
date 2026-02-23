package com.sangvisharma.blog_rest_api.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
public class BlogApiException extends RuntimeException{
    @Getter
    private HttpStatus status;
    private String message;
    public BlogApiException(HttpStatus status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }
    public BlogApiException(String customMessage, HttpStatus status, String message) {
        super(customMessage);
        this.status = status;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
