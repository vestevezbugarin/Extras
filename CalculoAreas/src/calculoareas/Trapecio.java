package calculoareas;

public class Trapecio {

    private float baseMayor;
    private float baseMenor;
    private float altura;

    public Trapecio() {
    }

    public Trapecio(float baseMayor, float baseMenor, float altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    

    //Getters & Setters
    public float getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculo() {
        float area = ((baseMayor + baseMenor) / 2) * altura;
        return area;
    }
}
