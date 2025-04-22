

public class Cliente extends PessoaFisica {
    protected double renda;
    protected String interesses;
    protected String profissao;
    
    public Cliente(String nome, String endereço, String telefone, String cpf, char sexo, int estadoCivil, double renda, String interesses, String profissao){
        super(nome, endereço, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.interesses =interesses;
        this.profissao = profissao;
    }

    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda){
        this.renda = renda;
    }

    public String getInteresses(){
        return interesses;
    }

    public void setInteresses(String interesses){
        this.interesses = interesses;
    }

    public String getProfissao(){
        return profissao;
    }

    public void profissao(String profissao){
        this.profissao = profissao;
    }

    @Override
    public String toString(){
        return "Cliente: " + nome + ", CPF: " + cpf + ", Renda: " + renda;
    }
}
