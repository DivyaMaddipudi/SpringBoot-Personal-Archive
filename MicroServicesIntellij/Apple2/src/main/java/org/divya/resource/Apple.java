package org.divya.resource;

import org.divya.model.Device;
import org.divya.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @RequestMapping("/devices")
    public Devices getDevices() {

        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Note 9", "Smart phone"));
        devices.add(new Device("S10", "Smart phone"));

        Devices devicesList = new Devices(devices);
        return devicesList;
    }
}


