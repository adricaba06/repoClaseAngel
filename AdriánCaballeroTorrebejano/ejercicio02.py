
tam = 3
lista = []
numero = 0
numeroMasGrande = 0
numeroMasPequenio = 0

#--------------------------------------------------
def ordenarPrimeroYUltimo(lista_numeros):
    valor_max = max(lista_numeros)
    valor_min = min(lista_numeros)
    
    lista_numeros.remove(valor_max)
    lista_numeros.remove(valor_min)
    
    lista_numeros.insert(0, valor_min)
    lista_numeros.append(valor_max)

#--------------------------------------------------


for i in range(tam):
    numero = int(input(f'Escribe el {i+1} numero: '))
    lista.append(numero)
    

ordenarPrimeroYUltimo(lista)

print(lista)