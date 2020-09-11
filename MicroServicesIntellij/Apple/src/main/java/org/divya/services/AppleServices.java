package org.divya.services;

import org.divya.model.Device;
import org.divya.model.Devices;
import org.divya.repository.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppleServices {

    @Autowired
    private AppleRepository repo;

    public List<Device> getBlogs() {
        List<Device> deviceList = new ArrayList<>();

        for(Device device: repo.findAll()) {
            deviceList.add(device);
        }

        return deviceList;
    }
}
