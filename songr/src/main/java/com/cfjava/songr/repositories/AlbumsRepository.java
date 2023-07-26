package com.cfjava.songr.repositories;

import com.cfjava.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

// STEP 4: CREATE A REPOSITORY THAT EXTENDS JpaRepository
public interface AlbumsRepository extends JpaRepository<Album, Long> {
    //this gives me save(), delete(), update(), finaAll().

    //STEP 5: ADD MAGIC METHOD DECLARATION
public AlbumsRepository findByTitle(String title);
}
