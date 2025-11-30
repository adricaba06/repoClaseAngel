cantidad = int(input("¿cuantos números vas a introducir? "))

numeros = []


def mostrar_no_mayores(lista):
    for i in range(1, len(lista)):
        if lista[i] <= lista[i - 1]:
            print(f"El número {lista[i]} NO es mayor que el anterior ({lista[i - 1]})")


for i in range(1, cantidad):
    numero = int(input(f"Introduce el número {i+1}: "))
    numeros.append(numero)
   
mostrar_no_mayores(numeros)