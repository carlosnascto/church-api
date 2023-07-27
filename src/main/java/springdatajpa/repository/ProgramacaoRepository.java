package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.entity.Programacao;

public interface ProgramacaoRepository extends JpaRepository<Programacao,Integer> {
}
