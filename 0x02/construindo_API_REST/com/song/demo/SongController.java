package com.song.demo;

import com.song.demo.Song;
import com.song.demo.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api-song")
    public class SongController {

        @Autowired
        private SongRepository songRepository;

        @GetMapping("/welcome")
        public String mensagemBoasVindas() {
            return "WELCOME";
        }

        @GetMapping(path = "/allSongs")
        public List<Song> getAllSongs() {
            return songRepository.getAllSongs();

        }

        @GetMapping(path = "/findSong/{id}")
        public Song findSongById(@PathVariable Integer id) {
            return songRepository.getSongById(id);
        }

        @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
        public void addSong(@RequestBody Song song) {
            songRepository.addSong(song);

        }

        @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
        public void updadeSong(@RequestBody Song song) {
            songRepository.updateSong(song);
        }

        @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
        public void deleteSongById(@RequestBody Song song) {
            songRepository.removeSong(song);
        }
    }





