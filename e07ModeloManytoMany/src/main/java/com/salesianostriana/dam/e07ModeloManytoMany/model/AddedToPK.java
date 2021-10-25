package com.salesianostriana.dam.e07ModeloManytoMany.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class AddedToPK implements Serializable {

    private Long song_id;

    private Long playlist_id;
}
