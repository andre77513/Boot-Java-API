package br.com.tiacademy.sales.core.crud;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class CrudController<T, ID> {

    @Autowired
    protected CrudService<T, ID> service;

    @GetMapping
    public ResponseEntity<List<T>> readAll() {
        var entityList = service.readAll();

        return ResponseEntity.ok(entityList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> readById(@PathVariable("id") ID id) {
        var entity = service.readById(id);

        if (Objects.isNull(entity)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(entity);
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        var saved = service.create(entity);

        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable("id") ID id, @RequestBody T entity) {
        return ResponseEntity.ok(service.update(id, entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") ID id) {
        service.delete(id);

        return ResponseEntity.ok().build();
    }

}
