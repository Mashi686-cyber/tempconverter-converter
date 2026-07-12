function convertTemperature() {

    const value = document.getElementById("value").value;
    const unit = document.getElementById("unit").value;


    fetch(
        `http://localhost:8081/api/temperatures/convert?value=${value}&unit=${unit}`,
        {
            method: "POST",
            headers: {
                "X-API-KEY": "SUPER-SECRET-DEV-KEY-123"
            }
        }
    )

    .then(response => response.json())

    .then(data => {

        document.getElementById("result").innerHTML =
            data.inputValue + " " +
            data.inputUnit +
            " = " +
            data.convertedValue + " " +
            data.convertedUnit +
            "<br>" +
            data.warning;

    })

    .catch(error => {

        document.getElementById("result").innerHTML =
            "API Connection Error";

        console.log(error);

    });

}




function getHistory() {


    fetch(
        "http://localhost:8081/api/temperatures/history",
        {
            headers: {
                "X-API-KEY": "SUPER-SECRET-DEV-KEY-123"
            }
        }
    )


    .then(response => response.json())


    .then(data => {


        let output = "";


        data.forEach(item => {


            output +=

            "<p>" +
            item.inputValue + " " +
            item.inputUnit +
            " = " +
            item.convertedValue + " " +
            item.convertedUnit +
            "<br>" +
            item.warning +
            "</p>";

        });


        document.getElementById("history").innerHTML =
        output;


    })


    .catch(error => {

        document.getElementById("history").innerHTML =
        "Cannot load history";

        console.log(error);

    });


}




function checkWarning() {


    const value =
    document.getElementById("value").value;


    const unit =
    document.getElementById("unit").value;



    fetch(
        `http://localhost:8081/api/temperatures/warning-check?value=${value}&unit=${unit}`,
        {
            headers: {
                "X-API-KEY": "SUPER-SECRET-DEV-KEY-123"
            }
        }
    )


    .then(response => response.text())


    .then(data => {

        document.getElementById("result").innerHTML =
        data;

    })


    .catch(error => {

        document.getElementById("result").innerHTML =
        "Warning check error";

        console.log(error);

    });


}





function clearHistory() {


    fetch(
        "http://localhost:8081/api/temperatures/history",
        {
            method: "DELETE",
            headers: {
                "X-API-KEY": "SUPER-SECRET-DEV-KEY-123"
            }
        }
    )


    .then(response => {


        if(response.ok) {

            document.getElementById("history").innerHTML = "";

            alert("History cleared successfully");

        }

        else {

            alert("Failed to clear history");

        }

    })


    .catch(error => {

        alert("API Connection Error");

        console.log(error);

    });


}