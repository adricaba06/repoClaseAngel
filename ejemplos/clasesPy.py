class Androide:
    def __init__(self, nombre, modelo):
        self.nombre = nombre
        self.modelo = modelo
        
    def saludar(self):
        print('Hola, soy', self.nombre);
        
    def apagar(self):
        print('Apagando motores') # en todos los metodos de la clase pondremos self como parametro, sino no va a funciona
        
a1 = Androide("pepe", "RBJ2")

a1.saludar()

# Herencia ----------------------

class Animal:
    def __init__(self, nombre):
        self.nombre = nombre
        
    def hacerSonido(self):
        print('sonido')

class Perro(Animal): #asi ponemos la herencia 
    def __init__(self, nombre, raza):
        super().__init__(nombre)
        self.raza = raza;
        
    def hacerSonido(self):
        print('guauf') #rescritura
        
a1 = Animal('petunia')
a2 = Perro('Simba', 'pastor aleman')

a1.hacerSonido()
a2.hacerSonido()
                