package com.example.absensiapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@AllArgsConstructor@NoArgsConstructor
@Setter@Getter
@Table(name = "mst_inventory_absensi")
public class InventoryAbsensi {
    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid")
    @Column(name = "absensilog_id")
    public String id;
    public String nik;
    public String flag;
    public String leave_flag;
    public String keterangan;
    public Float latitude;
    public Float longitude;
    public String address;
    public String waktu;
    public Integer hub_id;
    public Integer device_id;
}
