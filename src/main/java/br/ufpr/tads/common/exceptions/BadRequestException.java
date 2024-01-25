package br.ufpr.tads.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RootException {
    @Serial
    private static final long serialVersionUID = -3531537593511823343L;

    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
