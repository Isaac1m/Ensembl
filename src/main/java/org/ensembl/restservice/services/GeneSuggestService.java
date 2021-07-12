package org.ensembl.restservice.services;


import lombok.RequiredArgsConstructor;
import org.ensembl.restservice.entities.Gene;
import org.ensembl.restservice.repositories.GeneRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class GeneSuggestService {

    private final GeneRepository repository;


    /**
     * @param query
     * @param species
     * @param limit
     * @return
     */
    public ResponseEntity<List<Gene>> search(String query, String species, Integer limit) {
        List<Gene> results = repository.search(query, species, limit);
        return ResponseEntity.ok(results);

    }



}
