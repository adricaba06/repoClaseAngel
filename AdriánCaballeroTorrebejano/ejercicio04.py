
l = 0

l = int(input('Introduzca el tamaño del lado del cuadrado'))



def pintarCuadrado(l):
    caract = ' * '
    
    for i in range(l):
        print(caract*l)
    
    for i in range(l):
        print('   ' * l + caract * l)
        
        
pintarCuadrado(l)