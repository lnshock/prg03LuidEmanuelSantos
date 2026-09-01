# Documento de Especificação de Requisitos

**Projeto:** Sistema de Gerenciamento de Livraria  
**Data de Criação:** 24/08/2026  
**Autor:** Luid Emanuel Santos dos Anjos  
**Cargo:** Desenvolvedor / Analista de Sistemas  
**Revisão:** 01  

---

## Conteúdo

1. [Introdução](#1-introdução)
   1. [Objetivo](#11-objetivo)
   2. [Escopo do produto](#12-escopo-do-produto)
   3. [Definições, Acrônimos e Abreviações](#13-definições-acrônimos-e-abreviações)
2. [Descrição geral](#2-descrição-geral)
   1. [Modo de Operação](#21-modo-de-operação)
   2. [Funções do produto](#22-funções-do-produto)
   3. [Usuários e sistemas externos](#23-usuários-e-sistemas-externos)
   4. [Restrições](#24-restrições)
   5. [Requisitos Adiados](#25-requisitos-adiados)
3. [Requisitos específicos](#3-requisitos-específicos)
   1. [Requisitos Funcionais](#31-requisitos-funcionais)
   2. [Requisitos Não-Funcionais](#32-requisitos-não-funcionais)
      1. [Desempenho](#321-desempenho)
      2. [Usabilidade](#322-usabilidade)
      3. [Segurança](#323-segurança)
      4. [Expansibilidade](#324-expansibilidade)
   3. [Requisitos de Interface](#33-requisitos-de-interface)
      1. [Interfaces de Usuário](#331-interfaces-de-usuário)
      2. [Interfaces de Hardware](#332-interfaces-de-hardware)
      3. [Interfaces de Software](#333-interfaces-de-software)
      4. [Interfaces de Comunicação](#334-interfaces-de-comunicação)
4. [Restrições e Limitações](#4-restrições-e-limitações)
5. [Glossário](#5-glossário)
6. [Referências](#6-referências)
7. [Aprovação](#7-aprovação)

---

## 1 Introdução

O sistema de gerenciamento para livraria tem como finalidade organizar o processo de venda e aluguel de livros.

**Público-alvo:** Leitores que desejam alugar e comprar livros.

### 1.1 Objetivo
Este documento tem como objetivo apresentar de forma detalhada os requisitos funcionais e não funcionais do sistema de gerenciamento para livrarias. Ele servirá como guia para o desenvolvimento do software, descrevendo as funcionalidades, características e necessidades que serão abordadas na implementação.

### 1.2 Escopo do produto
O escopo deste documento abrange as funcionalidades e características do sistema de gerenciamento para livrarias.

### 1.3 Definições, Acrônimos e Abreviações

| № | Sigla | Definição |
| :--- | :--- | :--- |
| 01 | RF | Requisito Funcional |
| 02 | RNF | Requisito Não-Funcional |
| 03 | ISBN | Identificador padrão para livros físicos |

---

## 2 Descrição geral

### 2.1 Modo de Operação
O atendente usa o programa para consultar se um livro está no estoque pelo ISBN e registrar as vendas.

### 2.2 Funções do produto

| № | Função | Descrição |
| :--- | :--- | :--- |
| 01 | Cadastrar Livros | Cadastrar, editar e remover livros no acervo utilizando o código ISBN como identificador. |
| 02 | Consultar Acervo | Pesquisar livros por ISBN e título. |
| 03 | Registrar Venda Balcão | Registra as vendas e suas formas de pagamento. |
| 04 | Atualizar Estoque | Permite modificar a quantidade de livros no estoque. |
| 05 | Cadastrar Cliente | Registrar informações básicas sobre os clientes. |
| 06 | Visualizar Vendas | Exibir a lista de vendas. |

### 2.3 Usuários e sistemas externos

| № | Usuário | Descrição |
| :--- | :--- | :--- |
| 01 | Administrador | Acesso total ao sistema. |
| 02 | Atendente / Vendedor | Responsável por pesquisar livros e realizar o registro de vendas. |
| 03 | Estoquista | Responsável por gerenciar as informações do estoque. |

### 2.4 Restrições

| № | Tipo | Descrição |
| :--- | :--- | :--- |
| 01 | Escopo | O sistema é focado exclusivamente no comércio de livros físicos. |
| 02 | Identificação | Todo livro cadastrado deve possuir um código ISBN para identificação no sistema. |
| 03 | Segurança | Cada usuário acessará o sistema com seu login e senha única. |
| 04 | Usabilidade | As telas devem priorizar a facilidade e rapidez. |

### 2.5 Requisitos Adiados

| № | Referência | Detalhes |
| :--- | :--- | :--- |
| 01 | Reserva Online de Livros | Possibilidade de clientes realizarem a reserva de livros online. |

---

## 3 Requisitos específicos

### 3.1 Requisitos Funcionais

| Código | Nome | Descrição |
| :--- | :--- | :--- |
| **RF01** | Cadastro de Livros por ISBN | O sistema deve permitir cadastrar, editar e excluir livros, solicitando obrigatoriamente: Código ISBN. |
| **RF02** | Busca de Livros | O sistema deve permitir pesquisar livros no catálogo informando o código ISBN, o título ou o nome do autor. |
| **RF03** | Registro de Venda | O sistema deve permitir registrar vendas informando o livro (via busca por ISBN/título), a quantidade vendida e a forma de pagamento (Dinheiro, Cartão ou Pix). |
| **RF04** | Baixa Automática de Estoque | O sistema deve descontar automaticamente a quantidade de exemplares do estoque no momento em que uma venda for concluída. |
| **RF05** | Controle de Entradas de Estoque | O sistema deve permitir somar novos exemplares ao estoque existente de um livro já cadastrado. |
| **RF06** | Cadastro de Clientes | O sistema deve permitir cadastrar opcionalmente nome, telefone e CPF do cliente no momento do aluguel. |
| **RF07** | Histórico e Resumo de Vendas | O sistema deve disponibilizar ao administrador uma tela para visualizar as vendas do dia e o total arrecadado. |

### 3.2 Requisitos Não-Funcionais

#### 3.2.1 Desempenho

| Código | Requisito / Aplicação | Descrição |
| :--- | :--- | :--- |
| **RNF01** | Agilidade na Venda | A busca do livro pelo ISBN e a confirmação de venda devem responder de forma imediata. |

#### 3.2.2 Usabilidade

| Código | Requisito / Aplicação | Descrição |
| :--- | :--- | :--- |
| **RNF02** | Interface Simples | O sistema deve apresentar um layout limpo e direto, exigindo poucos cliques para registrar uma venda. |

#### 3.2.3 Segurança

| Código | Requisito / Aplicação | Descrição |
| :--- | :--- | :--- |
| **RNF03** | Controle de Acesso | Apenas o perfil Administrador pode alterar preços de livros e visualizar o total financeiro acumulado. |

#### 3.2.4 Expansibilidade

| Código | Requisito / Aplicação | Descrição |
| :--- | :--- | :--- |
| **RNF04** | Estrutura Leve | O código deve ser organizado de forma limpa para facilitar manutenções no futuro. |

### 3.3 Requisitos de Interface

#### 3.3.1 Interfaces de Usuário

| № | Nome | Descrição |
| :--- | :--- | :--- |
| 01 | Tela de Cadastro do Acervo | Formulário direto para digitação do ISBN e demais dados bibliográficos do livro. |
| 02 | Tela de Venda | Tela intuitiva para seleção do livro via ISBN/título, quantidade e finalização da venda. |
| 03 | Tela de Consulta de Estoque | Tabela de fácil navegação com a listagem de livros e suas respectivas quantidades disponíveis. |
| 04 | Tela de Relatório | Visualização resumida do histórico de vendas realizadas. |

#### 3.3.2 Interfaces de Hardware
Compatível com leitores manuais de código de barras USB para leitura rápida do código ISBN impresso nas capas dos livros.

#### 3.3.3 Interfaces de Software
*(Não aplicável)*

#### 3.3.4 Interfaces de Comunicação
*(Não aplicável)*

---

## 4 Restrições e Limitações

* O sistema é direcionado estritamente ao controle de livros físicos em loja presencial.
* Caso o código ISBN não seja informado ou cadastrado incorretamente, o produto não poderá ser localizado com o leitor de código de barras.

---

## 5 Glossário

| Termo | Definição |
| :--- | :--- |
| **ISBN** | Código que identifica cada livro publicado. |
| **Acervo** | Conjunto de livros. |

---

## 6 Referências

*(Nenhuma referência citada)*

---

## 7 Aprovação

Este documento foi revisado e aprovado por:

**Nome:** Luid Emanuel Santos dos Anjos  
**Cargo:** Desenvolvedor  
