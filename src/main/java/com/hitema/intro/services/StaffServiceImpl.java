package com.hitema.intro.services;

import com.hitema.intro.models.Staff;
import com.hitema.intro.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    StaffRepository staffRepository;

    @Autowired
    public StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public Staff create(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff read(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    @Override
    public Staff update(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Boolean delete(Long id) {
        staffRepository.deleteById(id);
        return read(id)==null;
    }

    @Override
    public List<Staff> readAll(){
        return staffRepository.findAll();
    }

}
