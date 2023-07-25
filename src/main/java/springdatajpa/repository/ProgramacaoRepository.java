package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.Programacao;

public interface ProgramacaoRepository extends JpaRepository<Programacao,Integer> {
}
