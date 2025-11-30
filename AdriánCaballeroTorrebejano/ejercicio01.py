print('Programa que te dice cyantos números anteriores eran menores que el siguiente')

tam = 0
numeros = []
numero  = 0
primerNumero = 0

actual = 0
siguiente = 0

def definirMenores(num,  lista_recibida):
    numeros_mayores = []
    
    if(lista_recibida[0] > num):
        numeros_mayores.append(lista_recibida[0])
        
        for i in range(1, len(lista_recibida)):
            if lista_recibida[i] > lista_recibida[i-1]:
                numeros_mayores.append(lista_recibida[1])
                
    return numeros_mayores




primerNumero = int(input("Introduxca el primer número "))

tam = int(input('Cuantos números va a introduccir '))

for i in range(1, tam):
    numero = int(input(f'Introduzca el número {i}: '))
    numeros.append(numero)



print(definirMenores(primerNumero, numeros))
        