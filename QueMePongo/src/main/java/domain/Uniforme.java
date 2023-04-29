package domain;

public class Uniforme {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;
}

interface Sastre {
    Prenda fabricarParteSuperior();

    Prenda fabricarParteInferior();

    Prenda fabricarCalzado();
}

class SastreSanJuan implements Sastre{
    public Prenda fabricarParteSuperior(){
       BorradorPrenda sanJuanSuperior = new BorradorPrenda(TipoDePrenda.CHOMBA);
       sanJuanSuperior.especificarColorPrimario(Color.VERDE_OSCURO);
       sanJuanSuperior.especificarMaterial(Material.PIQUE);
       return sanJuanSuperior.crearPrenda();
    }

    public Prenda fabricarParteInferior(){
        BorradorPrenda sanJuanInferior = new BorradorPrenda(TipoDePrenda.PANTALON);
        sanJuanInferior.especificarColorPrimario(Color.GRIS_OSCURO);
        sanJuanInferior.especificarMaterial(Material.ACETATO);
        return sanJuanInferior.crearPrenda();
    }

    public Prenda fabricarCalzado() {
        BorradorPrenda sanJuanCalzado = new BorradorPrenda(TipoDePrenda.ZAPATILLAS);
        sanJuanCalzado.especificarColorPrimario(Color.BLANCO);
        sanJuanCalzado.especificarMaterial(Material.CUERO);
        return sanJuanCalzado.crearPrenda();
    }
}
