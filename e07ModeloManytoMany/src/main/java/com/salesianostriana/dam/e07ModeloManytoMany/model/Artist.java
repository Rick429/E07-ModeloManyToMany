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
public class Artist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    private List<Song> songs = new ArrayList<>();




}
