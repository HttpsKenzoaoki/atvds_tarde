class Quadrado extends Figura { //Classe Quadrado pegando herança de Figura

    private float lado; //atributos privados
    private float area;

    public Quadrado(){} //Construtor padrão

    public Quadrado(float lado, float area) { //Construtor completo com lado e area
        this.lado = lado;
        this.area = area;
    }

    //Fizemos o encapsulamento de area e lado

    public void setArea(float area){
        this.area = area;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public float getArea(){
        return area;
    }

    @Override
    float calcularArea(float lado) { //Pegamos a função da herança
        return super.calcularArea(lado);
    }
    
    void exibirDetalhes(){//Função de exibir os detalhes do quadrado
        System.out.println("Area do quadrado: \n" + calcularArea(lado));
        System.out.println("Lado do quadrado: \n" + getLado());
    }
}

 //FEITO POR WILIAM KENZO, GIOVANA GOMES E JULIA DA SILVA