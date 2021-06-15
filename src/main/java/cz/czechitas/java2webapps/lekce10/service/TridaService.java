package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.RodicRepository;
import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import cz.czechitas.java2webapps.lekce10.repository.UcitelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TridaService {

    private final TridaRepository tridaRepository;
    private final StudentRepository studentRepository;
    private final RodicRepository rodicRepository;
    private final UcitelRepository ucitelRepository;

    @Autowired
    public TridaService(TridaRepository tridaRepository, StudentRepository studentRepository, RodicRepository rodicRepository, UcitelRepository ucitelRepository) {
        this.tridaRepository = tridaRepository;
        this.studentRepository = studentRepository;
        this.rodicRepository = rodicRepository;
        this.ucitelRepository = ucitelRepository;
    }

    public List seznamTrid (){
        return tridaRepository.findAll();
    }

    public Trida najdiTridu (short id){
        Optional<Trida> konkretniTrida = tridaRepository.findById(id);
        return konkretniTrida.get();
    }

    public Student najdiStudenta (Integer id){
        Optional <Student> konkretniStudent = studentRepository.findById(id);
        return konkretniStudent.get();
    }

}
