package br.ufpr.tads.common.user;

import java.util.UUID;

public record User(UUID id, String email, UserRole userRole) {
}
