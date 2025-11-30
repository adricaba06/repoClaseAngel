horas = {"Ana": 7, "Luis": 9, "Marta": 6}


def mas_procrastina(diccionario_horas):
    
    mayor = max(diccionario_horas, key=diccionario_horas.get)

    return mayor
# https://es.stackoverflow.com/questions/407011/como-conseguir-el-key-con-el-valor-mas-alto-en-un-diccionario-en-python


print(mas_procrastina(horas))