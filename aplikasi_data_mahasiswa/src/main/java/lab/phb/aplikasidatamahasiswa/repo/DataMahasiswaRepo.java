package lab.phb.aplikasidatamahasiswa.repo;

import lab.phb.aplikasidatamahasiswa.entity.DataMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMahasiswaRepo extends JpaRepository<DataMahasiswa, String> {
}
