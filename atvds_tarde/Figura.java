public class Figura{ //fizemos a classe figura

    private float lado; //Atributos da figura, todos privados
    private float base; //Atributos da figura, todos privados
    private float altura; //Atributos da figura, todos privados
    private float area; //Atributos da figura, todos privados
    private float areat; //Atributos da figura, todos privados

//! CONSTRUTORES
    public Figura(){}//Construtor padrão

    public Figura(float lado, float base, float altura) { //Construtor completo com lado, base e altura
        this.altura = altura; //Construtor completo com lado, base e altura
        this.base = base; //Construtor completo com lado, base e altura
        this.lado = lado; //Construtor completo com lado, base e altura
    }
//! METODOS GET
    public float getLado() { //Metodo get do lado
        return lado; //Metodo get do lado
    }

    public float getBase() { //Metodo get da base
        return base; //Metodo get da base
    }

    public float getAltura() { //Metodo get da altura
        return altura; //Metodo get da altura
    }

    public float getArea(){ //Metodo get da area
        return area; //Metodo get da area
    }

//! METODOS SET
    public void setLado(float lado) { //Metodo set do lado
        this.lado = lado; //Metodo set do lado
    }

    public void setAltura(float altura) { //Metodo set da altura
        this.altura = altura; //Metodo set da altura
    }
    
    public void setBase(float base) { //Metodo set da base
        this.base = base; //Metodo set da base
    }

    public void setArea(float area){ //Metodo set da area
        this.area = area; //Metodo set da area
    }


   
    float calcularArea(float lado){ //Fizemos uma funçao pra calcular a area do quadrado
        area = lado*lado;
        return area;
    }

    float calcularAreaTriangulo(float base, float altura){ //Fizemos uma funçao pra calcular a area do triangulo
        areat = (base*altura)/2;
        return areat;
    }

}   //FEITO POR WILIAM KENZO, GIOVANA GOMES E JULIA DA SILVA