package com.example.absensiapi.services;

import com.example.absensiapi.entities.InventoryAbsensi;

import java.util.List;

public interface InventoryAbsensiService {
    public List<InventoryAbsensi> AddListLogAbsensi(List<InventoryAbsensi> listData);
    public List<InventoryAbsensi> GetAllLogAbsensi();
    public List<InventoryAbsensi> GetLogAbsensiByNik(String nik);
    public InventoryAbsensi GetLogAbsensiById(String absensiLogId);
}
