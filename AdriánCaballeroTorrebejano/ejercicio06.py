


lista_comidas = [
    ('sushi', 12),
    ('hamburguesa', 13),
    ('pizza', 19)
]

max_calorias = 0

def filtrar_calorias(lista_comidas, max_calorias):
    lista_filtrada = []
    
    for nombre, calorias in lista_comidas:
        if calorias <= max_calorias:
            lista_filtrada.append(nombre)
    
    return lista_filtrada
    
print(filtrar_calorias(lista_comidas, 14))