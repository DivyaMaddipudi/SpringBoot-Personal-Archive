package org.divya.controller;

import org.divya.model.Device;
import org.divya.model.Devices;
import org.divya.services.AppleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apple")
public class AppleController {

    @Autowired
    private AppleServices service;

    @RequestMapping("/devices")
    public List<Device> getAppleDevices() {
            return service.getBlogs();

    }
}
