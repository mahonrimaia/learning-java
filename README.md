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
