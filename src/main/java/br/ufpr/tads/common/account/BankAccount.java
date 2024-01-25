package br.ufpr.tads.common.account;

import java.util.UUID;

public record BankAccount(UUID id, UUID customerId, UUID managerId) {
}
