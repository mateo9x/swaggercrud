package com.mateo9x.swaggercrud.service;

import com.mateo9x.swaggercrud.model.Phone;
import com.mateo9x.swaggercrud.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public List<Phone> ShowAllPhones() {
        return phoneRepository.findAll();
    }


    public Phone getSinglePhone(Long id) {
        return phoneRepository.findById(id).orElseThrow();
    }

    public Phone addNewPhone(Phone phone){
        return phoneRepository.save(phone);
    }

    public void deletePhone(Long id){
        phoneRepository.deleteById(id);
    }

    public Phone editPhone(Phone phone){
        Phone phoneEdited = phoneRepository.findById(phone.getId()).orElseThrow();
        phoneEdited.setBrand(phone.getBrand());
        phoneEdited.setColor(phone.getColor());
        phoneEdited.setModel(phone.getModel());
        return phoneEdited;

    }
}