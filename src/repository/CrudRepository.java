package repository;


import dto.LongIdDto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CrudRepository<T extends LongIdDto> implements ICrudRepository<T> {


    private List<T> database = new ArrayList<>();

    public CrudRepository(List<T> database) {
        this.database = database;
    }

    @Override
    public T save(T dtoToSave) {
        database.add(dtoToSave);
        return dtoToSave;
    }

    @Override
    public T get(Long id) {
        for (T dto : database) {
            if (dto.getId() == id) {
                return dto;
            }
        }
        throw new RuntimeException("Объект с id " + id + " не был найден");
    }

    @Override
    public T update(T dtoToUpdate) {
        database.remove(dtoToUpdate);
        database.add(dtoToUpdate);
        return dtoToUpdate;
    }

    @Override
    public void delete(Long id) {
        Iterator<T> iterator = database.iterator();

        while (iterator.hasNext()) {
            T next = iterator.next();

            if (next.getId() == id) {
                iterator.remove();
            }
        }
    }
}
