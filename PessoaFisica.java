public class PessoaFisica extends Pessoa{
    protected String cpf;
    protected char sexo;
    protected int estadoCivil;    

    public PessoaFisica(String nome, String endereço, String telefone, String cpf, char sexo, int estadoCivil){
        super(nome, endereço, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public int getEstadoCivil(){
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil){
        this.estadoCivil = estadoCivil;
    }
}
