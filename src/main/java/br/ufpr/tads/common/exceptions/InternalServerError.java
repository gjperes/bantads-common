package br.ufpr.tads.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerError extends RootException {
    @Serial
    private static final long serialVersionUID = -3403979441966319964L;

    public InternalServerError() {
        super("Something went wrong. Please try again later or enter in contact with our support", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
