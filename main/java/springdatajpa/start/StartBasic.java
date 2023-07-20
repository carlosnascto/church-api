package springdatajpa.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springdatajpa.model.*;
import springdatajpa.repository.CongregacaoRepository;
import springdatajpa.repository.EnderecoRepository;
import springdatajpa.repository.SedeRepository;
import springdatajpa.repository.MembroRepository;

import java.sql.Date;

@Component // componente gerado pelo spring
public class StartBasic implements CommandLineRunner {
    @Autowired // indica a injeção automática pelo spring
    private CongregacaoRepository congregacaoCrud;
    @Autowired
    private SedeRepository sedeCrud;
    @Autowired
    private MembroRepository membroCrud;

    @Autowired
    private EnderecoRepository enderecoCrud;

    @Override // indica que este método sobrescreve um método da superclasse
    public void run(String... args) throws Exception {
       //incluirCongregacao();
       //incluirSede(); //erro
        //incluirMembro();
        incluirEndereco();
    }

    private Congregacao incluirCongregacao(){
        Congregacao congregacao  = congregacaoCrud.findById(3).orElse(null);
        if(congregacao==null) {
            congregacao = new Congregacao();
            congregacao.setNome("Igreja Batista Vinho Novo");
            congregacaoCrud.save(congregacao);
            System.out.println("congregacao adicionada com sucesso");
        }
        return congregacao;
    }

    private Sede incluirSede(){
        Sede sede  = sedeCrud.findById(1).orElse(null);
        if(sede==null) {
            sede = new Sede();
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

    private Membro incluirMembro(){
                Membro membro  = membroCrud.findById(2).orElse(null);
                if(membro==null) {
                    membro = new Membro();
                    membro.setNome("Carlos Henrique Oliveira");
                    membro.setTelefone(98983479785L);
                    membro.setSexo(Sexo.MASCULINO);
                    membro.setTipo(MembroTipo.CONGREGADO);
            membroCrud.save(membro);
            System.out.println("membro adicionado com sucesso");
        }
        return membro;
    }

    private Endereco incluirEndereco(){
        Endereco endereco  = enderecoCrud.findById(2).orElse(null);
        if(endereco==null) {
            endereco = new Endereco();
            endereco.setLogradouro("Rua Osvaldo Cruz");
            endereco.setNumero(1780);
            endereco.setBairro("Canaã");
            endereco.setComplemento("Em frente o poço da caema");
            endereco.setCidade("Santa Inês");
            endereco.setEstado("MA");
            endereco.setCep(65300695);
            enderecoCrud.save(endereco);
            System.out.println("endereco adicionado com sucesso");
        }
        return endereco;
    }

}
