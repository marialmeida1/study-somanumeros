# SomaNumeros

Este repositório contém um projeto Java simples que calcula a soma de dois números inteiros fornecidos pelo usuário. O projeto é estruturado para ser compatível com o Eclipse IDE e segue uma organização de pastas padrão.

## Estrutura de Pastas

- .settings: Contém configurações específicas do Eclipse para o projeto. Este diretório é utilizado pelo Eclipse para armazenar as configurações do workspace, como preferências de compilação e configurações de projeto.

- bin: Contém os arquivos .class gerados pelo compilador Java. Esses arquivos são o resultado da compilação do código-fonte presente na pasta src e são necessários para executar o programa.

- src: Contém o código-fonte Java do projeto. Todos os arquivos .java são armazenados nesta pasta e são compilados para gerar os arquivos .class na pasta bin.

- classpath: Este arquivo é utilizado para definir o classpath do projeto, especificando onde o Java deve procurar classes e bibliotecas durante a compilação e execução. Normalmente, você não precisa modificar este arquivo manualmente.

- .project: Contém metadados do projeto, como o nome do projeto e a configuração do build. Este arquivo é utilizado pelo Eclipse para identificar e gerenciar o projeto.

## Código

### ``Soma.java``

```java
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Segundo numero: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;

        System.out.println("Soma: " + soma);
    }
}
```

O código Java fornecido é um exemplo básico de um programa que lê dois números inteiros fornecidos pelo usuário e calcula a **soma** desses números. 

O programa utiliza a classe ``Scanner`` para capturar a entrada do usuário a partir do console. Primeiro, ele solicita ao usuário que insira **dois** números inteiros. Após a leitura dos números, o programa calcula a soma desses valores e exibe o **resultado** no console. 

Este exemplo é uma boa introdução ao uso de entrada e saída em Java, bem como à operação básica de adição. O código demonstra conceitos fundamentais como a criação de **objetos**, a leitura de **dados** e a exibição de **resultados**.


## Contribuição

Se você deseja contribuir para este projeto, sinta-se à vontade para enviar pull requests ou abrir issues para sugestões e correções. Toda contribuição é bem-vinda!

## Contato

Se você tiver dúvidas ou precisar de assistência, você pode me encontrar nos seguintes canais:

- **E-mail**: marianaalmeidafga@gmail.com
- **GitHub**: [marialmeida1](https://github.com/marialmeida1)
- **LinkedIn**: [Mariana Almeida](https://www.linkedin.com/in/marialmeidam)

Obrigado por visitar este repositório!



