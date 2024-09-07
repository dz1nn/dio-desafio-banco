public class CartaoCredito {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private double limite;
    private double saldoDevedor;
    
    


    
    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, double limite, double saldoDevedor) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.limite = limite;
        this.saldoDevedor = saldoDevedor;
    }

    public void realizarCompra(double valor){
        if (valor <= limite - saldoDevedor){
            saldoDevedor += valor;
        }else {
            System.out.println("Limite insuficiente");
        }
    }

    public void pagarConta (double valor){
        saldoDevedor -= valor;
    }


   
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getSaldoDevedor() {
        return saldoDevedor;
    }
    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }
}
