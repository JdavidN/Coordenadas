package modelo;

public class Coordenada
{
    //-----------
    //Atributos
    //-----------

    private double x;
    private double y;
    private double distancia;


    //metodos set

    public void Distancia(double pDistancia)
    {
        this.distancia = pDistancia;
    }
    public Coordenada(double pX, double pY)
    {
        this.x = pX;
        this.y = pY;
    }

    public Coordenada()
    {
        this.x = 0;
        this.y = 0;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setDistancia(double distancia) 
    {
        this.distancia = distancia;
    }

    //metodos get

    public double getX() 
    {
        return x;
    }

    public double getY() 
    {
        return y;
    }

    public double getDistancia() 
    {
        return distancia;
    }

    //ToString

    public String toString()
    {
        return "Coordenada = (" + x + ", " + y + ")";
    }

    public boolean equals(Object obj)
    {
        Coordenada otra = (Coordenada)obj;
        return (x==otra.x) && (y==otra.y);
    }


}