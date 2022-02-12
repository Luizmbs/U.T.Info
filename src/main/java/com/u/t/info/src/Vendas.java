package com.u.t.info.src;

import java.util.List;

public interface Vendas {

    public Vendedor getVendedor();

    public void setVendedor(Vendedor vendedor);

    public Produto getProduto();

    public void setProdutos(Produto produto);

    public double getValor();

    public void setValor(double valor);
    
    public void setCliente(Cliente cliente);
    
    public Cliente getCliente();

}
