package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.entity.MembroEntity;


public interface MembroRepository extends JpaRepository<MembroEntity,Integer> {
}
