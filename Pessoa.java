public class Pessoa {
    protected String nome;
    protected String endereço;
    protected String telefone;

    public Pessoa( String nome, String endereço, String telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;  
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereço(){
        return endereço;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}