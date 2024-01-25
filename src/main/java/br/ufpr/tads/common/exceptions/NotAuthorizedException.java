package br.ufpr.tads.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class NotAuthorizedException extends RootException {
    @Serial
    private static final long serialVersionUID = -5996075859988444631L;

    public NotAuthorizedException() {
        super(HttpStatus.UNAUTHORIZED);
    }
}
