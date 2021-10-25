package com.salesianostriana.dam.e07ModeloManytoMany;

import com.salesianostriana.dam.e07ModeloManytoMany.model.AddedTo;
import com.salesianostriana.dam.e07ModeloManytoMany.model.Artist;
import com.salesianostriana.dam.e07ModeloManytoMany.model.Playlist;
import com.salesianostriana.dam.e07ModeloManytoMany.model.Song;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.AddedToRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.ArtistRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.PlaylistRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.repository.SongRepository;
import com.salesianostriana.dam.e07ModeloManytoMany.service.AddedToService;
import com.salesianostriana.dam.e07ModeloManytoMany.service.ArtistService;
import com.salesianostriana.dam.e07ModeloManytoMany.service.PlaylistService;
import com.salesianostriana.dam.e07ModeloManytoMany.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final AddedToService addedToService;
    private final PlaylistService playlistService;

    @PostConstruct
    public void test(){

        Artist a = Artist.builder()
                .name("Charlie Puth")
                .songs(new ArrayList<>())
                .build();

        Song s = Song.builder()
                .artist(a)
                .title("We don't Talk anymore")
                .album("Nine tracks")
                .year("2017")
                .build();

        Song s2 = Song.builder()
                .artist(a)
                .title("Dangerously")
                .album("Nine tracks")
                .year("2017")
                .build();


        Playlist p = Playlist.builder()
                .name("Playlist 1")
                .description("Playlist de canciones")
                .build();

        AddedTo ad = AddedTo.builder()
                .song(s)
                .playlist(p)
                .build();

        s.addArtist(a);
        s2.addArtist(a);

        artistService.save(a);
        songService.save(s);
        songService.save(s2);
        playlistService.save(p);
        addedToService.AddSongToPlaylist(s, p);
        addedToService.AddSongToPlaylist(s2, p);


    }
}
