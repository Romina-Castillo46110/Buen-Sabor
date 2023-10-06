package com.example.Buen.Sabor.controllet;
import com.example.Buen.Sabor.entities.Persona;
import com.example.Buen.Sabor.repositories.PersonaRepository;
import com.example.Buen.Sabor.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
}
