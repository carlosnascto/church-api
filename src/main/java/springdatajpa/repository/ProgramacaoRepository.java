package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.entity.ProgramacaoEntity;

public interface ProgramacaoRepository extends JpaRepository<ProgramacaoEntity,Integer> {
}
