public class Funcionario extends PessoaFisica {
    protected int matricula;
    protected double salario;
    protected String cargo;

        public Funcionario(String nome, String endereço, String telefone, String cpf, char sexo, int estadoCivil, int matricula, double salario, String cargo){
            super(nome, endereço, telefone, cpf, sexo, estadoCivil);
            this.matricula = matricula;
            this.salario = salario;
            this.cargo = cargo;
        }

        public int getMatricula(){
            return matricula;
        }

        public void setMatricula(int matricula){
            this.matricula = matricula;
        }

        public double getSalario(){
            return salario;
        }

        public void setSalario(double salario){
            this.salario = salario;
        }

        public String getCargo(){
            return cargo;
        }

        public void setCargo(String cargo){
            this.cargo = cargo;
        }

        @Override
        public String toString(){
            return "Funcionario: " + nome + ", Cargo: " + cargo + ", Matricula: " + matricula;
        }
}
