package br.ufpr.tads.common.customer;

public record Address(String street,
                      String number,
                      String cep,
                      String district,
                      String city,
                      String state,
                      String complement) {
}
