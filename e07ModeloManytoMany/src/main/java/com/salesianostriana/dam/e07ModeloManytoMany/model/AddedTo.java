package com.salesianostriana.dam.e07ModeloManytoMany.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder @Getter @Setter
public class AddedTo implements Serializable {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();


    @ManyToOne
    @MapsId("song_id") //lo asocia a una columna ya existente y no se cree una nueva
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;


    private LocalDateTime dateTime;
    @Column(name = "orden")
    private int order;
    /*
        HELPERS
     */
    
    public void addToSong(Song s) {
        song = s;
        s.getAddedTo().add(this);
    }

    public void removeFromSong(Song s) {
        s.getAddedTo().remove(this);
        song = null;
    }

    public void addToPlaylist(Playlist p) {
        playlist = p;
        p.getAddedTo().add(this);
    }

    public void removeFromPlaylist(Playlist p) {
        p.getAddedTo().remove(this);
        playlist = null;
    }

    public void addPlaylistSong(Playlist playlist, Song song) {
        addToSong(song);
        addToPlaylist(playlist);
    }

    public void removeAsignaturaAlumno(Playlist playlist, Song song) {
        removeFromSong(song);
        removeFromPlaylist(playlist);
    }
}
