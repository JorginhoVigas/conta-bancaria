# Conta Bancária

## Sobre o Projeto
Este projeto implementa uma conta bancária que permite a realização de operações financeiras comuns, incluindo saque, depósito e pagamento de boletos, além de um sistema de cheque especial com regras específicas.

## Funcionalidades
A conta bancária permite as seguintes operações:

- **Consultar saldo** 💰
- **Consultar limite do cheque especial** 🏦
- **Depositar dinheiro** ➕
- **Sacar dinheiro** ➖
- **Pagar um boleto** 📄
- **Verificar se a conta está usando cheque especial** ⚠️

## Regras de Implementação
- O limite do cheque especial é definido no momento da criação da conta, baseado no valor depositado:
  - Se o depósito inicial for **R$500,00 ou menos**, o cheque especial será de **R$50,00**.
  - Se o depósito inicial for **acima de R$500,00**, o cheque especial será **50% do valor depositado**.
- Se o cheque especial for utilizado, a conta cobrará **uma taxa de 20% do valor utilizado**, assim que houver saldo suficiente.

## Tecnologias Utilizadas
- **Java**
- **Programação Orientada a Objetos (POO)**

## Autor
Desenvolvido por **Jorge**.

