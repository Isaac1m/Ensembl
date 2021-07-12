package org.ensembl.restservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Indexed;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p> The stableId is being used as the unique ID for each gene.
 *  The 'JsonIgnore' annotation removes the field from responses.
 * </p>
 *
 */
@Entity
@Table(name = "gene_autocomplete")
@Getter
@Setter
@Indexed
@AllArgsConstructor
@NoArgsConstructor
public class Gene {

    @Id
    @JsonIgnore
    private String stableId;


    private String displayLabel;

    @JsonIgnore
    private String species;
}
