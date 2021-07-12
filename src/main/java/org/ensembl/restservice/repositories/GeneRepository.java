package org.ensembl.restservice.repositories;

import org.ensembl.restservice.entities.Gene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneRepository extends JpaRepository<Gene, String> {

    @Query(value =  "SELECT g.stable_id, g.display_label, g.species FROM gene_autocomplete g WHERE g.display_label LIKE %?1% AND g.species LIKE %?2% limit ?3", nativeQuery = true)
    List<Gene> search (String query, String species, Integer limit);
}
