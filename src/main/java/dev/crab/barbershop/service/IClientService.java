package dev.crab.barbershop.service;

import dev.crab.barbershop.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
