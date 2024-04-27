
document.addEventListener("DOMContentLoaded", function submitCreationForm() {
    var form =  document.getElementById("addNewPancakeForm");
    form.addEventListener("submit", function (event) {
        // event.preventDefault();
        var formData = new FormData(form);
        var name = document.getElementById("name").value;
        var description = document.getElementById("description").value;
        var price = document.getElementById("price").value;

        let pancake = {
            "name" : name,
            "description" : description,
            "price" : price
        }

        $.ajax({
            type: 'POST',
            url: "/pancakes/pancake/save",
            contentType: 'application/json',
            data: JSON.stringify(pancake),
            // success: function (response) {
            //     alert("success");
            // }
        });
    })
})