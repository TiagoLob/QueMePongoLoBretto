package domain;

import java.util.Objects;

public class Prenda {

    private TipoDePrenda tipoDePrenda;
    private Categoria categoria;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrimario, Color colorSecundario){
        this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda,"La prenda debe tener un tipo");
        this.categoria = Objects.requireNonNull(tipoDePrenda.getCategoria(),"La prenda debe tener una categoria");
        this.material = Objects.requireNonNull(material,"La prenda debe tener un material");
        this.colorPrimario = Objects.requireNonNull(colorPrimario,"La prenda debe tener un tipo");
        this.colorSecundario=colorSecundario;
    }

    public Categoria categoria(){
        return tipoDePrenda.getCategoria();
    }
}
