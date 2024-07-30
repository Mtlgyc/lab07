
public class Funcionario {
	private String nome;
	protected double salario;
	private static double valeRefeicaoDiario = 15.00;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void reajustaValeRefeicaoDiario(double Valor) {
		this.valeRefeicaoDiario = Valor;
	}
	public static double getValeRefeicaoDiario() {
		return valeRefeicaoDiario;
	}
	public void bonification(double salario) {
		this.salario = salario + (salario * 0.1);
	}
	public static void mostraDados(String nome, double salario) {
		System.out.println("")
	}
	
}
