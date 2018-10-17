package calculoareas;

public class Circulo {

    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    

    //Getters & Setters
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calculo() {
        float area = (float) (Math.PI * (Math.pow(radio, 2)));
        return area;
    }
}
