package lab.phb.aplikasidatamahasiswa.controller;

import lab.phb.aplikasidatamahasiswa.entity.DataMahasiswa;
import lab.phb.aplikasidatamahasiswa.model.DataMahasiswaModel;
import lab.phb.aplikasidatamahasiswa.services.DataMahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    private DataMahasiswaService service;

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("data", service.getAllData());
        return "index";
    }

    @GetMapping("/tambah")
    public String tampilkanTambahForm(Model model){
        model.addAttribute("data", new DataMahasiswaModel());
        return "tambah-data-mahasiswa";
    }

    @PostMapping("/simpan")
    public String simpan(DataMahasiswaModel data){
        service.save(service.convertToEntity(data));
        return "redirect:/";
    }

    @GetMapping("/ubah/{nim}")
    public String ubah(@PathVariable("nim") String nim, Model model){
        Optional<DataMahasiswa> result = service.findById(nim);
        if (result.isPresent()){
            model.addAttribute("data", result.get());
            return "edit-data-mahasiswa";
        }else {
            return "redirect:/";
        }
    }

    @GetMapping("/hapus/{nim}")
    public String hapus(@PathVariable("nim") String nim){
        service.removeById(nim);
        return "redirect:/";
    }

}
