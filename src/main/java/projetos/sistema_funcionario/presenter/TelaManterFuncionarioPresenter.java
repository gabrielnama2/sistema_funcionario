package projetos.sistema_funcionario.presenter;

import projetos.sistema_funcionario.dao.DAO;
import projetos.sistema_funcionario.model.Funcionario;
import projetos.sistema_funcionario.model.Salario;
import projetos.sistema_funcionario.view.TelaManterFuncionario;

public class TelaManterFuncionarioPresenter {
    private TelaManterFuncionario view; 
    
    public TelaManterFuncionarioPresenter(TelaBuscarFuncionarioPresenter telaBuscarFuncionario) {
        this.view = new TelaManterFuncionario();
        
        this.view.getCancelar().addActionListener((e) -> {
            this.view.setVisible(false);
        });
        
        this.view.getSalvar().addActionListener((e) -> {
            String nome = this.view.getNome();
            String cargo = this.view.getCargo();
            
            int idade = this.view.getIdade();
            double salarioBase = this.view.getSalario();
            
            String tipoBonus = this.view.getTipoBonus();
            Salario salario = new Salario(tipoBonus, 0, 0, false, salarioBase);
            Funcionario funcionario = new Funcionario(nome, cargo, idade, salario);
            
            new DAO().salvarFuncionario(funcionario);
            telaBuscarFuncionario.pesquisar();
        });
        
        this.view.setVisible(true);
    }
}
