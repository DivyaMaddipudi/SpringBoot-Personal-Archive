package org.divya.resource;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.divya.model.Device;
import org.divya.model.Devices;
import org.divya.repository.SamsungRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @Autowired
    private SamsungRepo repo;

    @RequestMapping("/devices")
    public Devices getDevices() {

        List<Device> devices = repo.findAll();

        Devices devicesList = new Devices(devices);

//        System.out.println(devicesList);
        return devicesList;
    }
}


