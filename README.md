



# Newton-Raphson Raiz Quadrada
Este projeto implementa o método de Newton-Raphson em Java para calcular a raiz quadrada de um número com um nível de precisão definido pelo usuário. O método de Newton-Raphson é um algoritmo numérico que encontra aproximações sucessivas da raiz quadrada até atingir o nível de precisão desejado.

## Descrição
O programa permite ao usuário um número e uma precisão, e em seguida calcula a raiz quadrada desse número usando o método de Newton-Raphson. Este método é particularmente útil para encontrar raízes de forma iterativa, aproximmando o valor exato a cada iteração.

## Como Funciona
1. O usuário insere o número para o qual deseja calcular a raiz quadrada.
2. O usuário define o valor da precisão para a aproximação.
3. O programa utiliza o método de Newton-Raphson para calcular a raiz quadrada, repetindo o processo até que a diferença entre a aproximação atual e o valor exato seja menor que a precisão informada.

### Fórmula Utilizada
A fórmula iterativa para calcular a raiz quadrada é:

![raiz](https://github.com/user-attachments/assets/cfcbd5a6-84fd-499f-8121-82c8fa27b836)


Onde: 

​![Captura de tela de 2024-10-04 11-19-23](https://github.com/user-attachments/assets/3764a5c8-c302-4c33-8147-d6ac64ea07df)


![Captura de tela de 2024-10-04 11-20-32](https://github.com/user-attachments/assets/2a13a0c2-4c8f-410a-b1be-5f09f3f2893e)

A fórmula continua iterando até que diferença entre ![Captura de tela de 2024-10-04 11-21-35](https://github.com/user-attachments/assets/f5f3e42f-dd99-4106-8f73-272f29e5d1f2) e N seja menor que o valor da precisão fornecida.


### Exemplo de Uso
### Entrada:
- Número: 25
- Precisão: 0.0001

### Saída:
A raiz quadrada de 25 é aproximadamente: 5.000000000000001


### Requisitos
- Java Development Kit (JDK) 8 ou superior.

### Como Executar
1. Clone este repositório:

git clone https://github.com/seu-usuario/nome-do-repositorio.git

2. Compile e execute o programa:

javac NewtonRaphsonRaizQuadrada.java
java NewtonRaphsonRaizQuadrada

3. Siga as intruções para inserir o número e a precisão.

### Código

O código principal para o cálculo da raiz quadrada está na classe NewtonRaphsonRaizQuadrada.java:

![raiz](https://github.com/user-attachments/assets/df0d0361-aacc-44cf-94a4-5fd9a30c2e19)

### Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir um issue ou enviar um pull request com melhorias ou correções.

### Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para obter mais detalhes.


