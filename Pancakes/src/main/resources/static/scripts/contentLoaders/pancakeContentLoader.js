document.addEventListener("DOMContentLoaded", function () {
    $.get("pancakes/pancake/getAll", function (data) {
        data.forEach(function (pancake) {
            var commentHtml = '<div class="item">' +
                '<span>' + pancake.name + '</span>' +
                '<p></p>' +
                '<div class = wrapper>' +
                '<img id="pancake" src="/images/red-velvet.svg" alt="pancake"/>' +
                '</div>' +
                '<span>Цена:' + pancake.price + '</span>'
            $('.items').append(commentHtml);
        });
    })
});