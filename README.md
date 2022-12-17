**Java** é uma linguagem de programação orientada a objetos.

Um objeto possui atributos (características) e métodos (ações); e é uma instância de uma classe.

A classe é uma especificação dos atributos e métodos que o objeto deve possuir.

Os atributos (ou variáveis) armazenam valores. As variáveis devem possuir um tipo em sua declaração que jamais pode ser mudado.
```java
// Declaração de uma variável/atributo
int age;
```
Para armazenar valores usamos o operador de atribuição ```=```, seguido de um valor compatível com o tipo declarado previamente.
```java
// Atribuindo o valor 18 (do tipo int) à variável age
age = 18;
```

Quando se atribui um valor à variável pela primeira vez chamamos de inicialização.
```java
// Inicializando uma variável em sua declaração
int age = 18;
```
```java
// Declarando e depois inicializando uma variável
int age;
age = 18;
```

> Não podemos realizar operações com as variáveis sem antes inicializá-las!

Regras ao nomear variáveis:
- Não comece com números: use uma letra, underscore (underline) ou $.
- Não use espaços em branco.
- Não use acentos gráficos (presentes na língua portuguesa).
- Prefira usar o padrão ```camelCase```.

### Tipos primitivos
|      TIPO     |             DESCRIÇÃO             | VALOR DEFAULT | TAMANHO |            LITERAIS DE EXEMPLO           |                     RANGE DE VALORES                    |
|:-------------:|:----------------------------------|:-------------:|:-------:|:----------------------------------------:|:-------------------------------------------------------:|
| ```boolean``` | Verdadeiro ou falso               | false         | 1 bit   | true, false                              | true, false                                             |
| ```byte```    | Inteiro de complemento para dois  | 0             | 8 bits  | N/A                                      | -128 a 127                                              |
| ```char```    | Caractere Unicode                 | \u0000        | 16 bits | 'a','\u0041','\101','\\\\','\\','\n','ß' | Valores de 0 a 255 da tabela ASCII                      |
| ```short```   | Inteiro de complemento para dois  | 0             | 16 bits | N/A                                      | -32.768 a 32.767                                        |
| ```int```     | Inteiro de complemento para dois  | 0             | 32 bits | -2, -1, -, 1, 2                          | -2.147.483.648 a 2.147.483.647                          |
| ```long```    | Inteiro de complemento para dois  | 0             | 64 bits | -2L, -1L, 0L, 1L, 2L                     | -9.223.372.036.854.775.808 a -9.223.372.036.854.775.807 |
| ```float```   | Ponto flutuante da norma IEEE 754 | 0.0           | 32 bits | 1.23e100f, -1.23e-100f, .3f, 3.14F       | Até 7 dígitos decimais                                  |
| ```double```  | Ponto flutuante da norma IEEE 754 | 0.0           | 64 bits | 1.23456e300d, -1.23456e-300d, 1e1d       | Até 16 dígitos decimais                                 |

### Casting e promoção

### Entrada, processamento e saída de dados
Locale.setDefault(Locale.US);
Scanner scanner = new Scanner(System.in);
System.out.print();

### Estruturas sequenciais
escopo
\+, -, \*, /, %

### Estruturas condicionais
\>, <, >=, <=, ==, !=

&&, ||, !

if else

+=, -=, *=, /=, %=

++var, --var, var++, var--

switch-case break, default

operador ternário: (condicao) ? true : false

### Estruturas repetitivas

### Métodos
Estrutura, parâmetros, invocação e argumentos
Efeito colateral: return

### Modificadores de acesso
- ```public```: Todos podem acessar o atributo, método, construtor ou classe que o sucede.
- ```protected```: Podem acessar todas as classes que se encontram no mesmo pacote e as classes que o estendam, mesmo que estejam em outro pacote. **Uma classe não pode ser protected!** (a menos que seja uma classe aninhada)
- ```private```: A única classe que pode acessar atributos, métodos ou construtores definidos como private é a própria classe que os contêm. **Uma classe não pode ser private!** (a menos que seja uma classe aninhada)
- _Sem modificador de acesso_: Todas as classes no mesmo pacote têm acesso.

> O Java só permite uma única classe pública para cada arquivo .java.

### Declarando classes

### Método construtor

### Encapsulamento
Getters e setters

### Pacotes e imports
Um pacote nada mais é do que uma pasta contendo os arquivos .java.

Ao se referir a uma classe dentro de um pacote, declaramos a localização da pasta pai do arquivo .java a partir do diretório raiz do projeto:
```java
package br.com.exemplo.main;

public class Conta {
    (...)
}
```

> Isso significa dizer que, a partir da pasta raiz do projeto, existe uma pasta chamada **br**, com uma subpasta chamada **com**, com uma subpasta chamada **exemplo**, com uma subpasta chamada **main** e dentro dessa pasta main encontra-se o arquivo Conta.java (com o código da classe Conta).

Ao acessar classes em outros pacotes, devemos apontar o pacote da classe (incluindo todo o caminho a partir da pasta raiz do projeto) para que o Java consiga identificar qual é a classe que desejamos acessar.
```java
package com.example.project.entities;

public class Account {
    public static void main(String[] args) {
        com.example.project.entities.util.Calculator myCalculator = new com.example.project.entities.util.Calculator(); 
    }
}
```

Para evitar essa escrita longa e confusa, podemos importar o caminho da classe e então chamar apenas o nome da classe quando desejada. A forma como apontamos a classe no exemplo anterior é chamada de **_Fully Qualified Name_**.
```java
package com.example.project.entities;

import com.example.project.entities.util.Calculator;

public class Account {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        (...)
    }
}
```

Também é possível importar várias classes do pacote utilizando o caractere curinga ```*```.
```java
import x.y.z.*;
```
Porém fazer isso não é considerada uma boa prática. Não porque implica em perda de performance em tempo de execução, mas sim porque pode confundir outros programadores trabalhando em seu código. O ideal é importar cada classe separadamente. Caso você esqueça de importar alguma classe, a IDE vai sugerir a correção. Caso sua IDE substitua seus imports pelo caractere curinga, é bom configurá-la para não realizar esse tipo de import.

### Ferramentas: JAR e Javadoc

### Herança

### Sobrescrita de métodos (Reescrever/Sobrescrever/_Override_)
A sobrescrita está diretamente relacionada com o princípio de herança.

Em algum momento do desenvolvimento do código, sua subclasse pode herdar um método que você deseja que apresente um comportamento diferente do definido na superclasse. Por exemplo:

```java
// Superclasse Animal
package ...

import ...

public class Animal {
    // atributos
    // demais métodos
    
    public void emitirSom() {
        System.out.println("Som");
    }
}
```

```java
// Subclasse Cachorro
package ...

import ...

public class Cachorro extends Animal {
    // atributos
    // métodos
}
```

Ao herder os atributos e métodos da superclasse Animal, um objeto do tipo Cachorro vai apresentar a mensagem "Som" ao invocar o método herdado ```emitirSom()```. Caso queira alterar a mensagem do método (seu comportamento) para algo mais coerente ao tipo Cachorro você deve sobrescrever o método em questão. Por exemplo:

```java
// Subclasse Cachorro
package ...

import ...

public class Cachorro extends Animal {
    // demais atributos e métodos...
    
    // Sobrescrita do método herdado da superclasse
    public void emitirSom() {
        System.out.println("Au, au!");
    }
}
```

Ao sobrescrever um método herdado o Java vai priorizar esse método em relação ao método declarado na superclasse.

Uma forma mais correta de sobrescrever um método é utilizando a anotação **@Override**:

```java
package ...

import ...

public class Cachorro extends Animal {
    // demais atributos e métodos...
    
    // Sobrescrita do método herdado
    @Override
    public void emitirSom() {
        System.out.println("Au, au!");
    }
}
```

Utilizando a anotação o Java entende que há uma sobrescrita a seguir e caso haja alguma inconsistência não compilará o código. Ou seja, utilizar a anotação **@Override** é uma boa prática pois você estará facilitando a visualização de uma sobrescrita caso outro programador veja seu código e garantindo que a mesma é intencional.
