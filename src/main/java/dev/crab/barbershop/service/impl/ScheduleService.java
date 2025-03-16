package dev.crab.barbershop.service.impl;

import dev.crab.barbershop.entity.ScheduleEntity;
import dev.crab.barbershop.repository.IScheduleRepository;
import dev.crab.barbershop.service.IScheduleService;
import dev.crab.barbershop.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}
