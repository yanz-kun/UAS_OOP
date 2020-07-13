package lab.phb.aplikasidatamahasiswa.repo;

import lab.phb.aplikasidatamahasiswa.entity.DataMahasiswa;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class DataMahasiswaRepoTest {

    @Autowired
    private DataMahasiswaRepo repo;

    private Logger logger = LoggerFactory.getLogger(DataMahasiswaRepoTest.class);

    @Test
    public void findAllTest(){
        List<DataMahasiswa> result = repo.findAll();
        logger.info("jumlah data : " + result.size());
        Assert.notNull(result);
        Assert.notEmpty(result);
    }

}
