package br.ufpr.tads.common.account;

import java.time.ZonedDateTime;

public record BankAccountDetails(BankAccount account,
                                 double balance,
                                 double limit,
                                 ZonedDateTime updatedAt) {
}
