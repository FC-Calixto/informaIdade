# Informa Idade

Programa em Java que calcula a idade do usuário a partir da data de nascimento digitada, realizando uma validação completa do formato e dos valores da data para assegurar precisão no cálculo e melhor usabilidade.

## Funcionalidades

- Solicita o nome do usuário com validação (somente letras e espaços, até 50 caracteres, não vazio).
- Solicita a data de nascimento no formato DD/MM/AAAA.
- Pré-processa a entrada da data para aceitar números sem separadores e insere as barras automaticamente.
- Valida o formato da data e evita datas futuras.
- Calcula a idade exata considerando dia, mês e ano usando as classes `LocalDate` e `Period`.
- Exibe a idade do usuário de maneira amigável.

## Como usar

1. Clone ou baixe este repositório.
2. Compile o programa: javac informaIdade.java
3. Execute o programa: java informaIdade
4. Siga as instruções na tela para digitar seu nome e data de nascimento.

## Tecnologias

- Java 8 ou superior
- API `java.time` para manipulação de datas

## Contribuindo

Contribuições são bem-vindas. Sinta-se à vontade para abrir issues e pull requests caso queira sugerir melhorias ou corrigir problemas.

---

Desenvolvido para facilitar a obtenção da idade exata com validação robusta da entrada de dados do usuário.
