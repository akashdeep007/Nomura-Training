$(document).ready(function () {
    loadTable();
});


var loadTable = () => {
    var users = localStorage.getItem('users');
    users = JSON.parse(users);
    var loggedInUser = localStorage.getItem('loggedinuser');
    loggedInUser = JSON.parse(loggedInUser);
    var tableBody = document.getElementById("tablebody");
    users.forEach(user => {
        var tablerow = document.createElement("tr");
        var id = document.createElement("td");
        id.innerHTML = user.id;
        tablerow.setAttribute("id", user.id);
        tablerow.append(id);
        var image_name_td = document.createElement("td");
        var image = document.createElement("img");
        image.src = user.avatar;
        image.classList.add("img-fluid", "avatar");
        image_name_td.append(image);
        var fullname = user.first_name + " " + user.last_name;
        image_name_td.append(fullname);
        tablerow.append(image_name_td);
        var email = document.createElement("td");
        email.innerHTML = user.email;
        tablerow.append(email);
        var statusElement = document.createElement("td");
        if (user.email == loggedInUser) {
            statusElement.innerHTML = '<span class="status text-success">&bull;</span>Active';
        }
        else {
            statusElement.innerHTML = '<span class="status text-warning">&bull;</span>Inactive';
        }
        tablerow.append(statusElement);
        var buttons = document.createElement("td");
        buttons.innerHTML = '<a href="#" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE5C9;</i></a>'
        if (user.email != loggedInUser) {
            buttons.onclick = function () {
                deleteRow(user.id)
            }
        }
        tablerow.append(buttons);
        tableBody.append(tablerow);
    });
};

var deleteRow = (id) => {
    document.getElementById(id).remove();
}

