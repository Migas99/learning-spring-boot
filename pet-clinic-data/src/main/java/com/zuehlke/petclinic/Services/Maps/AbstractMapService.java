package com.zuehlke.petclinic.Services.Maps;

import com.zuehlke.petclinic.Services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

    private Map<ID, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(this.map.values());
    }

    @Override
    public T findById(ID id) {
        return this.map.get(id);
    }

    @Override
    public T save(ID id, T object) {
        this.map.put(id, object);
        return object;
    }

    @Override
    public void deleteById(ID id) {
        this.map.remove(id);
    }

    @Override
    public void delete(T object) {
        this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}
