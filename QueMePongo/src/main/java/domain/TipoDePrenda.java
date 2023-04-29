package domain;

public class TipoDePrenda {

    public static final TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    public static final TipoDePrenda CAMISA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    public static final TipoDePrenda CHOMBA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    public static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
    public static final TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
    public static final TipoDePrenda ZAPATILLAS = new TipoDePrenda(Categoria.CALZADO);
    public static final TipoDePrenda GORRO = new TipoDePrenda(Categoria.ACCESORIO);
    public static final TipoDePrenda BUFANDA = new TipoDePrenda(Categoria.ACCESORIO);

    private Categoria categoria;

    private TipoDePrenda(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}



