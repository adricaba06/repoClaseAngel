
respuesta = ''
activado = True
texto = 'Hola, que tal'

def modo_avion(texto, activar):
    retorno = ''
    
    if activar == True:
        retorno = '[MODO AVÍON]: ' + texto
    else:
        retorno = texto
    return retorno


respuesta = input('¿Tiene el modo avíon activado? (s / n)')



if respuesta == 's':
    activado = True
else:
    activado = False
    
print(modo_avion(texto, activado))