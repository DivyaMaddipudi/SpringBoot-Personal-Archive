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
    public Devices getAppleDevices() {
        Devices devicesList;
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Iphone 8", "Apple"));
        devices.add(new Device("Iphone 8 pro", "Apple"));
        devicesList = new Devices(devices);
        return devicesList;
    }
}
