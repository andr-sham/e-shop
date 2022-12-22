package repository;

import dto.LongIdDto;

public interface ICrudRepository<T extends LongIdDto> {

    T save(T dtoToSave);

    T get(Long id);

    T update(T dtoToUpdate);

    void delete(Long id);
}
