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
def muestraMenorEdad():
  #Definir Variables y otros
  pnombre=""
  pedad=0
  #Datos de entrada
  p1nombre=input("Ingrese Nombre 1ra Persona:")
  p1edad=int(input("Ingrese edad 1ra Persona:"))
  p2nombre=input("Ingrese Nombre 2da Persona:")
  p2edad=int(input("Ingrese edad 2da Persona:"))
  p3nombre=input("Ingrese Nombre 3ra Persona:")
  p3edad=int(input("Ingrese edad 3ra Persona:"))  
  #Proceso
  if p1edad<p2edad and p1edad<p3edad:
    pnombre=p1nombre
    pedad=p1edad
  elif p2edad<p1edad and p2edad<p3edad:
    pnombre=p2nombre
    pedad=p2edad
  elif p3edad<p1edad and p3edad<p2edad:
    pnombre=p3nombre
    pedad=p3edad
  elif p1edad==p2edad and p2edad==p3edad:
    pnombre=p1nombre+", "+p2nombre+" y "+p3nombre
    pedad=p1edad     
  elif p1edad==p2edad:
    pnombre=p1nombre+" y "+p2nombre
    pedad=p1edad  
  elif p2edad==p3edad:   
    pnombre=p2nombre+" y "+p3nombre
    pedad=p2edad
  else:   
    pnombre=p1nombre+" y "+p3nombre
    pedad=p3edad          
  #Datos de Salida
  print("La(a) persona(s)", pnombre, " tiene(n):", pedad) 

def calcularBono():
  #Defenir Variables
  bonoSueldo, bonoantiguedad, bonoMayor=0.0,0.0,0.0
  #Datos de entrada
  anhoAntiguadad=int(input("Ingrese Anho Antiguadad:"))
  salario=float(input("Ingrese el salario actual:"))
  #Proceso
  if anhoAntiguadad>2 and anhoAntiguadad<5:
    bonoantiguedad=salario*0.20
  elif anhoAntiguadad>=5:
    bonoantiguedad=salario*0.30

  if salario<1000:
    bonoSueldo=salario*0.25
  elif salario>=1000 and salario<=3500:
    bonoSueldo=salario*0.15
  else:
    bonoSueldo=salario*0.10

  if bonoantiguedad>bonoSueldo:
    bonoMayor=bonoantiguedad
  elif bonoSueldo>bonoantiguedad:
    bonoMayor=bonoSueldo
  #Datos de Salida
  print("El bono mayor es:", bonoMayor)

#ejercicio01()
muestraMenorEdad()