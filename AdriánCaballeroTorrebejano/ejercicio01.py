print('Programa que te dice cyantos números anteriores eran menores que el siguiente')

tam = 0
numeros = []
numero  = 0

actual = 0
siguiente = 0

tam = int(input('Cuantos números va a introduccir'))

for i in range(tam):
    numero = int(input(f'Introduzca el número {i}: '))




def definirMenores(lista_recibida):
    lista_recibida = []
    
    for i, numero in numeros:
        actual = numero
        siguiente = numeros[i]
        if(actual < siguiente):
            lista_recibida.append(actual)
    
    return lista_recibida

print(definirMenores(numeros))
        