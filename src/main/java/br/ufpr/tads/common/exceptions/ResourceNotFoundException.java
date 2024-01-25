package br.ufpr.tads.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;
import java.util.UUID;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RootException {
    @Serial
    private static final long serialVersionUID = 8489096519036223151L;

    public ResourceNotFoundException() {
        super("entity not found, please provide a valid id", HttpStatus.NOT_FOUND);
    }

    public ResourceNotFoundException(UUID id) {
        super("entity '" + id + "' not found", HttpStatus.NOT_FOUND);
    }

    public ResourceNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
