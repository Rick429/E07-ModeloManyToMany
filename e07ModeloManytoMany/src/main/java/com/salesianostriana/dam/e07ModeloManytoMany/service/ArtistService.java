package com.salesianostriana.dam.e07ModeloManytoMany.service;

import com.salesianostriana.dam.e07ModeloManytoMany.model.Artist;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.ArtistRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
