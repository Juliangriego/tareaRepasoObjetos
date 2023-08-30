package Clases;

public class Alumnos extends Persona{
    private int[] nota = new int[3];

    public Alumnos(){}
    public Alumnos(String apyn,int n1,int n2,int n3){super(apyn);this.nota[1]=n1;this.nota[2]=n2;this.nota[3]=n3;}

    //setters
    public void setNota1(int n1){this.nota[1]=n1;}
    public void setNota2(int n2){this.nota[2]=n2;}
    public void setNota3(int n3){this.nota[3]=n3;}
    //getter
    public int getNota1(int n1){return this.nota[1]=n1;}
    public int getNota2(int n2){return this.nota[2]=n2;}
    public int getNota3(int n3){return this.nota[3]=n3;} 
}
