package com.cfjava.songr.repositories;

import com.cfjava.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

    public Song findByTitle(String Title );
}
