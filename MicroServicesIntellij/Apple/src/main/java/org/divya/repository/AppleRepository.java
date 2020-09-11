package org.divya.repository;


import org.divya.model.Device;
import org.springframework.data.repository.CrudRepository;

public interface AppleRepository extends CrudRepository<Device, Integer> {
}
