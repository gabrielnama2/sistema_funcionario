<h1 align="center">
    Sistema de gestão de funcionários
</h1>


<h4 align="center">
  Trabalho desenvolvido para a disciplina de Projetos de Sistemas de Software. 
</h4>

<h6 align="center">
    Código da disciplina: COD_ATIVIDADE = SGF_2022_1
</h6>

</br>

```
FuncionarioCollection funcionarios = new FuncionarioCollection();

//  Funcionario 1
Salario salarioGabriel = new Salario("generoso", 5, 4, true, 1000);
Funcionario Gabriel = new Funcionario("Gabriel", "Estagiario", 24, salarioGabriel);

// Funcionario 2
Salario salarioDanilo = new Salario("generoso", 0, 0, false, 1500);
Funcionario Danilo = new Funcionario("Danilo", "Programador Jr", 24, salarioDanilo);

// CRUD
funcionarios.incluir(Gabriel);
funcionarios.incluir(Danilo);
funcionarios.excluir(Gabriel);
funcionarios.modificar(Danilo, "faltas", "10"); 
// "idade", "nome", "cargo", "faltas", "funcionarioDoMes",
// "tempoServico", "tipoBonusPadrao", "salarioBase"

// Salário
funcionarios.getFuncionario(Danilo).getSalario().calcularSalario();

// Bonus
funcionarios.getFuncionario(Danilo).getSalario().listaHistorico();
```
</br>

## :rocket: Sobre o projeto
Um sistema simples de funcionário, com possibilidade de adicionar, remover, modificar e gerar bônus dos mesmos.
</br>

---

#### Feito por: Danilo José e Gabriel Namã
#### 

<h5 align="center">
Universidade Federal do Espírito Santo - Campus Alegre | COD_ATIVIDADE = SGF_2022_1
</h5>
