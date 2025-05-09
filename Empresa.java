public class Empresa {
    public static void main(String[] args) {
    Funcionario v = new Vendedor(2000, 500); // Vendedor com salário base de 2000 e comissão de 500
    Funcionario f = new FreeLancer(20, 150); // Freelancer com 20 dias trabalhados a 150 cada
    Funcionario g = new Gerente(3000, 1000); // Gerente com salario base de 3000 e com bonus de 1000
    Funcionario g2 = new Gerente(3000, 1000); // Gerente 2
    System.out.println("Salário do Vendedor: " + obterSalarioDoFuncionario(v)); // Chama vendedor
    System.out.println("Salário do Freelancer: " + obterSalarioDoFuncionario(f)); //Chama Freelancer
    System.out.println("Salário do Gerente: " + obterSalarioDoFuncionario(g)); // Chama Gerente
    System.out.println("Salário do Gerente: " + obterSalarioDoFuncionario(g2)); // Chama Gerente  
    }
    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal(); // Polimorfismo em ação
    }
}
 