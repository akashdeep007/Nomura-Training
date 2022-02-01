// Defining a function to display error message
function printError(elemId, hintMsg) {
  elemId = "#" + elemId;
  $(elemId).html(hintMsg);
  //  (document.getElementById(elemId).parentElement.className)
  $(elemId).parent().removeClass("successcolor").addClass("errorcolor");
}
function printSuccess(elemId, hintMsg) {
  elemId = "#" + elemId;
  $(elemId).html(hintMsg);
  //  (document.getElementById(elemId).parentElement.className)
  $(elemId).parent().removeClass("errorcolor").addClass("successcolor");
}

// Defining a function to validate form
function validateForm() {
  //var els = document.querySelectorAll('.row.errorcolor');

  // Retrieving the values of form elements
  var firstname = $("#firstname").val();
  var lastname = $("#lastname").val();
  var email = $("#email").val();
  var city = $("#city").val();
  var gender = $("input[name='gender']:checked").val();
  var country = $("#country").val();
  var password = $("#password").val();

  // Defining error variables with a default value
  var firstnameErr = (lastnameErr = emailErr = cityErr = passwordErr = true);

  // Validate first name
  if (firstname == "") {
    printError("firstnameErr", "Please enter your First Name");
  } else {
    if (firstname.length < 2) {
      printError("firstnameErr", "Please put more than two alphabet.");
    } else {
      var regex = /^[a-zA-Z\s]+$/;
      if (regex.test(firstname) === false) {
        printError("firstnameErr", "Please enter a valid First Name");
      } else {
        printSuccess("firstnameErr", "");
        firstnameErr = false;
      }
    }
  }

  // Validate last name
  if (lastname == "") {
    printError("lastnameErr", "Please enter your Last Name");
  } else {
    if (lastname.length < 2) {
      printError("lastnameErr", "Please put more than two alphabet.");
    } else {
      var regex = /^[a-zA-Z\s]+$/;
      if (regex.test(lastname) === false) {
        printError("lastnameErr", "Please enter a valid Last Name");
      } else {
        printSuccess("lastnameErr", "");
        lastnameErr = false;
      }
    }
  }

  // Validate city
  if (city == "") {
    printError("cityErr", "Please enter your City");
  } else {
    if (city.length < 2) {
      printError("cityErr", "Please put more than two alphabet.");
    } else {
      var regex = /^[a-zA-Z\s]+$/;
      if (regex.test(city) === false) {
        printError("cityErr", "Please enter a valid City");
      } else {
        printSuccess("cityErr", "");
        cityErr = false;
      }
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

  if (password == "") {
    printError("passwordErr", "Please enter your password");
  } else {
    var regex =
      /^(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[a-zA-Z!#$%&?@ "])[a-zA-Z0-9!#$%&?@]{8,20}$/;
    if (regex.test(password) === false) {
      printError("passwordErr", "Please enter a valid password");
    } else {
      printSuccess("passwordErr", "");
      passwordErr = false;
    }
  }

  // Prevent the form from being submitted if there are any errors
  if (
    (firstnameErr || lastnameErr || emailErr || cityErr || passwordErr) == true
  ) {
    return false;
  } else {
    // // Creating a string from input data for preview
    // var dataPreview =
    //   "You've entered the following details: \n" +
    //   "Full Name: " +
    //   firstname +
    //   " " +
    //   lastname +
    //   "\n" +
    //   "Email Address: " +
    //   email +
    //   "\n" +
    //   "City: " +
    //   city +
    //   "\n" +
    //   "Country: " +
    //   country +
    //   "\n" +
    //   "Gender: " +
    //   gender +
    //   "\n";
    // "Password: " + password + "\n";
    // // Display input data in a dialog box before submitting the form
    // alert(dataPreview);

    var obj = {
      userName: firstname + lastname,
      firstname: firstname,
      lastname: lastname,
      password: password,
      email: email,
      city: city,
      country: country,
      gender: gender
    }
    console.log(obj);
    localStorage.setItem('registerObj', JSON.stringify(obj));
    document.getElementById("login").click();
    return false;
  }
}
