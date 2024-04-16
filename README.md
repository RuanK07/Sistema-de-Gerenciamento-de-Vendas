## Índice
* [Introdução](https://github.com/RuanK07/Sistema-de-Gerenciamento-de-Vendas#Sistema-de-Gerenciamento-de-Vendas)
* [1. Diagrama de Classe](https://github.com/RuanK07/Sistema-de-Gerenciamento-de-Vendas#1-Diagrama-de-Classe)
* [2. Diagrama de Instancias](https://github.com/RuanK07/Sistema-de-Gerenciamento-de-Vendas#2-Diagrama-de-Instancias)
* [3. Requisicoes GET](https://github.com/RuanK07/Sistema-de-Gerenciamento-de-Vendas#3-Requisicoes-GET)
* [4. Tecnologias Utilizadas](https://github.com/RuanK07/Sistema-de-Gerenciamento-de-Vendas#4-Tecnologias-Utilizadas)

-------------------------------

# Sistema-de-Gerenciamento-de-Vendas

&nbsp;&nbsp;&nbsp;&nbsp;Este estudo de caso tem como objetivo mostrar na prática como um modelo conceitual pode ser implementado sobre o paradigma orientado a objetos, usando padrões de mercado e boas práticas. Vamos tomar como caso um modelo conceitual abrangente, com o qual possamos mostrar a implementação prática em linguagem orientada a objetos.

### 1. Diagrama de Classe

&nbsp;&nbsp;&nbsp;&nbsp;A **figura 1** descreve a estrutura do sistema, modelando suas classes descrevendo seus atributos e as relações entre objetos.

<img>
  <p align="center"> 
    <b>Figura 1 - Diagrama do modelo conceitual</b> 
  </p>
</img>

![image](https://user-images.githubusercontent.com/92696779/236543684-f83060b6-0a33-48a7-ba83-a70dd2e38f8d.png)

-------------------------------


### 2. Diagrama de Instancias

&nbsp;&nbsp;&nbsp;&nbsp;A **figura 2** representa graficamente os dados a serem instanciados

<img>
  <p align="center"> 
    <b>Figura 2 - Diagrama de instancia do modelo conceitual</b> 
  </p> 
</img>

![image](https://user-images.githubusercontent.com/92696779/236544465-2673b55f-5e5d-49fc-a53c-278fc91a793e.png)

-------------------------------
<br></br>


### 3. Requisicoes GET

<table>
  <tr><th> Requisicoes </th></tr>
  <tr><td>

  |End point | Dados|
  |--|--|
  | /categorias/{id} | Categoria e seus produtos |
  | /clientes/{id} | Cliente, seus telefones e seus endereços |
  | /pedidos/{id}  | Pedido, seu cliente, seu pagamento, seus itens de pedido, seu endereço de entrega |

</td></tr> </table>

<br></br>

### 4. Tecnologias Utilizadas
&nbsp;&nbsp;&nbsp;&nbsp;A seguir serão listadas todas as tecnologias utilizadas no desenvolvimento do sistema

 - **Java** - Linguagem de programação utilizada para o desenvolvimento do sistema.
 
 - **Spring Framework** - Frameworks responsável pela arquitetura MVC e seguranças com **BCrypt** no projeto. 
 
 - **JPA/Hibernate** - Utilizada a especificação do **JPA**  para persistência dos dados utilizando a implementação do **Hibernate**.

 - **Maven** - Para arquitetura inicial de projeto e controle de dependências.

# Autor

Ruan Kennedy Freire Mendes

www.linkedin.com/in/ruan-kennedy-b1b084242
