package com.civicconnect.backend.service;

import com.civicconnect.backend.model.Complaint;
import com.civicconnect.backend.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository repo;

    public Complaint saveComplaint(Complaint complaint) {
        return repo.save(complaint);
    }

    public List<Complaint> getAllComplaints() {
        return repo.findAll();
    }
}