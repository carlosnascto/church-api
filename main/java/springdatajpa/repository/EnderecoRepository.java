package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
}
