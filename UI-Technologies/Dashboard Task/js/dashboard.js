$(document).ready(function () {
    var retrievedObject = localStorage.getItem('registerObj');
    retrievedObject = JSON.parse(retrievedObject)
    var welcomeText = "Welcome " + retrievedObject.firstname.toUpperCase();
    $("#welcome").html(welcomeText);
    $("#firstname").val(retrievedObject.firstname.toUpperCase());
    $("#lastname").val(retrievedObject.lastname.toUpperCase());
    $("#email").val(retrievedObject.email.toUpperCase());
    if (retrievedObject.gender.toUpperCase() == "MALE") {
        $("#o1").prop("checked", true);
    }
    else {
        $("#o2").prop("checked", true);
    }
    $("#city").val(retrievedObject.city.toUpperCase());
    $('#country').val(retrievedObject.country).change();
});


function logout() {
    localStorage.removeItem('registerObj');

}