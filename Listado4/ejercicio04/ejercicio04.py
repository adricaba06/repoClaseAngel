f = open('Listado4/ejercicio04/texto.txt', 'r')

lineas = f.readlines()

f.close()

salida = open('Listado4/ejercicio04/numerado.txt', 'w', encoding='utf-8')


for i, linea in enumerate(lineas, start=1):
    salida.write(f"{i}: {linea}")

salida.close()