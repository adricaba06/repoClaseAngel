
porcentaje = 0

def  estado_bateria(porcentaje):
    resultado = ''
    
    match porcentaje:
        
        case porcentaje if porcentaje >= 80 and porcentaje <= 100:
            resultado = 'Perfecto'
            
        case procentaje if porcentaje >= 30 and porcentaje <=79:
            resultado = 'Aceptable'
            
        case procentaje if porcentaje >= 10 and porcentaje <=29:
            resultado = 'Modo ahorra YA'
        
        case procentaje if porcentaje < 10:
            resultado = 'Busca un enchufe'
            
    return resultado;

porcentaje = input('Introduzca su bateria actual')

while porcentaje < 0 or porcentaje > 100:
    print('Porcentaje invalido, introduzcalo de nuevo')
    porcentaje = input('Introduzca su bateria actual')

print(f'|ESTADO DE BATERIA| {estado_bateria()}' )

