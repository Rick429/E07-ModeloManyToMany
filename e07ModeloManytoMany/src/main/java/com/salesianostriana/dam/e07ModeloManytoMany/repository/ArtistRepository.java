package com.salesianostriana.dam.e07ModeloManytoMany.repository;

import com.salesianostriana.dam.e07ModeloManytoMany.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
