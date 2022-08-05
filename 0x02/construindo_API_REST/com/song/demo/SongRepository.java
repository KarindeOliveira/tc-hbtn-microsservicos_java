package com.song.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        Song songId = null;
        for (Song song : list) {
            if (song.getId() == id) {
                songId = song;
            }
        }
        return songId;
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        for (Song song : list) {
            if (song.getId() == s.getId()) {
                int position = list.indexOf(song);
                song.setNome(song.getNome());
                song.setArtista(song.getArtista());
                song.setAlbum(song.getAlbum());
                song.setAnoLancamento(song.getAnoLancamento());


                list.set(position, song);
            }
        }
    }

    public void removeSong(Song s) {
        System.out.println(s);
        System.out.println(list.contains(s));
        list.remove(s);
    }
}