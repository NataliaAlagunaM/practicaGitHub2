public class Pato {
    private int patas;
    private int alas;
    private int sexo;
    private int color;
    private boolean vuela;
    public Pato() {
    }
    public Pato(int patas, int alas, int sexo, int color, boolean vuela) {
        this.patas = patas;
        this.alas = alas;
        this.sexo = sexo;
        this.color = color;
        this.vuela = vuela;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public boolean isVuela() {
        return vuela;
    }
    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    
}
