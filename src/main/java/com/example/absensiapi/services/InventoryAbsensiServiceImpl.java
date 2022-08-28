package com.example.absensiapi.services;

import com.example.absensiapi.entities.InventoryAbsensi;
import com.example.absensiapi.repositories.InventoryAbsensiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryAbsensiServiceImpl implements InventoryAbsensiService {
    @Autowired
    private InventoryAbsensiRepository repository;

    @Override
    public List<InventoryAbsensi> AddListLogAbsensi(List<InventoryAbsensi> listData) {
        return repository.saveAll(listData);
    }

    @Override
    public List<InventoryAbsensi> GetAllLogAbsensi() {
        return repository.findAll();
    }

    @Override
    public List<InventoryAbsensi> GetLogAbsensiByNik(String nik) {
        return repository.GetAbsensiByNik(nik);
    }

    @Override
    public InventoryAbsensi GetLogAbsensiById(String absensiLogId) {
        return repository.findById(absensiLogId).get();
    }
}
