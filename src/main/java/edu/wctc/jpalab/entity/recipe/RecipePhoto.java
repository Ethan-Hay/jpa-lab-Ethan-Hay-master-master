package edu.wctc.jpalab.entity.recipe;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;


@Entity
@Data
@NoArgsConstructor
@Table(name = "Photo", schema = "recipe")
public class RecipePhoto {
@Id
    @Column(name = "photo_id")
    private int id;
@Column(name = "photo_recipe_id")
    private int recId;
@Column(name = "photo_filename")
    private String fileName;
@Column(name = "photo_caption")
    private String caption;
@Column(name = "photo_datestamp")
    private Timestamp datestamp;
@Column(name = "photo_visible")
    private char visible;
}
