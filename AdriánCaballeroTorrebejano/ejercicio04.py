
l = 0
caract = ' * '
l = int(input('Introduzca el tamaño del lado del cuadrado'))



for i in range(l):
    print(caract*l)
    
for i in range(l):
    print('   ' * l + caract * l)