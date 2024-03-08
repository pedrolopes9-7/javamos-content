package catalog;

import product.Produto;
import user.System;

import java.util.List;

public class Catalogo {

    protected List<Produto> productsSale;

    public boolean addProductSale(Produto produto){
        System.out.println("product add in sale");
        return this.productsSale.add(produto);
    }
}
