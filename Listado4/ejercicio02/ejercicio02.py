import datetime as dt;

f = open('Listado4/ejercicio02/fechas.txt', 'a')

fechaYHora = dt.datetime.now()
print(f'{fechaYHora.day}/{fechaYHora.month}/{fechaYHora.year} | {fechaYHora.hour}:{fechaYHora.minute}:{fechaYHora.second}')

f.write(f'{fechaYHora.day}/{fechaYHora.month}/{fechaYHora.year} | {fechaYHora.hour}:{fechaYHora.minute}:{fechaYHora.second}')

f.close()