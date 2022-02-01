$(document).ready(function () {
    $('.login_btn').off('click').on('click', function () {

        var retrievedObject = localStorage.getItem('registerObj');
        retrievedObject = JSON.parse(retrievedObject)
        var _username = $('.username').val();
        var _password = $('.password').val();
        var _credUser = false; var _credPass = false

        if (_username.toUpperCase() == retrievedObject.userName.toUpperCase()) {
            alert('username is matching');
            _credUser = true
        }
        else {
            alert('invalid username')
        }

        if (_password == retrievedObject.password) {
            alert('password is matching')
            _credPass = true
        }
        else {
            alert('invalid password')
        }
        if (_credUser && _credPass) {
            alert('cred is valid');
        }
        else {
            alert('invalid cred');
        }
    })
})