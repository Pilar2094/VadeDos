# Proyecto_AgenciaDeViajes
 Creación de microservicios agencia de viajes 
Se pretende crear una aplicación para una agencia de viajes, basada en microservicios. En el backend, la aplicación constará de tres microservicios que accederán a una base de datos. Se trata de los microservicios de hotel, vuelos y reservas 
Servicio de hotel. 
A partir de una tabla de hoteles que incluye los siguientes campos: idHotel (autonumérico), nombre, categoria, precio y disponible (si o no), se crearán los siguientes recursos: 
• Ante una petición get, devuelve la lista de hoteles disponibles. 
• Mediante otra petición get, se obtendrán los datos de un hotel a partir de su nombre. 

Servicio vuelos 
Actúa sobre una tabla de vuelos con los siguientes campos: idVuelo (autonumérico), compañia, fechaVuelo, precio y plazas disponibles. Expone dos recursos: 
• Un recurso que devuelve la lista de vuelos disponibles al recibir una petición get. La URL incluye el total de plazas que se pretenden reservar y se deberán devolver los datos de los vuelos que tengan plazas suficientes para dicho valor 
• Un recurso que al recibir una petición put actualiza los datos del vuelo indicado. Recibe en la url el idVuelo y las plazas reservadas 

Servicio reservas 
Utiliza una tabla de reservas con los siguientes campos: idReserva(autonumérico), nombreCliente, dni, idHotel e idVuelo. Tendrá los siguientes recursos 
• Expone un recurso que ante una petición de tipo post, que recibe en el cuerpo de la misma un objeto JSON con el identificador vuelo, identificador hotel, nombre, dni y total de personas que forman la reserva, registrará la misma en la base de datos. Interacciona con el servicio de vuelos para actualizar las plazas disponibles al realizar la reserva. 
• Dispondrá de otro recurso que, ante una petición get, devolverá las reservas existentes (nombre, dni, vuelo), para el nombre hotel recibido como variable en url. Deberá interaccionar con el servicio de hoteles para conocer el idHotel a partir de su nombre. 


