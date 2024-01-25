package br.ufpr.tads.common.manager;

import br.ufpr.tads.common.user.UserRole;

import java.util.UUID;

public record Manager(UUID id, String firstName, String lastName, String email, String cpf, String phone) {
    public UserRole userRole() {
        return UserRole.MANAGER;
    }
}
