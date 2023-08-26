package de.munichdeveloper.magic.auth.controller;

import de.munichdeveloper.magic.auth.dto.CatResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cats")
public class CatController {

    @GetMapping
    public CatResponse cat() {
        return new CatResponse("kitty cat");
    }

}
