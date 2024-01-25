package br.ufpr.tads.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class NotAllowedException extends RootException {
    @Serial
    private static final long serialVersionUID = -7562632150668962912L;

    public NotAllowedException() {
        super(HttpStatus.FORBIDDEN);
    }
}
