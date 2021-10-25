package com.salesianostriana.dam.e07ModeloManytoMany.repository;

import com.salesianostriana.dam.e07ModeloManytoMany.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
