package org.ensembl.restservice.controllers;


import lombok.RequiredArgsConstructor;
import org.ensembl.restservice.entities.Gene;
import org.ensembl.restservice.repositories.GeneRepository;
import org.ensembl.restservice.services.GeneSuggestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>Maps request to the appropriate service method(s)</p>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/gene-suggestion")
public class GeneSuggestionController {

    private final GeneSuggestService service;

    /**
     * @param label
     * @param species
     * @param limit
     * @return list of genes that match the search criteria
     */
    @GetMapping("/")
    public ResponseEntity<List<Gene>> search(@RequestParam String label, @RequestParam String species, @RequestParam Integer limit) {
        return service.search(label, species, limit);
    }

}
