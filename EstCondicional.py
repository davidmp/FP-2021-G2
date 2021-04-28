def ejercicio01():
  #Definir Variables y otros
  print("Ejemplo Estructura Condicional 01")
  montoP=0
  #Datos de entrada
  cantidadX=int(input("Ingrese cantidad de lapices:"))
  #Proceso
  if cantidadX>=1000:
    montoP=cantidadX*0.80
  else:
    montoP=cantidadX*0.90
  #Datos de Salida
  print("El Monto a pagar es:", montoP)

ejercicio01()