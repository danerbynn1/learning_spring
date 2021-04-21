package com.erbynn.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.erbynn.roomwebapp.models.Position;
import com.erbynn.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private static final List<StaffMember> staff = new ArrayList();

    static{
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Dan", "Erbz", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Chris", "Boot", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Charles", "Boye", Position.SECURITY));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Liz", "Tran", Position.HOUSEKEEPING));
    }

    public List<StaffMember> getAllStaff(){
        return staff;
    }
}
