horas_vistas = 0

def maraton_series(horas, horas_de_un_dia, dias):
    resultado = []
    
    dias_resultado = 0
    horas_resultado = 0
    
    dias_resultado = int(horas * (dias / horas_de_un_dia))
    horas_resultado = horas - horas_de_un_dia
    
    resultado.append(dias_resultado)
    resultado.append(horas_resultado)
    
    return resultado

horas_vistas = int(input('Cuantas horas has estado viendo la serie'))

print(maraton_series(horas_vistas, 24, 1))