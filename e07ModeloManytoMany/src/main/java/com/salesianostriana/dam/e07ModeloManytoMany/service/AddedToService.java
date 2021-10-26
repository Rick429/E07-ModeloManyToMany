package com.salesianostriana.dam.e07ModeloManytoMany.service;

import com.salesianostriana.dam.e07ModeloManytoMany.model.AddedTo;
import com.salesianostriana.dam.e07ModeloManytoMany.model.AddedToPK;
import com.salesianostriana.dam.e07ModeloManytoMany.model.Playlist;
import com.salesianostriana.dam.e07ModeloManytoMany.model.Song;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.AddedToRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {

    public AddedTo AddSongToPlaylist(Song s, Playlist p){

        AddedTo a = AddedTo.builder()
                .song(s)
                .playlist(p)
                .dateTime(LocalDateTime.now())
                .build();

        a.setOrder(a.getPlaylist().getAddedTo().size());
        save(a);

     return a;
    }
}
