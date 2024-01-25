package br.ufpr.tads.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.CONFLICT)
public class ResourceAlreadyExistsException extends RootException {
    @Serial
    private static final long serialVersionUID = -6763022537582257224L;

    public ResourceAlreadyExistsException() {
        this("the resource already exists");
    }

    public ResourceAlreadyExistsException(String message) {
        super(message, HttpStatus.CONFLICT);
    }
}
