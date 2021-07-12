package org.ensembl.restservice;

import org.ensembl.restservice.entities.Gene;
import org.ensembl.restservice.repositories.GeneRepository;
import org.ensembl.restservice.services.GeneSuggestService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;





public class GeneSuggestServiceTest {

    private GeneRepository repository = Mockito.mock(GeneRepository.class);

    @Test
    void searchReturnsResults() {

        Gene gene = new Gene("ENSOMYG00000010574",
                "mrb",
                "oncorhynchus_mykiss");


        Mockito.when(repository.search("xs", "rhino", 10))
                .thenReturn(List.of(gene));

    }
}
