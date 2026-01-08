

def generar_password(base, repeticiones):
    return (base * repeticiones) + '!'


base = (input('Introduce la base de la contraseña'))
repeticiones = int(input('Numero de repeticiones')) 

print(generar_password('123', 3))