package Clases;

public class Alumnos extends Persona{
    private final int[] nota = new int[3];

    public Alumnos(){}
    public Alumnos(String apyn,int n1,int n2,int n3) {
        super(apyn);
        this.nota[0]=n1;
        this.nota[1]=n2;
        this.nota[2]=n3;}

    //setters
    public void setNota1(int n1){this.nota[0]=n1;}
    public void setNota2(int n2){this.nota[1]=n2;}
    public void setNota3(int n3){this.nota[2]=n3;}
    //getter
    public int getNota1(){return this.nota[0];}
    public int getNota2(){return this.nota[1];}
    public int getNota3(){return this.nota[2];}
}
