package com.example.absensiapi.controllers;

import com.example.absensiapi.entities.InventoryAbsensi;
import com.example.absensiapi.services.InventoryAbsensiServiceImpl;
import com.example.absensiapi.utils.SimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryAbsensiController {
    @Autowired
    InventoryAbsensiServiceImpl service;

    @PostMapping
    public ResponseEntity AddListAbsensi(@RequestBody List<InventoryAbsensi> listData) {
        service.AddListLogAbsensi(listData);
        String message = String.format("Data berhasil ditambahkan");
        return ResponseEntity.ok(new SimpleResponse(message));
    }

    @GetMapping
    public List<InventoryAbsensi> GetListAbsensi(@RequestParam(required = false) String nik) {
        if (nik != null) {
            return service.GetLogAbsensiByNik(nik);
        }
        return service.GetAllLogAbsensi();
    }

    @GetMapping("/{id}")
    public InventoryAbsensi GetAbsensiById(@PathVariable String id) {
        return service.GetLogAbsensiById(id);
    }
}
