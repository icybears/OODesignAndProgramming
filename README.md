# Object Oriented Design and Programming practice exercices

The following are a couple of programming exercices that focus on Object orientation, taken from "SQLI E-Challenges".

The goal is to design and implement a program that passes all the tests in the test class. Each exercise has its own test class inside in `test/net/sabercrafts/oop`
The exercises are:

- Elevators Exercise

      This test is about a building having several elevators with different states.
      For example, each elevator can be at a different level, and can be going up,
      or down.

      The objective of this exercise is to write a program that will identify which
      elevator will be served once a request for an elevator is registered.

      Please note these rules : 
      - An elevator is requested by default from <b>top</b> floor. </br>
      - An elevator can be resting at a given floor, going up or going down. </br>
      - An elevator switch automatically his direction when reaching the edges of
      the building (means the first and top floors). </br>
      - An elevator can not switch his direction in the middle of a building.
      Example: in a building of 10 floors, an elevator at the 3rd floor and
      ascending can never go down before reaching the 10th floor. And vice
      versa.</br>
      - An elevator is never in between floors.

 
- Train Exercise

      The aim of this exercise is to design and write a code to pass all tests.

      A train is made of different types of wagons: head, passenger, restaurant, and cargo.
      Each type has its specific representation:
      - Head :      <HHHH if its the last wagon
                    HHHH> if it is the first wagon
      - Passenger  : |OOOO|
      - Restaurant : |hThT|
      - A cargo wagon can be either empty or loaded
              - If empty : its represented as |____| 
              - If loaded: its represented as |^^^^| 

      The wagons are connected by "::"


- Quarantine Exercise

       The responsibility of the Quarantine object is to simulate diseases on a group of patients.
       It is initialized with a list of patients' health status, separated by a comma.
            Each health status is described by one or more characters
            (in the test below, we will always have only one disease / patient)
     
        The characters mean:
        H : Healthy
        F : Fever
        D : Diabetes
        T : Tuberculosis
     
        Quarantine provides medicines to the patients, but can not target a specific group of patient.
        The same medicines are always given to all the patients.
     
        Then Quarantine can provide a report with this format:
        "F:1 H:2 D:0 T:1 X:3"
     
        Report give the number of patients that have the given disease.
        X means Dead
     

# My proposed solutions
You can find the code inside `src/net/sabercrafts/oop`.
Below is my proposed solutions class diagrams:

## Elevators exercise

![Elevator class diagram](src/net/sabercrafts/oop/elevator/elevator-class-diagram.jpg?raw=true "Elevator class diagram")

## Train exercise

![Train class diagram](src/net/sabercrafts/oop/train/train-class-diagram.jpg?raw=true "Train class diagram")

## Quarantine exercise

![Quarantine class diagram](src/net/sabercrafts/oop/quarantine/quarantine-class-diagram.jpg?raw=true "Elevator class diagram")
