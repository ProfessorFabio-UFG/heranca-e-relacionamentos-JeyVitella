public class PessoaJuridica extends Pessoa{
    protected String cnpj;
    protected String razaoSocial;

    public PessoaJuridica(String nome, String endereço, String telefone, String cnpj, String razaoSocial){
        super(nome, endereço, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getRazaoSocial(){
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
}