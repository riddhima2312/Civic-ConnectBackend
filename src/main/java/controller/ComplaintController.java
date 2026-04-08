package com.civicconnect.backend.controller;

import com.civicconnect.backend.model.Complaint;
import com.civicconnect.backend.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "http://localhost:3000")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @PostMapping
    public Complaint createComplaint(@RequestBody Complaint complaint) {
        return service.saveComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getComplaints() {
        return service.getAllComplaints();
    }
}