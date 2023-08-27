package de.munichdeveloper.magic.auth.controller;

import de.munichdeveloper.magic.auth.dto.CatDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/cats")
public class CatController {

    @GetMapping
    public List<CatDTO> cat() {
        return asList(
                new CatDTO("kitty cat"),
                new CatDTO("garfield"),
                new CatDTO("catwoman")
        );
    }

}
