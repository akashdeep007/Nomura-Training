
// Defining a function to display error message
function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
    //  (document.getElementById(elemId).parentElement.className)
    document.getElementById(elemId).parentElement.classList.add('errorcolor');
}
function printSuccess(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
    //  (document.getElementById(elemId).parentElement.className)
    document.getElementById(elemId).parentElement.classList.add('successcolor');
}

function loadHtml() {
    var includes = $('[data-include]')
    $.each(includes, function () {
        var file = '' + $(this).data('include') + '.html'
        $(this).load(file);

    })



}
$(document).ready(function () {
    loadHtml();

})
// Defining a function to validate form 
function validateForm() {
    //var els = document.querySelectorAll('.row.errorcolor');

    // Retrieving the values of form elements 
    var name = document.contactForm.name.value; var password = document.contactForm.password.value;
    var email = document.contactForm.email.value;
    var mobile = document.contactForm.mobile.value;
    var country = document.contactForm.country.value;
    var gender = document.contactForm.gender.value;
    var hobbies = [];
    var checkboxes = document.getElementsByName("hobbies[]");
    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            // Populate hobbies array with selected values
            hobbies.push(checkboxes[i].value);
        }
    }

    // Defining error variables with a default value
    var nameErr = passwordErr = emailErr = mobileErr = countryErr = genderErr = true;

    // Validate username
    if (name == "") {
        printError("nameErr", "Please enter your name");
    } else {
        if (name.length <= 2) {
            printError("nameErr", "Please put more than two alphabet.");
        }
        else {
            var regex = /^[a-zA-Z\s]+$/;
            if (regex.test(name) === false) {
                printError("nameErr", "Please enter a valid name");
            } else {
                printSuccess("nameErr", "");
                nameErr = false;
            }
        }

    }

    /*
    Restrictions: (Note: I have used >> and << to show the important characters)

                Minimum 8 characters {>>8,20}
                Maximum 20 characters {8,>>20}
                At least one uppercase character (?=.*[A-Z])
                At least one lowercase character (?=.*[a-z])
                At least one digit (?=.*\d)
                At least one special character (?=.*[a-zA-Z >>!#$%&? "<<])[a-zA-Z0-9 >>!#$%&?<< ]
    */

    // Validate password
    if (password == "") {
        printError("passwordErr", "Please enter your password");
    } else {

        var regex = /^(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[a-zA-Z!#$%&? "])[a-zA-Z0-9!#$%&?]{8,20}$/;
        if (regex.test(password) === false) {
            printError("passwordErr", "Please enter a valid password");
        } else {
            printSuccess("passwordErr", "");
            passwordErr = false;
        }
    }




    // Validate email address
    if (email == "") {
        printError("emailErr", "Please enter your email address");
    } else {
        // Regular expression for basic email validation
        var regex = /^\S+@\S+\.\S+$/;
        if (regex.test(email) === false) {
            printError("emailErr", "Please enter a valid email address");
        } else {
            printSuccess("emailErr", "");
            emailErr = false;
        }
    }

    // Validate mobile number
    if (mobile == "") {
        printError("mobileErr", "Please enter your mobile number");
    } else {
        var regex = /^[1-9]\d{9}$/;
        if (regex.test(mobile) === false) {
            printError("mobileErr", "Please enter a valid 10 digit mobile number");
        } else {
            printSuccess("mobileErr", "");
            mobileErr = false;
        }
    }

    // Validate country
    if (country == "Select") {
        printError("countryErr", "Please select your country");
    } else {
        printSuccess("countryErr", "");
        countryErr = false;
    }

    // Validate gender
    if (gender == "") {
        printError("genderErr", "Please select your gender");
    } else {
        printSuccess("genderErr", "");
        genderErr = false;
    }

    // Prevent the form from being submitted if there are any errors
    if ((nameErr || emailErr || passwordErr || mobileErr || countryErr || genderErr) == true) {
        return false;
    } else {
        // Creating a string from input data for preview
        var dataPreview = "You've entered the following details: \n" +
            "User Name: " + name + "\n" +
            "Password: " + password + "\n" +
            "Email Address: " + email + "\n" +
            "Mobile Number: " + mobile + "\n" +
            "Country: " + country + "\n" +
            "Gender: " + gender + "\n";
        if (hobbies.length) {
            dataPreview += "Hobbies: " + hobbies.join(", ");
        }


        //localStorage.removeItem('registerObj');
        var obj = {
            userName: name,
            password: password,
            email: email,
            mobile: mobile
        }
        // Put the object into storage
        window.localStorage.setItem('registerObj', JSON.stringify(obj));

        // Retrieve the object from storage
        //   var retrievedObject = localStorage.getItem('registerObj');

        // console.log('registerObj: ', JSON.parse(retrievedObject));


        // Display input data in a dialog box before submitting the form
        // alert(dataPreview);
    }
};