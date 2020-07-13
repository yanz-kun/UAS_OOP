package lab.phb.aplikasidatamahasiswa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_app")
@Data
public class DataMahasiswa {

    @Id @Column(name = "nim")
    private String Nim;
    @Column(name = "nama")
    private String Nama;
    @Column(name = "jurusan")
    private String Jurusan;
    @Column(name = "alamat")
    private String Alamat;

}
