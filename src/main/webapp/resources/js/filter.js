var phoneData;
var filteredData;

$(document).ready(function() {

    $(".search").keyup(function () {
        populateTable(searchData(phoneData, $('.search').val()));
    });

    fetchNewData(populateTable);
});

function fetchNewData(callbackFunction) {

    $.ajax({
        url: '/phonebook/api',
        async: true,
        success: function(response) {
            phoneData = response;
            filteredData = phoneData;

            typeof callbackFunction === 'function' && callbackFunction(filteredData);
        },
        error: function(){
            alert('could not fetch data');
        }
    });
}

function populateTable(data) {

    $('tbody').html('');

    $.each(data, function(i, element) {

        $('<tr>').append(
            $('<td>').text(element.name),
            $('<td>').text(element.phone_number),
            $('<td>').text(element.address)
        ).appendTo('tbody');
    });
}

function searchData(data, searchTerm) {

    var filteredData = data.filter(function(element) {

        return element['name'].toLowerCase().indexOf(searchTerm.toLowerCase()) !== -1
            || element['phone_number'].indexOf(searchTerm) !== -1
            || element['address'].toLowerCase().indexOf(searchTerm.toLowerCase()) !== -1;
    }); 

    return filteredData;
}