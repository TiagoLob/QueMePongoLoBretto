package domain;

public enum TipoDePrenda {
    REMERA(Categoria.PARTE_SUPERIOR),
    PANTALON(Categoria.PARTE_INFERIOR),
    ZAPATO(Categoria.CALZADO),
    GORRO(Categoria.ACCESORIO),
    BUFANDA(Categoria.ACCESORIO),

    ;

    private Categoria categoria;

    TipoDePrenda(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}



