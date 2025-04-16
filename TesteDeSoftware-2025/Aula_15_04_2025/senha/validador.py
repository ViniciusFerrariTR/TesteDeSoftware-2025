def validar_senha(senha):
    
    #Validar tamanho de senha#
    if len(senha) < 8:
        return False
    
    #Validar se tem somente letras#
    if not any(c.isalpha() for c in senha):
        return False
    
    #Validar se tem somente numeros#
    if not any(c.isdigit() for c in senha):
        return False
    #Validar se tem somente letras ou numeros#
    if not any(c.isalnum() for c in senha):
        return False
    #Validar se tem ao menos uma letra maiuscula#
    if not any(c.isupper() for c in senha):
        return False
    # Validar se tem ao menos uma letra minuscula#
    if not any(c.islower() for c in senha):
        return False
    # Validar se tem espaços em branco#
    if not any(c.isupper() for c in senha):
        return False
    return True
