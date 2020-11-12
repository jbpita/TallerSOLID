# TallerSOLID
## Analisis de como se vulneran los principios de SOLID
### *Principio de Substitution Ludiskov*
###En el primer punto se esta vulnerando el principio de Ludiskov puesto que la clase Helado y Pastel pueden 
derivar de una clase Padre es por esto que se crea una clase abtracta Postre en donde extenderan Pastel y Helado
### *Principio Opened and closed*
###En el segundo punto se viola el principio opened and closed puesto que si se añadiera otro tipo de postre 
tendria que modificar el programa para que pueda trabajar con los nuevos cambio. 
### *Rensponsabilidad unica*
###En el tercer punto se viola  el principio Single-Responsibility porque estos metodos de calcular precioFinal() 
y showPrecio() son metodos que no estan totalmente relacionado con nuestras clases Helado y Pastel, por eso se procedio a 
crear una clase ManejadorDePrecios que se encarga unicamente de estos metodos.
### *Principio Opened and Closed*
###En el punto cuarto se vulnera el principio Opened and Closed porque al momento de querer crear otro tipo de aderezo
se tendria que modificar el codigo  ya creado para dichos aderezos. 
### *Principio Ludiskov*
###En el quinto punto se vulnera con el principo de Substitution Ludiskov puesto que la clase LecheEntera no podia ser sustituible 
por la clase padre sin presentar fallos. 



