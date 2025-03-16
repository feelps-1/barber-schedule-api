package dev.crab.barbershop.mapper;

import dev.crab.barbershop.controller.request.SaveClientRequest;
import dev.crab.barbershop.controller.request.UpdateClientRequest;
import dev.crab.barbershop.controller.response.ClientDetailResponse;
import dev.crab.barbershop.controller.response.ListClientResponse;
import dev.crab.barbershop.controller.response.SaveClientResponse;
import dev.crab.barbershop.controller.response.UpdateClientResponse;
import dev.crab.barbershop.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
