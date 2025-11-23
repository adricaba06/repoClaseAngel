f = open('Listado4/ejercicio07/texto.txt', 'a', encoding='utf-8') 

continuar = True

while continuar:
    
    nombre = input("Ingrese el nombre: ")
    apellido1 = input("Ingrese el primer apellido: ")
    apellido2 = input("Ingrese el segundo apellido: ")
    edad = input("Ingrese la edad: ")

    
    f.write(f"nombre: {nombre}\n")
    f.write(f"apellido1: {apellido1}\n")
    f.write(f"apellido2: {apellido2}\n")
    f.write(f"edad: {edad}\n")

    
    continuar = input("¿Desea agregar otro cliente? (s/n): ").lower()
    if continuar != 's':
        continuar = False
       


