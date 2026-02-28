package controller;

public class metodos {
  public metodos () {
	  super();
  }
  
  public int contarOcorrencia(int numero, int digito)
  {
   // Condição de parada:
   // Quando o número chegar a 0, não há mais dígitos para verificar
   if(numero == 0)
   {
    return 0;
   }

   // Pega o último dígito
   int resto = numero % 10;

   // Relação de chamada:
   // Se o último dígito for igual ao digitado,
   // soma 1 e continua verificando o restante do número
   if(resto == digito)
   {
    return 1 + contarOcorrencia(numero / 10, digito);
   }
   else
   {
    return contarOcorrencia(numero / 10, digito);
    
    }
   }
  }
