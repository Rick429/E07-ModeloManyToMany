package com.salesianostriana.dam.e07ModeloManytoMany.repository;

import com.salesianostriana.dam.e07ModeloManytoMany.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
