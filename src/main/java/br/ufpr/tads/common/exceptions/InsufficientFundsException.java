package br.ufpr.tads.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.PAYMENT_REQUIRED)
public class InsufficientFundsException extends RootException {
    @Serial
    private static final long serialVersionUID = 4963943169286004499L;

    public InsufficientFundsException() {
        this("insufficient funds or limit to process the transaction");
    }

    public InsufficientFundsException(String message) {
        super(message, HttpStatus.PAYMENT_REQUIRED);
    }
}
