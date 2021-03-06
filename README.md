# Java-Design-Patterns
<br>
<hr>
I studied design patterns and included examples of these patterns here in this repository
<br>

<h3>Creational patterns</h3> <br>
<ol type="1">
  <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/creational/signleton">Singleton</a></li>
    Instanciates only one instance of a class
  <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/creational/factorymethod">Factory method</a></li>
  Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.<br> <br>
</ol>

<h3>Structural patterns</h3> <br>
<ol type="1">
  <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/structural/decorator">Decorator</a></li>
  This one is a complex one. The main idea is to be able to assemble an item from other parts. Works like a recursion. One needs to create a new instance of an addon(decorator), then pass another addon to the constructor, which also takes an addon and so on and so forth ubtil eventually we pass the main(base) item. Then, by calling the assemble method it'll start to go backwards starting from the base item and putting things together(assembling) as it goes. Example: 1) coffee with milk and chocolate; 2) a car sharing luxury and sport traits. <br> <br>
</ol>

<h3>Behavioral patterns</h3> <br>
<ol type="1">
  <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/bevavioral/strategy">Strategy</a></li>
  Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime. <br> Strategy pattern is also known as <b>Policy Pattern</b>. We define multiple algorithms and let client application pass the algorithm to be used as a parameter. <br> One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways. <br> <br>
  <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/bevavioral/observer">Observer</a></li>
  Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject. <br><br>
  <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/bevavioral/chainofresponsibility">Chain Of Responsibility</a></li>
  Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.<br>
  For example, the Calculator with 4 operations. Whenever there's a request to perfom a certain operation on numbers, the data chunk will pass through some or all of the cains until it find the one it needs and will output the result.<br><br>
   <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/bevavioral/memento">Memento</a></li>
  Memento design pattern is used when we want to save the state of an object so that we can restore later on. Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the object, this protects the integrity of saved state data. <br><br>
  <li><a href="https://github.com/MiddleZwei/Java-Design-Patterns/tree/master/src/com/javadesignpatterns/bevavioral/templatemethod">Template Method</a></li>
  Template method defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.<br>
  For instance, all common behaviors may be placed inside of an abstract class, which also has the implementation of a method which calls all other methods in order to complete the object. In the case of a House all buildings have windows(I believe so), but differnet materials for the walls - glass, wooden, brick etc. <== And this is what needs to be implemented in the concrete classes to complete from the template. <br><br>
 
</ol>
