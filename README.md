# Documento Anexo: questões 1 até 6

<br />01. O For é utilizado para executar um conjunto de comandos executado por um número X de vezes;
* É passada uma situação inicial, uma condição e uma ação a ser executada a cada repetição;
* Uma variável é inicializada com uma valor inicial;
* Essa variável é utilizada para controlar a quantidade de vezes em que o conjunto de comandos será executado;
* E ao final do conjunto de comandos a variável sempre sofrerá uma alteração, aumentando ou diminuindo de acordo com a lógica utilizada.

<p> 02. <br> O uso instrução de repetição "for" é recomendado quando se sabe quantas vezes a aplicação lógica deve se repetir, diferentemente do "while", pois este ficará em execução até o momento em que a condição lógica se torne falsa. </p>

<p> 03. <br> Será mais interessante utilizar um do-while quando, não sabendo a quantidade de vezes necessária para que ocorra a repetição, se deseja realizar o teste lógico somente depois da implementação do bloco, fazendo com o a instrução possa ser executada pelo menos uma vez. </p>

<p> 04. <br> <tab> Em breves palavras, a instrução break interrompe toda a interação do bloco do comando de repetição em que este está inserido, diferentemente da instrução continue, que interrompe apenas aquela determinada interação e não todo o bloco. </p>
    
05.<br />a)***Correção:***
<br />for (int i = 100; i >= 1; i++)
<br />System.out.println(i);
<br />***Justificativa:*** Os erros são: 
* A variável (i) não estava declarada;
* O comando do for deve separado por ponto e virgula ao invés de somente uma virgula;
* Do modo como estava o programa estava em loop pois não se tinha uma condição de parada.

<br />b)***Correção:***
<br />int value=7;
<br />switch (value % 2) {
<br />  case 0: System.out.println("Inteiro par");break;
<br />  case 1: System.out.println("Inteiro ímpar");
<br />}
<br />***Justificativa:*** Os erros são: 
     <br />• A variável (value) não estava declarada;
     <br />• Em cada case do switch deve ser inserido obrigatoriamente um break no final de cada linha de código, com exceção da ultima linha de código.

<br />c)***Correção:***
<br />for(int i =19; i >=1; i -=2) System.out.println(i);
<br />***Justificativa:*** Os erros são: 
* A variável (i) não estava declarada;
* Do modo como estava o programa estava em loop pois não se tinha uma condição de parada.
* Para que o código correspondesse corretamente ao que se pede o for deveria esta decrementando para que fosse imprimido os impares de 19 a 1.
   

<br />d)***Correção:***
<br />int counter = 2;
<br />do {
<br />System.out.println(counter);
<br />counter += 2;
<br />} while (counter <= 100); 
<br />***Justificativa:*** Os erros são: 
* A variável (counter) não estava declarada;
* Para que o código correspondesse corretamente ao que se pede a condição de parada no do while deveria ser que Counter e menor igual a 100 para que possa imprimir de 2 a 100 como a questão pede.

<p> 06. 6) O programa imprimirá algo semenlhante a:
<br> @@@@
<br> @@@@
<br> @@@@
<br> @@@@
<br> @@@@
<br> @@@@
<br> @@@@   
<br> @@@@    
<br> @@@@    
<br> @@@@  
    
pois, para o "for interno" imprime os @ quatro vezes e "for externo" realiza a quebra de linhas dez vezes. </P>
