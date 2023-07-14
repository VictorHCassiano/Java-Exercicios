package Heranca;
import java.util.Date;
public class Escola {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedro","12345678911",new Date());
		aluno1.matricula = "001";
		
		Professor professor1 = new Professor("Joao","12345678912",new Date());
		professor1.salario = 2452;
		professor1.disciplina = "Ingles";
				
		Funcionario funcionario1 = new Funcionario("Lucas","123456789012",new Date());
		funcionario1.salario = 1000;
		funcionario1.data_admissao = new Date();
		funcionario1.cargo = "Zelador";
		
		System.out.println("Aluno");
		System.out.println("Nome:"+aluno1.nome+" CPF:"+aluno1.cpf+" Data:"+aluno1.data_nascimento+" Matricula:"+aluno1.matricula );
		System.out.println("Professor");
		System.out.printf("\nNome:%s CPF:%s Data:%s Disciplina:%s Salario:%f",professor1.nome,professor1.cpf,professor1.data_nascimento,professor1.disciplina,professor1.salario);
		System.out.println("\nFuncionario");
		System.out.printf("\nNome:%s CPF:%s Data:%s Salario:%f Data_admissao:%s Cargo:%s",funcionario1.nome,funcionario1.cpf,funcionario1.data_nascimento,funcionario1.salario,funcionario1.data_admissao,funcionario1.cargo);
		
	}

}
