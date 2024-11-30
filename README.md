# Trabalho-de-UX-UI
# Projeto de Verificação de Login em Java

## Melhorias Sugeridas
1. **Gerenciamento de Credenciais**:
   - Usar um arquivo de configuração para armazenar a URL, o nome de usuário e a senha do banco de dados.

2. **Evitar SQL Injection**:
   - Substituir a construção manual da query por `PreparedStatement` para evitar vulnerabilidades.

3. **Melhorias na Conexão**:
   - Garantir o fechamento da conexão com o banco, mesmo em caso de erros.
   - Utilizar um pool de conexões para melhorar a performance em sistemas maiores.

4. **Substituir `printStackTrace` por Logger**:
   - Poderia usar um logger ao invés de `printStackTrace` para melhor controle dos logs.

## Grafo de Fluxo
![Diagrama em branco](https://github.com/user-attachments/assets/b4373aa1-788c-4d66-81a4-85375c3a709f)

1. **cálculo da complexidade ciclomática e seus caminhos**

\[
M = E - N + 2P
\]

Onde:  
- **E** = Número de arestas no grafo (19)  
- **N** = Número de nós no grafo (17)  
- **P** = Número de componentes conectados (1)  

Substituindo os valores:


M = 19 - 17 + 2(1)  
M = 19 - 17 + 2  
M = 4


Portanto, a **complexidade ciclomática é 4**, indicando que são necessários, no mínimo, 4 casos de teste para cobrir todos os caminhos possíveis.

## Caminhos Possíveis

Os caminhos identificados no grafo são:  
1º. **1 → 2 → 3 → 4 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 13 → 14 → 11 → 15 → 16 → 17**  
2º. **1 → 2 → 3 → 4 → 3 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 13 → 11 → 15 → 16 → 17**  
3º. **1 → 2 → 3 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 13 → 14 → 11 → 15 → 16 → 17**  
4º. **1 → 2 → 3 → 4 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 10 → 11 → 12 → 15 → 16 → 17**

## TESTE ESTÁTICO

![Captura de tela 2024-11-30 181119](https://github.com/user-attachments/assets/f94f06f0-076d-43b1-8b5e-53b7628682b8)
