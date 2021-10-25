package com.salesianostriana.dam.e07ModeloManytoMany.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder @Getter @Setter
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    private Artist artist;
    private String album;
    private String year;

    @Builder.Default
    @OneToMany(mappedBy = "song")
    private List<AddedTo> addedTo = new ArrayList<>();

    public void addArtist(Artist a) {
        this.artist=a;
        a.getSongs().add(this);
    }
    public void removeArtist(Artist a){
        a.getSongs().remove(this);
        this.artist = null;
    }
}
