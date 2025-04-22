

public class Fornecedor extends PessoaJuridica{
    protected String produtos;
    
    public Fornecedor(String nome, String endereço, String telefone, String cnpj, String razaoSocia, String produtos){
        super(nome, endereço, telefone, cnpj, razaoSocia);
        this.produtos = produtos;
    }

    public String getProdutos(){
        return produtos;
    }

    public void setProdutos(String produtos){
        this.produtos = produtos;
    }

    @Override
    public String toString(){
        return "Fornecedor: " + razaoSocial + "| Produtos: " + produtos;
    }
}
