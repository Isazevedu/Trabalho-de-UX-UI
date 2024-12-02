
# Trabalho-de-UX-UI
# Projeto de Verificação de Login em Java

## Erros Identificados no Código**
1. **Importação do Driver JDBC:**
   - O driver "com.mysql.Driver.Manager" está incorreto. Deve ser "com.mysql.cj.jdbc.Driver".

2. **Exposição de Credenciais**
   - Credenciais do banco de dados estão diretamente no código, o que compromete a segurança.

3. **Vulnerabilidade a SQL Injection:**:
   - O método verificarUsuario utiliza concatenação de strings para consultas SQL, expondo o sistema a ataques.

4. **Conexão com Banco Não Fechada:**

    -O código não garante o fechamento da conexão com o banco, podendo causar vazamento de recursos.
   
4. **Tratamento Inadequado de Exceções:**

    -Exceções são tratadas apenas com printStackTrace, o que não é apropriado para produção.


## Grafo de Fluxo
![_Fluxograma](https://github.com/user-attachments/assets/564ef568-c114-4bf6-a3c2-0cc7cf70a68e)

1. **Cálculo da Complexidade Ciclomática e Possíveis Caminhos**

\[
M = E - N + 2P
\]

Onde:  
- **E** = Número de arestas no grafo (19)  
- **N** = Número de nós no grafo (17)  
- **P** = Número de componentes conectados (1)  

Substituindo os valores na fórmula:


M = 19 - 17 + 2(1)  
M = 19 - 17 + 2  
M = 4


Portanto, a **complexidade ciclomática é 4**, indicando que são necessários, no mínimo, 4 casos de teste para cobrir todos os caminhos possíveis.

## Possíveis Caminhos Identificados no Grafo

Os trajetos possíveis no grafo são descritos abaixo:

Caminho 1: **1 → 2 → 3 → 4 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 13 → 14 → 11 → 15 → 16 → 17**  
Caminho 2: **1 → 2 → 3 → 4 → 3 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 13 → 11 → 15 → 16 → 17**  
Caminho 3: **1 → 2 → 3 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 13 → 14 → 11 → 15 → 16 → 17**  
Caminho 4: **1 → 2 → 3 → 4 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 15 → 16 → 17**

## TESTE ESTÁTICO
[PLANO DE TESTE B.I.xlsx](https://github.com/user-attachments/files/17967617/PLANO.DE.TESTE.B.I.xlsx)
