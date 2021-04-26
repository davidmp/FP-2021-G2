fun main(args: Array<String>){
  //Declarar variables y otros
  var b : Int
  var h : Int
  var area : Int
  //Datos de Entrada
  print("Ingrese base: ")
  b = readLine()!!.toInt()
  print("Ingrese altura: ")
  h = readLine()!!.toInt()  
  //Proceso
  area = b*h/2
  //Datos de salida
  println("El área del triangulo es: $area")
}