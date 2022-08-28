package com.example.absensiapi.repositories;

import com.example.absensiapi.entities.InventoryAbsensi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryAbsensiRepository extends JpaRepository<InventoryAbsensi, String> {
    @Query(value = "select * from mst_inventory_absensi mia where mia.nik = ?1", nativeQuery = true)
    public List<InventoryAbsensi> GetAbsensiByNik(String nik);
}
