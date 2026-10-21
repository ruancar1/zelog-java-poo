# ZéLog — Sistema de Cargas em Java

Projeto acadêmico desenvolvido para praticar **Programação Orientada a Objetos (POO)** em Java, a partir de um exercício da disciplina.

## Sobre o projeto

A ZéLog é uma transportadora fictícia que gerencia o carregamento e descarregamento de encomendas em caminhões. Cada caminhão possui uma placa e uma capacidade máxima. Cada encomenda possui descrição, peso e valor do frete.

O sistema permite:

- Carregar encomendas sem ultrapassar a capacidade do caminhão.
- Descarregar encomendas pela descrição.
- Consultar a carga atual e seu peso total.
- Calcular a soma dos fretes das encomendas carregadas.
- Impedir que o mesmo objeto de encomenda seja carregado duas vezes no mesmo caminhão.

## Conceitos praticados

- Classes, objetos e construtores
- Encapsulamento
- Agregação entre `Caminhao` e `Encomenda`
- `ArrayList` e `List`
- Laços de repetição e condicionais
- Sobrescrita de `toString()`
- `StringBuilder`
- Validação básica de dados

## Estrutura

```text
zelog-java-poo/
├── src/
│   ├── Caminhao.java
│   ├── Encomenda.java
│   └── Main.java
├── .gitignore
└── README.md
```

## Como executar

Requisitos: **JDK 11 ou superior**.

Na pasta raiz do projeto, execute:

```bash
javac -d out src/*.java
java -cp out Main
```

No Windows (PowerShell), os mesmos comandos funcionam com o JDK instalado e configurado no PATH.

## Exemplo de saída

```text
Encomenda Notebook Dell carregada no caminhão OKT-4821
Encomenda Cadeira gamer carregada no caminhão OKT-4821
Capacidade excedida: Geladeira não cabe no caminhão OKT-4821
Encomenda Micro-ondas carregada no caminhão OKT-4821
Caminhão OKT-4821 (capacidade: 80.0kg)
- Notebook Dell
- Cadeira gamer
- Micro-ondas
Peso carregado: 32.5kg
Frete total: 175.0
Encomenda Cadeira gamer descarregada do caminhão OKT-4821
Fogão não está no caminhão OKT-4821
Cadeira gamer | 18.0kg | frete 80.0
Encomenda Geladeira carregada no caminhão OKT-4821
Caminhão OKT-4821 (capacidade: 80.0kg)
- Notebook Dell
- Micro-ondas
- Geladeira
Peso carregado: 74.5kg
Frete total: 245.0
```

## Observações

As encomendas são criadas independentemente dos caminhões, caracterizando uma relação de **agregação**. Este é um projeto de aprendizado, executado no terminal, sem interface gráfica ou persistência de dados.
