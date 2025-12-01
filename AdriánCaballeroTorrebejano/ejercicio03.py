cantidad = int(input("¿cuantos números vas a introducir? "))

numeros = []


def mostrar_no_mayores(lista):
    for i in range(1, len(lista)):
        if lista[i] <= lista[i - 1]:
            print(f"El número {lista[i]} NO es mayor que el anterior ({lista[i - 1]})")


for i in range(1, cantidad):
    numero = int(input(f"Introduce el número {i}: "))
    numeros.append(numero)
   
mostrar_no_mayores(numeros)


# version pedro

"""

print ('Bienvenido al programa')
listadonumeros=[]
mayores=[]
numero= int (input('Indica un número \n'))
def verMayores(numero):
    cuantosNumeros= int(input('Introduzca la cantidad de números \n'))
    for i in range (cuantosNumeros):
        numeros=int(input('Introduzca un número \n'))
        listadonumeros.append(numeros)
        
    for i in listadonumeros:
        if numero>i:
            print(f'El número {numero} es mayor que {i}')


verMayores(numero)

"""

"""mixta

def verMayores(numero):
    cuantosNumeros= int(input('Introduzca la cantidad de números \n'))
    for i in range (cuantosNumeros):
        numeros=int(input('Introduzca un número \n'))
        listadonumeros.append(numeros)
        
for i in listadonumeros:
    if numero>i:
        print(f'El número {numero} es mayor que {i}')


verMayores(numero)







"""