f = open('datos.txt', 'r', encoding='utf-8')

lineas = f.readlines()

f.close()

lineasInvertidas = lineas[::-1] 



salida = open('invertido.txt', 'w', encoding='utf-8')

for linea in lineasInvertidas:
    salida.write(linea) 


salida.close()


