package ma.isga.gesimmob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.isga.gesimmob.entities.Document;

public interface DocRepository extends JpaRepository<Document, Long> {

}
