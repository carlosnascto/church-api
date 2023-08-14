package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.entity.DepartamentoEntity;

public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Integer> {
}
