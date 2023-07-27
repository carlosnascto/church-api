package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.entity.CongregacaoEntity;


public interface CongregacaoRepository extends JpaRepository<CongregacaoEntity,Integer> {
}
