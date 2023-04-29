package domain;

import java.util.Objects;

public class Prenda {

    private TipoDePrenda tipoDePrenda;
    private Categoria categoria;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
    private Trama trama;

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama){
        this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda,"La prenda debe tener un tipo");
        this.categoria = Objects.requireNonNull(tipoDePrenda.getCategoria(),"La prenda debe tener una categoria");
        this.material = Objects.requireNonNull(material,"La prenda debe tener un material");
        this.colorPrimario = Objects.requireNonNull(colorPrimario,"La prenda debe tener un tipo");
        this.colorSecundario= colorSecundario;
        this.trama = trama;
    }

    public Categoria categoria(){
        return tipoDePrenda.getCategoria();
    }
}
