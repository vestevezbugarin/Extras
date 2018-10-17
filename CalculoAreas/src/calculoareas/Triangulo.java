package calculoareas;

public class Triangulo {

    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
    }

    //Getters & Setters
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculo(float base, float altura) {
        float area = base * altura / 2;
        return area;
    }
}
