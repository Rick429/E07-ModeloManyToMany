package com.salesianostriana.dam.e07ModeloManytoMany.service;

import com.salesianostriana.dam.e07ModeloManytoMany.model.Playlist;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.PlaylistRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlaylistRepository> {
}
