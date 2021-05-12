package com.zuehlke.petclinic.Services.Maps;

import com.zuehlke.petclinic.Models.BaseEntity;
import com.zuehlke.petclinic.Services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity> implements CrudService<T, Long> {

    private Long idCount = 0L;
    private Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(this.map.values());
    }

    @Override
    public T findById(Long id) {
        return this.map.get(id);
    }

    @Override
    public T save(T object) {
        this.map.put(this.nextId(), object);
        return object;
    }

    @Override
    public T save(Long id, T object) {
        this.map.put(id, object);
        return object;
    }

    @Override
    public void deleteById(Long id) {
        this.map.remove(id);
    }

    @Override
    public void delete(T object) {
        this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long nextId() {
        return this.idCount++;
    }

}
