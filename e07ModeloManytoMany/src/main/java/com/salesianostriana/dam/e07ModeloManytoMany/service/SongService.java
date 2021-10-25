package com.salesianostriana.dam.e07ModeloManytoMany.service;

import com.salesianostriana.dam.e07ModeloManytoMany.model.Song;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.SongRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
