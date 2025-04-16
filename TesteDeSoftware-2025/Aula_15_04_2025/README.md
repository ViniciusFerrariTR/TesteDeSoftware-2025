# Validador de Senhas (com TDD)

## 📌 Descrição

Projeto em Python para validação de senhas com TDD. O sistema valida senhas com base em regras simples, garantindo segurança mínima.

## ✅ Regras de Validação

- Mínimo de 8 caracteres.
- Pelo menos uma letra maiúscula.
- Pelo menos uma letra minúscula.
- Pelo menos um número.
- Pelo menos um caractere especial (ex: !@#$%^&*).
- Não pode conter espaços em branco.

## 🧪 Tecnologias

- Python 3
- Pytest

## 📌 Decisões Tomadas

- Começamos o desenvolvimento com testes (TDD)
- Optamos por regras simples para manter o projeto didático
- Foi usado funções nativas (`isalpha`, `isdigit`,`isalnum`,`isupper`,`islower`, `isspace`) para facilitar o desenvovimento dos testes. Fonte: https://www.w3schools.com/PYTHON/python_ref_string.asp

## ⚠️ Desafios Encontrados

- Compreensão inicial dos métodos nativos
- Garantir que os testes funcionassem de forma simples
- Manter o código limpo e legível mesmo com diversos testes e validações
