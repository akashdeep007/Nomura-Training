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
function Login() {
  //var els = document.querySelectorAll('.row.errorcolor');

  // Retrieving the values of form elements
  var email = $("#email").val();
  var password = $("#password").val();

  // Defining error variables with a default value
  var emailErr = (passwordErr = true);

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
  if ((emailErr || passwordErr) == true) {
    return false;
  } else {
    // // Creating a string from input data for preview
    // var dataPreview =
    //   "You've entered the following details: \n" +
    //   "Email Address: " +
    //   email +
    //   "\n" +
    //   "Password: " +
    //   password +
    //   "\n";
    // // Display input data in a dialog box before submitting the form
    // alert(dataPreview);
    var retrievedObject = localStorage.getItem('registerObj');
    if (retrievedObject == null) {
      printError("credErr", "Invalid Email or Password");
      return false;
    }
    console.log(retrievedObject);
    retrievedObject = JSON.parse(retrievedObject)
    var credEmail = credPass = false;
    if (email.toUpperCase() == retrievedObject.email.toUpperCase()) {
      credEmail = true;
    }
    if (password == retrievedObject.password) {
      credPass = true
    }
    if (credEmail && credPass) {
      console.log("valid")
      document.getElementById("dashboard").click();
      return false;
    }
    else {
      printError("credErr", "Invalid Email or Password");
      return false;
    }

  }
}
