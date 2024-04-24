package com.hitema.intro.services;

import com.hitema.intro.models.Staff;

import java.util.List;

public interface StaffService {

    public Staff create(Staff staff);
    public Staff read(Long id);
    public Staff update(Staff staff);
    public Boolean delete(Long id);
    public List<Staff> readAll();
}
