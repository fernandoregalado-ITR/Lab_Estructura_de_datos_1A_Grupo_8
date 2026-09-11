Antes, la estructura seleccionada Hashmap, porque identifica un valor, en este caso en concreto, (clave, valor), se agrega y se actualiza, en los
requerimientos para que el programa sirve estan explicitamente y cito: "Registrar nuevo usuario"


Usando Hasmap, se puede agregar el usuario, con .put(), y se puede usar: containsKey,para revisar todos los usuarios, que tambien, vuelvo a citar: "Verificar disponibilidad
 de Username"

PUNTO 4:
Porque ArrayList o LinkedList No son aceptables?
R/ LinkedList permite valores duplicados, ArrayList tampoco ya que se requiere listas, y en este caso es un login que require que cada clave tenga un valor

Porque Hashet NO resuelve el problema por si solo?
R/ Dentro del uso del hashet aunque bien o permite duplicados, no garantiza un orden en especifico, esto se puede ver reflejado en que un usuario puede tener otra contraseña 
que nunca escribio y tambien que hashet solo puede 

¿Por que TreeMap no es una opcion ideal?
R/ No se seria una opcion ideal ya que TreeMap aparte de que hace todo lo de HasHmap tambien lo ordenada tanto alfabeticamente y numericamente pero si quisiera saber en que orden se registro un usurio no pudiera porque el TreeMap usa un 
comparator interno y no pudiera buscar en elo oren que yo quisiera

Cual es a UNICA estructura basada en hasshing que resulve todas las operaciones en tiempo promedio constante 0(1)?
R/ Es el HashMap porque en la definicion menciona: (clave, valor), en este caso es: usuario, contraseña, 
