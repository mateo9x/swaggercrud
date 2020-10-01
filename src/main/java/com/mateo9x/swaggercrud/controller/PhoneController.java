package com.mateo9x.swaggercrud.controller;

import com.mateo9x.swaggercrud.model.Phone;
import com.mateo9x.swaggercrud.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping("/phones")
    public List<Phone> ShowAllPhones(){
        return phoneService.ShowAllPhones();
    }

    @GetMapping("/phones/{id}")
    public Phone getSinglePhone(@PathVariable Long id){
        return phoneService.getSinglePhone(id);
}

    @PostMapping("/phones/new")
    public Phone addNewPhone(@RequestBody Phone phone){
        return phoneService.addNewPhone(phone);
    }

    @DeleteMapping("/phones/{id}/delete")
    public void deletePhone(@PathVariable Long id){
        phoneService.deletePhone(id);
    }

    @PutMapping("/phones")
    public Phone editPhone(@RequestBody Phone phone){
        return phoneService.editPhone(phone);
    }
}
