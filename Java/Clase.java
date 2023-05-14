package Java;

public class Clase {
    
    public int num;

    public Clase(int valor){
        this.num = valor;
    }

    // Gets and setters
    public int getNum(){
        return this.num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void mostrarDatos(){
        System.out.println("valor a mostrar es: " + this.num);
    }
}
