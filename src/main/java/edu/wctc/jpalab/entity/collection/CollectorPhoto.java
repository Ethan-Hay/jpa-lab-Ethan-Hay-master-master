package edu.wctc.jpalab.entity.collection;


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
@Table(name = "Photo", schema = "collection")
public class CollectorPhoto {
@Id
    @Column(name = "photo_id")
    private int id;
@Column(name = "photo_collector_id")
    private int collId;
@Column(name = "photo_filename")
    private String filename;
@Column(name = "photo_datestamp")
    private Timestamp datestamp;
@Column(name = "photo_visible")
    private char visible;
}
