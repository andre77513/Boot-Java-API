package br.com.tiacademy.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tiacademy.catalog.domain.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
