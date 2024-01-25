package br.ufpr.tads.common.exceptions;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Getter
public class RootException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 2356411281805679338L;

    private final HttpStatus httpStatus;
    private final List<ApiErrorDetails> errors = new ArrayList<>();

    public RootException(@NotNull HttpStatus httpStatus) {
        super();
        this.httpStatus = httpStatus;
    }

    public RootException(@NotNull String message, @NotNull HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
