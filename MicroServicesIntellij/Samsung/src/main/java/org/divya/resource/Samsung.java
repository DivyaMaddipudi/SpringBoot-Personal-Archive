package org.divya.resource;

import org.divya.device.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @RequestMapping("/devices")
    public List<Device> getDevices() {
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Note 9", "Smart phone"));
        devices.add(new Device("S10", "Smart phone"));
        return devices;
    }
}


