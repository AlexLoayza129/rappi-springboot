$('body', () => {
    let url = "http://localhost:8082/api/usuarios";
    var body = $('#usuarios');

    $.ajax({
        type: "GET",
        url: url,
        dataType: "json",
        success: function (response) {
            response.forEach((element, index) => {
                var row = document.createElement('tr');
                const arrayOfValues = Object.values(element);

                for(let i = 0; i < arrayOfValues.length; i++){
                    var column = document.createElement('td');
                    column.innerText = arrayOfValues[i]
                    row.append(column);
                }

                body.append(row);
            });
        }
    });
})