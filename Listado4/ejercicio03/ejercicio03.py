o = open('Listado4/ejercicio03/origen.txt', 'r')

line = o.read()

o.close()

c = open('Listado4/ejercicio03/copia.txt', 'w')

c.write(line)