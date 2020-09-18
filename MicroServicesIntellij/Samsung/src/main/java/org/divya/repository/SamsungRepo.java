package org.divya.repository;

import org.divya.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamsungRepo extends JpaRepository<Device, Integer> {
}
