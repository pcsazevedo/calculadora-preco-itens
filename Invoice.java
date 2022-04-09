package digitalone.aula3;

public class Invoice {
     String numero;
     String descricao;
     int quantidade;
     double preco;

    public Invoice()
    {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;

        if(quantidade > 0)
            this.quantidade = quantidade;
        else {
            quantidade = 0;
        }

        if (preco > 0)
            this.preco = preco;
        else {
            preco = 0.0;
        }

    }

    public void setNumero(String numero) {

        this.numero = numero;
    }
    
    

    public String getNumero(){
        return numero;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public  void setPreco(double preco)
    {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    public double getInvoiceAmount()
    {
        double valortotal = quantidade * preco;
        return valortotal;

    }



}
