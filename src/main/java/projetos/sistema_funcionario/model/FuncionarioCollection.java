package projetos.sistema_funcionario.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projetos.sistema_funcionario.dao.DAO;

public class FuncionarioCollection {
    private static final Logger LOGGER = LoggerFactory.getLogger(FuncionarioCollection.class);

    private List<Funcionario> funcionarios;
    
    public FuncionarioCollection() {
        this.funcionarios = new DAO().getFuncionarios();
    }
    
    // CRUD
    public void incluir(Funcionario func) {
        try {
            if (possuiFuncionarioByName(func.getNome())) {
                throw new RuntimeException("Funcionario já existente");
            }
            LOGGER.info("Novo funcionário: " + func.getNome());
            funcionarios.add(func);
            this.setFuncionarios(this.getFuncionarios());
        } catch(Exception e) {
            LOGGER.info("Erro: " + e);
        }
    }
    
    public void excluir(Funcionario func) {
        try {
            if (!possuiFuncionario(func)) {
                throw new RuntimeException("Funcionario não existente");
            }
            LOGGER.info("Excluindo funcionário: " + func.getNome());
            funcionarios.remove(func);
            this.setFuncionarios(this.getFuncionarios());
        } catch(Exception e) {
            LOGGER.info("Erro: " + e);
        }
    }
    
    
    public void modificar (Funcionario func, String tipoModificacao, String novoValor) {
        try {
            if (!possuiFuncionario(func)) {
                throw new RuntimeException("Funcionario não existente");
            }
            LOGGER.info("Funcionario " + func.getNome() + "alterado");

            if(tipoModificacao.equals("idade")) {
                int novoValor_Int = Integer.parseInt(novoValor);
                Funcionario auxFunc = func;
                auxFunc.setIdade(novoValor_Int);

                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
            
            if(tipoModificacao.equals("nome")) {
                Funcionario auxFunc = func;
                auxFunc.setNome(novoValor);
                
                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
            
            if(tipoModificacao.equals("cargo")) {
                Funcionario auxFunc = func;
                auxFunc.setCargo(novoValor);
                
                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
            
            if(tipoModificacao.equals("faltas")) {
                int novoValor_Int = Integer.parseInt(novoValor);
                Funcionario auxFunc = func;
                auxFunc.getSalario().setFaltas(novoValor_Int);

                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
            
            if(tipoModificacao.equals("funcionarioDoMes")) {
                boolean novoValor_Bool = Boolean.parseBoolean(novoValor);
                Funcionario auxFunc = func;
                auxFunc.getSalario().setFuncionarioMes(novoValor_Bool);

                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
            
            if(tipoModificacao.equals("tempoServico")) {
                int novoValor_Int = Integer.parseInt(novoValor);
                Funcionario auxFunc = func;
                auxFunc.getSalario().setTempoServico(novoValor_Int);

                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
            
            if(tipoModificacao.equals("tipoBonusPadrao")) {
                Funcionario auxFunc = func;
                auxFunc.getSalario().setTipoBonusPadrao(novoValor);

                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
            
            if(tipoModificacao.equals("salarioBase")) {
                double novoValor_Double = Double.parseDouble(novoValor);
                Funcionario auxFunc = func;
                auxFunc.getSalario().setSalarioBase(novoValor_Double);

                funcionarios.set(funcionarios.indexOf(func), auxFunc);
                this.setFuncionarios(this.getFuncionarios());
            }
        } catch(Exception e) {
            LOGGER.info("Erro: " + e);
        }
    }
    
    public void calcularSalarios(List<Funcionario> funcionariosCalcular) {
        for(Funcionario fCalcular: funcionariosCalcular) {
            for(Funcionario f: this.getFuncionarios()) {
                if (f.toString().equals(fCalcular.toString())) {
                    f.calculaSalario();
                }
            }
        }
        this.setFuncionarios(this.getFuncionarios());
    }
    
    public void listar() {
        for(Funcionario func: this.getFuncionarios()) {
            System.out.println(func.toString());
        }
    }
    
    // middlewares de verificação
    public boolean possuiFuncionarioByName(String name) {
        for (Funcionario arrayFunc : this.getFuncionarios()) {
            if (name.equals(arrayFunc.getNome())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean possuiFuncionario(Funcionario func) {
        for (Funcionario arrayFunc : this.getFuncionarios()) {
            if (arrayFunc.toString().equals(func.toString())) {
                return true;
            }
        }
        return false;
    }
    
    // gets e sets
    public List<Funcionario> getFuncionariosByName(String name) {
        List<Funcionario> retornoFuncionarios = new ArrayList<Funcionario>();
        boolean achouFuncionario = false;

        for (Funcionario funcs : this.getFuncionarios()) {
            if (name.equals(funcs.getNome())) {
                retornoFuncionarios.add(funcs);
                achouFuncionario = true;
            }
        }
        if (!achouFuncionario) {
            return funcionarios;
        } else {
            return retornoFuncionarios;
        }
    }
    
    public Funcionario getFuncionarioByName(String name) {
        Funcionario retornoFuncionario = new Funcionario("Danilo", "Programador Jr", 24, new Salario("generoso", 5, 3, true, 1000));
        boolean achouFuncionario = false;
        try {
            for (Funcionario funcs : this.getFuncionarios()) {
                if (name.equals(funcs.getNome())) {
                    retornoFuncionario = funcs;
                    achouFuncionario = true;
                }
            }
            if (!achouFuncionario) {
                throw new RuntimeException("Funcionario não existente");
            }
        } catch(Exception e) {
            LOGGER.info("Erro: " + e);
        } 
        return retornoFuncionario;
    }
    
    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(List<Funcionario> funcs) {
        new DAO().salvarFuncionarios(funcs);
        
        this.funcionarios = funcs;
    }
}
