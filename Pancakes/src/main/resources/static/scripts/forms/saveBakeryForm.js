
document.addEventListener("DOMContentLoaded", function submitCreationForm() {
    var form =  document.getElementById("addNewBakeryForm");
   form.addEventListener("submit", function (event) {
       // event.preventDefault();
        var formData = new FormData(form);
        var name = document.getElementById("name").value;
        var description = document.getElementById("description").value;
        var price = document.getElementById("price").value;

        let bakery = {
            "name" : name,
            "description" : description,
            "price" : price
        }

        $.ajax({
            type: 'POST',
            url: "/pancakes/bakery/save",
            contentType: 'application/json',
            data: JSON.stringify(bakery),
            // success: function (response) {
            //     alert("success");
            // }
        });
    })
})