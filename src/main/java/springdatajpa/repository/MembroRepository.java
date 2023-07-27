package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.entity.Membro;


public interface MembroRepository extends JpaRepository<Membro,Integer> {
}
