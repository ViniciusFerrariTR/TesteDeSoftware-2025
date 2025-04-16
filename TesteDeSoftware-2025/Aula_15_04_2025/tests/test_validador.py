from senha.validador import validar_senha


def test_senha_valida():
    assert validar_senha("Senha123@") == True

def test_senha_muito_curta():
    assert validar_senha("abc1") == True

def test_senha_caractere_especial():
    assert validar_senha("Senha123") == False
    
def test_senha_espaco_branco():
    assert validar_senha("Senha 123@") == False

def test_senha_sem_letra():
    assert validar_senha("12345678") == False

def test_senha_sem_numero():
    assert validar_senha("abcd fgh") == False
