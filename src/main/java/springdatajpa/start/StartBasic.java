package springdatajpa.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springdatajpa.model.entity.*;
import springdatajpa.model.enums.MembroTipo;
import springdatajpa.model.enums.Sexo;
import springdatajpa.repository.MinisterioRepository;
import springdatajpa.repository.CongregacaoRepository;
import springdatajpa.repository.MembroRepository;

import java.sql.Date;

@Component // componente gerado pelo spring
public class StartBasic implements CommandLineRunner {
    @Autowired // indica a injeção automática pelo spring
    private MinisterioRepository congregacaoCrud;
    @Autowired
    private CongregacaoRepository sedeCrud;
    @Autowired
    private MembroRepository membroCrud;


    @Override // indica que este método sobrescreve um método da superclasse
    public void run(String... args) throws Exception {
       //incluirCongregacao();
       //incluirSede(); //erro
        //incluirMembro();
    }

    private MinisterioEntity incluirCongregacao(){
        MinisterioEntity congregacao  = congregacaoCrud.findById(3).orElse(null);
        if(congregacao==null) {
            congregacao = new MinisterioEntity();
            congregacao.setNome("Igreja Batista Vinho Novo");
            congregacaoCrud.save(congregacao);
            System.out.println("congregacao adicionada com sucesso");
        }
        return congregacao;
    }

    private CongregacaoEntity incluirSede(){
        CongregacaoEntity sede  = sedeCrud.findById(1).orElse(null);
        if(sede==null) {
            sede = new CongregacaoEntity();
            sede.setNome("Igreja Apostólica Gerando Vidas - Santa Inês");
            sede.setCnpj("23457872878395");
            sede.setEmail("iagv-sti");
            sede.setPastorLider("Téo Freitas");
            sede.setTelefone(98912345678L);
            sede.setDataInicio(Date.valueOf("2009-11-12"));
            sedeCrud.save(sede);
            System.out.println("sede adicionada com sucesso");
        }
        return sede;
    }

    private MembroEntity incluirMembro(){
                MembroEntity membro  = membroCrud.findById(2).orElse(null);
                if(membro==null) {
                    membro = new MembroEntity();
                    membro.setNome("Carlos Henrique Oliveira");
                    membro.setTelefone(98983479785L);
                    membro.setSexo(Sexo.MASCULINO);
                    membro.setTipo(MembroTipo.CONGREGADO);
            membroCrud.save(membro);
            System.out.println("membro adicionado com sucesso");
        }
        return membro;
    }


}
