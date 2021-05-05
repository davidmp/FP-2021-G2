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

def postulanteCarreraEstMultiple():
  #Definir Variables
  notaFinal=0.0
  #Datos de Entrada
  areaCarreraNcomp=input("Ingrese el area a la que pertenece su carrera\nB=Biomedicas\nI=Ingenieria\nS=Sociales:")
  notaEP=float(input("Ingrese la nota de EP:"))
  notaRM=float(input("Ingrese la nota de RM:"))
  notaRV=float(input("Ingrese la nota de RV:"))
  notaAB=float(input("Ingrese la nota de AB:"))
  #Proceso
  if areaCarreraNcomp=="B":
    notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30)
    areaCarreraNcomp="Biomedicas"
  elif areaCarreraNcomp=="I":
    notaFinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15)
    areaCarreraNcomp="Ingenierias"  
  elif areaCarreraNcomp=="S":
    notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20);
    areaCarreraNcomp="Sociales";
  else:
    print("La opcion que ingreso no existe! intente nuevamente....")
  #Datos de Salida
  print("La persona obtuvo una nota de: ", notaFinal," y su carrera es del area : ",areaCarreraNcomp) 

#ejercicio01()
#muestraMenorEdad()
postulanteCarreraEstMultiple()