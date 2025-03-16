package dev.crab.barbershop.service;

import dev.crab.barbershop.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
