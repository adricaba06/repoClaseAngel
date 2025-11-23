import random


f = open('Listado4/ejercicio06/texto.txt', 'r', encoding='utf-8')


respuesta = 0
lineas = f.readlines()
repetir = True
palabras = []
conatdor = 0



while(repetir):
    print("""
          1 La palabra de mayor longitud.
          2 Las veces que aparece una palabra.
          3 Lea una línea aleatoria del fichero.
          4 Cuantas lineas tiene el documento
          5 palabras que empiezen por esa letra
          """)
    
    respuesta = int(input('Qué desea hacer'))
    
    match respuesta:
        case 1:
            for linea in lineas:
                linea = linea.strip()
                if linea:
                    palabras.append(linea)
                    
            palabra_mas_larga = max(palabras)
            print("La palabra más larga es ", palabra_mas_larga)
            
        case 2:
            palabra_buscar = input("palabra a contar: ")
            contador = 0
            print(lineas)
            for linea in lineas:
                if palabra_buscar in lineas:
                    contador = contador + 1
            print(f"La palabra '{palabra_buscar}' aparece {contador} veces")
            
        case 3:
             index = random.randint(0, len(lineas)-1)
             print("Línea aleatoria:", lineas[index].strip())
             
        case 4:
            print("El fichero tiene", len(lineas), "líneas")
            
        case 5:
            letra = input("Ingrese la letra inicial: ").lower()
            for i in range(len(lineas)):
                linea = lineas[i]  
                palabras = linea.split()  
                for j in range(len(palabras)):
                    palabra = palabras[j]
                    if palabra.lower().startswith(letra):
                        print(palabra)