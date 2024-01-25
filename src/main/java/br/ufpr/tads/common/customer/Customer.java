package br.ufpr.tads.common.customer;

import br.ufpr.tads.common.user.UserRole;

import java.util.UUID;

public record Customer(UUID id,
                       String firstName,
                       String lastName,
                       String email,
                       String cpf,
                       String phone,
                       double monthlyIncome,
                       Address address) {
    public UserRole userRole() {
        return UserRole.CUSTOMER;
    }
}
