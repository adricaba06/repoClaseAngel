f = open('Listado4/ejercicio01/entrada.txt', 'r')

count = 0

for line in f:
    if line.strip():
        count = count +1
        
f.close()

print(count)


# .strip no cuenta los espacios vacios