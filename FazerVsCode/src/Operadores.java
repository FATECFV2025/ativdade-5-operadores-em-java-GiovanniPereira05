public class Operadores {
    // Operadores Aritméticos
    public float adicao (float v1, float v2){
        return v1+v2;
    }

    public float subtracao (float v1, float v2){
        return v1-v2;
    }

    public float multiplicacao (float v1 , float v2){
        return v1*v2;
    }

    public float divisao (float v1, float v2){
        return v1/v2;
    }

    // Operadores de Atribuiçao
    public float atribuicaoSoma (float v1, float v2){
        return v1+=v2;
    }

    public float atribuicaoSubtracao (float v1, float v2){
        return v1-=v2;
    }

    public float atribuicaoMultiplicacao (float v1, float v2){
        return v1*=v2;
    }

    public float atribuicaoDividao (float v1, float v2){
        return v1/=v2;
    }

    public float atribuicaoSimples (float v1, float v2){
        return v1 = v2;
    }

    //Operadores de Comparação
    public boolean comparacaoIgual (float v1, float v2){
        return v1 == v2;
    }

    public boolean comparacaoDiferente (float v1, float v2){
        return v1 != v2;
    }

    public boolean comparacaoMenorQue (float v1, float v2){
        return v1 < v2;
    }

    public boolean comparacaoMaiorQue (float v1, float v2){
        return v1 > v2;
    }

    public boolean comparacaoMenorOuIgual (float v1, float v2){
        return v1 <= v2;
    }

    public boolean comparacaoMaiorOuIgual (float v1, float v2){
        return v1 >= v2;
    }

    //Operadores Lógicos
    public boolean logicoE (boolean v1, boolean v2){
        return v1 && v2;
    }

    public boolean logicoOu (boolean v1, boolean v2){
        return v1 || v2;
    }

    public boolean logicoOuExclusivo (boolean v1, boolean v2){
        return v1 ^ v2;
    }

    public boolean logicoNao (boolean v1){
        return !v1;
    }
}



