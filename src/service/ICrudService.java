package service;

import dto.LongIdDto;

public interface ICrudService<T extends LongIdDto> {

    T save(T dto);

    T get(Long id);

    T update(T dtoToUpdate);

    void delete(Long id);
}
