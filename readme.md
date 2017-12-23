# PhoneBook Interface

This simple web application is built on **Spring MVC**, and is made to be run on a tomcat (a java servlet container).

Firstly, it responds to HTTP get requests with a simple webpage, which uses Ajax requests to get the information from a RESTful API provided by the application, which in itself uses [*Jackson*](https://github.com/FasterXML/jackson) to fetch this data from [this api](http://www.mocky.io/v2/581335f71000004204abaf83). This convoluted way of doing things is by design, and meant as a showcase of one's knowledge of different frameworks and methodologies, not as an example of proper web application structure.

Search filters are then implemented client side, using *JavaScript* and *jQuery*.

Front-end backed by [Bootstrap](https://getbootstrap.com/).

-------
## Running it
To run the application, simply deploy the .war file available [here](https://github.com/guilhermebrehm/phonebook-interface-beginner/releases/download/v1.0.0/phonebook.war) to tomcat. To use the application, use an internet browser and navigate to wherever you deployed it, or you can simply check it out [over here](http://52.31.253.195:8080/phonebook) (hosted by me).
