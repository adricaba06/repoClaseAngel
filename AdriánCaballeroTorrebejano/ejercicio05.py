m = 0
n = 0
caracter = '*'


m = int(input('Escriba el tamaño del segmento'))
n = int(input('Escriba el número de segmentos'))


def imprimirSegmentos(m, n):
    print(((caracter * m) + ' ' *m)*n)
    
imprimirSegmentos(m,n)