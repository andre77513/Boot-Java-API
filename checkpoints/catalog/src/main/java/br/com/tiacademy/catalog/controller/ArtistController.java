package br.com.tiacademy.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.com.tiacademy.catalog.repository.ArtistRepository;
import br.com.tiacademy.catalog.domain.Artist;

@RestController
@RequestMapping("/artista")
public class ArtistController {

    @Autowired
    private ArtistRepository artistRepository;

    @GetMapping
    public List<Artist> artistAll() {
        return artistRepository.findAll();
    }

}
