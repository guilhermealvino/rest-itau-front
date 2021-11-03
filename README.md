🔐API WEB
- Construa uma aplicação que exponha uma api web que valide se uma senha é válida.


# Descrição
Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
    - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto

Exemplo:

```c#
IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
```
> **_Nota:_**  Espaços em branco não devem ser considerados como caracteres válidos.

## Problema

Construa uma aplicação que exponha uma api web que valide se uma senha é válida.

Input: Uma senha (string).  
Output: Um boolean indicando se a senha é válida.


## Requisitos

[SDK Java 11] (https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
[IntelliJ Community] (https://www.jetbrains.com/pt-br/idea/download/#section=windows)


## Tecnologias e ferramentas usadas
- [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [REGEX](https://regexr.com)
- [Java Spring Boot](https://spring.io/projects/spring-boot)
- JavaScript
- HTML
- CSS
  - Navegadores: Chrome, Mozila e IE


## Observações

O projeto é bem simples, aplicando o que se pede apenas num campo de login e senha, onde as validações sao feitas apenas no campo senha (password).

> **_Nota:_**  O projeto está sendo rodado no Intellij na http://localhost:8080/ - @GetMapping("/")
