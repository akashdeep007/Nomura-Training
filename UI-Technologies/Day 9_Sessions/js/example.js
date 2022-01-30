/*
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


var language = ["C#", "JAVA", "JAVASCRIPT",5,10];

language.length   
language.sort()  
var house = new Array(4);
house1[0] = "1BHK"
house1[1] = "2BHK"
house1[2] = "3BHK"
house1[3] = "4BHK"
house1[4] = "4BHK"
//var house = ["1BHK", 25000, "2BHK", 50000, "Rent", true]; 

 //Array.isArray(house);
 
 Array pop()//remove from last index
 
 Array push()//Add data from last index
 
 Array shift()//remove first index
 
  Array unshift()//Add data from first index
  
  Array.concat()//merge array
  
  
  //splice() method adds new elements to an array, and returns an array with the deleted elements
  
  var language = ["C#", "JAVA", "JAVASCRIPT","PYTHON"];
  language.splice(2, 0 "C++", "R"); 
//document.getElementById("demo1").innerHTML = "Original Array:<br> " + language;
//var removed = language.splice(2, 2, "C++", "R"); 
//document.getElementById("demo2").innerHTML = "New Array:<br>" + language;
//document.getElementById("demo3").innerHTML = "Removed Items:<br> " + removed; 


//slice() method slices out a piece of an array into a new array.

  var language = ["C#", "JAVA", "JAVASCRIPT","PYTHON"];
var newArr = language.slice(1);



const language = ["C#", "JAVA", "JAVASCRIPT","PYTHON"];
const newArr = language.slice(1, 2);




// Create element:
var para = document.createElement("p");
para.innerText = "This is a paragraph.";

// Append to body:
document.body.appendChild(para);


// Create element:
var para = document.createElement("p");
para.innerHTML = "This is a paragraph.";

// Append to another element:
document.getElementById("dynamicdiv").appendChild(para);
*/
/*
function addElm() {
    var language = [
        {
            "lang": ["C#", "JAVA", "JAVASCRIPT", "PYTHON"],
            "city": ["C#", "JAVA", "JAVASCRIPT", "PYTHON"]
        },
        {
            "lang": ["C++", "C", "COBOL"]
        }
    ];
    /*
    var para = ""
    para = document.createElement("ul");
    for (var p = 0; p < language.length; p++) {
      
        para.innerHTML += '<li>'+language[p]+'</li>';
     
    }
    document.getElementById("dynamicdiv").appendChild(para);
   
/*

    var language = ["C#", "JAVA", "JAVASCRIPT", "PYTHON"];
    var _elm = document.querySelectorAll('.dynamicdiv,#dynamicdiv');

    for (var p = 0; p < language.length; p++) {
        //  _elm[p].innerHTML = '<p>' + language[p] + '</p>';  
        _elm[p].innerHTML = '<button id="click_'+p+'" class="submit"><p>' + language[p] + '</p></button>';
        ///para.innerHTML += '<li>'+language[p]+'</li>';

    }
    var buttons = document.querySelectorAll(".submit");
    
    for (var button of buttons) {
        button.addEventListener('click', function (event) {
        
          callMeFromBtn(this)
        });
    }
}
function callMeFromBtn(_this){
    console.log(_this)
    console.log(_this.innerText);
}
*/


$(document).ready(function () {

    var language = ["C#", "JAVA", "JAVASCRIPT", "PYTHON"];

    var _html = "";
    var _bodyHtml = ''

    // _bodyHtml += '<div class="buttonlist" style="border-bottom: 2px dotted red;">'

    _bodyHtml += '<div class="box"></div>'
    _bodyHtml += '<h1>Button List:</h1>'
    _bodyHtml += '<div class="box"></div>'

    // _bodyHtml += '</div>';

    $('.buttonlist').html(_bodyHtml);


    for (var p = 0; p < language.length; p++) {

        _html += '<div><button id="' + p + '" class="submit btn btn-white border-blue   btn-circled"><p>' + language[p] + '</p></button></div>';
    }
    //Empty .buttonlist div and place html inside it. 
    $('.buttonlist').append(_html);
    //Remove .buttonlist div from dom. 
    //$('.buttonlist').remove();
    //Append content  after exisitng content. 
    // $('.buttonlist').append(_html);

    //place contents  before exisitng content. 
    //    $('.buttonlist').prepend(_html);

    //Add content  after buttonlist div ends. 
    // $('.buttonlist').after(_html);

    //Add content  before buttonlist div starts. 
    // $('.buttonlist').before(_html);

    $('.start').off('click').on('click', function () {
        $('.overlay').show();
    });
    $('.closeBtn').click(function () {
        $('.overlay').hide();
    })
    var color = ["green", "black", "pink", "blue"];
    $('.submit').off('click').on('click', function () {
        $('.submit').removeClass('selected')
        $(this).addClass('selected');
        var _id = $(this).attr('id')

        var _btnText = $(this).text()
        // $('.box').html(_btnText)
        
        $('.submit').parents().find('.box').eq(1).html(_btnText).css({ 'backgroundColor': color[_id] }).addClass('text-center').attr('value', _btnText)
    })
});