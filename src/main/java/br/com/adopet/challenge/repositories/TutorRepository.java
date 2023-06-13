package br.com.adopet.challenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adopet.challenge.entities.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long>{
    
}
