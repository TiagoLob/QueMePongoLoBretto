package domain;

public class BorradorPrenda {
    private final TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
    private Trama trama;

    BorradorPrenda(TipoDePrenda tipoDePrenda){
        chequearNoNulo(tipoDePrenda, "tipo de prenda");
        this.tipoDePrenda = tipoDePrenda;
    }

    void especificarMaterial (Material material){
        chequearNoNulo(material, "material");
        this.material = material;
    }

    void especificarColorPrimario (Color colorPrimario){
        chequearNoNulo(colorPrimario, "color primario");
        this.colorPrimario = colorPrimario;
    }

    void especificarColorSecundario(Color colorSecundario){
        this.colorSecundario = colorSecundario;
    }

    void especificarTrama(Trama trama){
        if (trama == null){
            this.trama = Trama.LISA;
        } else {
            this.trama= trama;
        }
    }

    Prenda crearPrenda(){
        this.chequearParametrosNoNulos();
        this.especificarTrama(trama);
        return new Prenda(tipoDePrenda, material, colorPrimario, colorSecundario, trama);
    }

    void chequearParametrosNoNulos(){
        chequearNoNulo(tipoDePrenda, "tipo de prenda");
        chequearNoNulo(material, "material");
        chequearNoNulo(colorPrimario, "color primario");
    }

    void chequearNoNulo(Object parametro, String nombreParametro){
        if(parametro == null){
            throw new IllegalArgumentException("El parametro "+ nombreParametro +" no puede ser nulo");
        }
    }
}
