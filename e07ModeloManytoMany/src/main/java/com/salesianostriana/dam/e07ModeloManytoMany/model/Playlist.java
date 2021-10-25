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
public class Playlist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Builder.Default
    @OneToMany(mappedBy = "playlist")
    private List<AddedTo> addedTo = new ArrayList<>();


}
