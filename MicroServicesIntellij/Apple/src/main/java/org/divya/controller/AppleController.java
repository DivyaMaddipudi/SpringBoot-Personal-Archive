package org.divya.controller;

import org.divya.model.Device;
import org.divya.model.Devices;
import org.divya.repository.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apple")
public class AppleController {

    @Autowired
    private AppleRepository repo;

    @RequestMapping("/devices")
    public Devices getAppleDevices() {

        List<Device> devices = repo.findAll();

        Devices deviceList = new Devices(devices);

        return deviceList;
    }
}
