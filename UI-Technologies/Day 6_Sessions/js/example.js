class StudentClass {
                    
    //constructor initialize properties
    
    constructor(name, stream) {
    //this is an owner object 
        console.log(this)
        this.name = name;
        this.stream = stream;
    }
    
    }

    
    let studentVar = new StudentClass("KB", "IT");
    let studentVar2 = new StudentClass("AA", "MCA");
    console.log(studentVar.name)
    console.log(studentVar2);

    //Class Inheritance
            class student {
                    constructor(city) {
                        this.scity = city;
                    }
                    //Method inside a class...
                    cityMethod() {
                        return 'I am from ' + this.scity;
                    }
            }

                //Use the "extends" keyword to inherit all methods from another class
                class steam extends student {
                constructor(city, stream) {
                //Use the "super" method to call the parent's constructor function.
                    super(city);
                    this.stream = stream;
                }
            
                //Method inside a class...
                show() {
                    return this.cityMethod() + ', studying in  ' + this.stream;
                }
                }

                let studentVar = new steam("Kolkata", "IT");
                console.log(studentVar.show());

                var name="AA";
                let subject="Math";
                const city="Kolkata";
                var name = "BB"
                let subject="CS"
                console.log(name)
                console.log(subject)
                console.log(city)

                "use strict";
                 
                  y = 3.14;    
                console.log(y);

                var list = {
                    returnMeMyName:function(name){
                        console.log(name)
                    }

                }
                returnMeMyName('KB');
                Math.round(60.8)
                Math.round(60.4)
                
                Math.floor(60.4)
                Math.floor(60.8)
               
                Math.ceil(60.8)
                Math.ceil(60.4)
               
                Math.sign(-4);
                Math.sign(4);
