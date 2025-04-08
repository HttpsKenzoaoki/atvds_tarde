class Triangulo  extends Figura{ //Classe Triangulo pegando herança da Figura
    private float altura;//Atributos privados
    private float base;
    private float areat;//Escrevemos areat para se diferenciar da area do quadrado

    public Triangulo(){}//Construtor padrão

    public Triangulo(float base, float areat, float altura) { //Construtor completo com base, altura e area
        this.base = base;
        this.altura = altura;
        this.areat = areat;
    }
    //Fizemos o encapsulamento

    public void setAreat(float areat){
        this.areat = areat;
    }

    public void setLado(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAreat(){
        return areat;
    }

    public float getAltura(){
        return altura;
    }

        @Override
        float calcularAreaTriangulo(float base, float altura) { //Pegamos a função da herança
            return super.calcularAreaTriangulo(base, altura);
        }
    
    void exibirDetalhes(){//Função de exibir os detalhes do triangulo
        System.out.println("Area do triangulo: \n" + calcularAreaTriangulo(base, altura));
        System.out.println("Altura do triangulo: \n" + getAltura());
        System.out.println("Base do triangulo: \n" + getBase());
    }
    }
 //FEITO POR WILIAM KENZO, GIOVANA GOMES E JULIA DA SILVA
