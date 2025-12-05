
tam = 7
lista = []
numero = 0
numeroMasGrande = 0
numeroMasPequenio = 0


#--------------------------------------------------
def ordenarPrimeroYUltimo(lista_numeros):
    valor_max = max(lista_numeros)
    valor_min = min(lista_numeros)
    
    vecesMax = lista_numeros.count(max(lista_numeros))
    vecesMin = lista_numeros.count(min(lista_numeros))
    
    for _ in range(vecesMax):
        lista_numeros.remove(valor_max)
        
    for _ in range(vecesMin):    
        lista_numeros.remove(valor_min)
    
    for _ in range(vecesMax): 
        lista_numeros.insert(0, valor_min)
        
    for _ in range(vecesMin):     
        lista_numeros.append(valor_max)
    
    
#-------------------------------------------------- no leemos dentro de la funcion

for i in range(tam):
    numero = int(input(f'Escribe el {i+1} numero: '))
    lista.append(numero)
    

ordenarPrimeroYUltimo(lista)

print(lista)

#mi compañero ha ordenado la lista directamente