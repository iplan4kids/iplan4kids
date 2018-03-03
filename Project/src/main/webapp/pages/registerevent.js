$(function() {

    // We can attach the `fileselect` event to all file inputs on the page
    $(document).on('change', ':file', function() {
        var input = $(this),
            numFiles = input.get(0).files ? input.get(0).files.length : 1,
            label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
        input.trigger('fileselect', [numFiles, label]);
    });

    // We can watch for our custom `fileselect` event like this
    $(document).ready(function() {
        $(':file').on('fileselect', function(event, numFiles, label) {

            var input = $(this).parents('.input-group').find(':text'),
                log = numFiles > 1 ? numFiles + ' files selected' : label;

            if( input.length ) {
                input.val(log);
            } else {
                if( log ) alert(log);
            }

        });
    });

});


/*----------------------- TODAY----------------------*/

var today = new Date();
var dd = today.getDate();
var mm = today.getMonth()+1; //January is 0!
var yyyy = today.getFullYear();

if(dd<10) {
    dd = '0'+dd
}

if(mm<10) {
    mm = '0'+mm
}

today = yyyy + '-' + mm + '-' + dd;



/*----------------------- SET MIN DATE----------------------*/


var date = new Date();
date.setDate(date.getDate() + 7);



var dd = date.getDate();
var mm = date.getMonth()+1; //January is 0!
var yyyy = date.getFullYear();

if(dd<10) {
    dd = '0'+dd
}

if(mm<10) {
    mm = '0'+mm
}


var dateMsg = yyyy+'-'+ mm +'-'+dd;

document.getElementById('helpdate').innerHTML= "*Επιτρέπονται ημερομηνίες από την: "+dateMsg +" και έπειτα.";

var element = document.getElementById("checkdate");
element.setAttribute("min",dateMsg);


/*------------------------------------ GOOGLE API --------------------------------------------*/



// This example displays an address form, using the autocomplete feature
// of the Google Places API to help users fill in the information.

// This example requires the Places library. Include the libraries=places
// parameter when you first load the API. For example:
 //<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyClySXxDsUN8wEcC0J6xS3TWftKdER07rA&libraries=places">

var placeSearch, autocomplete;
var componentForm = {
    street_number: 'short_name',
    route: 'long_name',
    locality: 'long_name',
    //administrative_area_level_1: 'short_name',
   // country: 'long_name',
    postal_code: 'short_name'
};

function initAutocomplete() {
    // Create the autocomplete object, restricting the search to geographical
    // location types.
    autocomplete = new google.maps.places.Autocomplete(
        /** @type {!HTMLInputElement} */(document.getElementById('autocomplete')),
        {types: ['geocode']});
    autocomplete.setComponentRestrictions({'country': 'gr'});
    // When the user selects an address from the dropdown, populate the address
    // fields in the form.
    autocomplete.addListener('place_changed', fillInAddress);
}

function fillInAddress() {
    // Get the place details from the autocomplete object.
    var place = autocomplete.getPlace() ;


    document.getElementById('locality').value = "";
    document.getElementById('route').value = "";
    document.getElementById('street_number').value = "" ;
    document.getElementById('postal_code').value = "" ;


    var location = place.geometry.location;
    var lang = location.lng();
    var lat = location.lat();

    document.getElementById('lat').value = lat;
    document.getElementById('lng').value = lang;

    /* for (var component in componentForm) {
         document.getElementById(component).value = '';
         document.getElementById(component).disabled = false;
     }
     */




    // Get each component of the address from the place details
    // and fill the corresponding field on the form.
    for (var i = 0; i < place.address_components.length; i++) {
        var addressType = place.address_components[i].types[0];

        if (componentForm[addressType]) {

            var val = place.address_components[i][componentForm[addressType]];

            document.getElementById(addressType).value = val;
        }
    }
    $("#geowrong").empty();
    var geoDiv = $("#geowrong");
    var msgwrong = "";
    if (!$("#locality").val()){
        msgwrong += " Πόλη <br>";
    }
    if (!$("#route").val()){
        msgwrong += " Οδό <br>";
    }
    if (!$("#street_number").val() ){
        msgwrong += " Αριθμό οδού <br>";
    }
    if (msgwrong !="" ){
        msgwrong = "*Πρέπει να συμπεριλάβετε τα εξής: <br>"+msgwrong;
        geoDiv.html(msgwrong);

    }
    var codeb = $("#postal_code").val() ;
    var codea = codeb.replace(/\s/g, "");
    $("#postal_code").val(codea) ;
}

/*
function showValues() {
    var str = $( "#register1-form" ).serialize();
    $( "#results" ).text( str );
}
*/


$( "#sports-checkbox" ).change(setCategories );
$( "#music-checkbox" ).change(setCategories );
$( "#theatre-checkbox" ).change(setCategories );
$( "#workshop-checkbox" ).change(setCategories );
$( "#other-checkbox" ).change(setCategories );

//showValues();


function setCategories() {
    if($('#sports-checkbox').is(':checked') == true){
        $('#sports').val('1');
    }
    else{
        $('#sports').val('0');;
    }
    if($('#theatre-checkbox').is(':checked') == true){
        $('#theatre').val('1');
    }
    else{
        $('#theatre').val('0');
    }
    if($('#music-checkbox').is(':checked') == true){
        $('#music').val('1');
    }
    else{
        $('#music').val('0');;
    }
    if($('#workshop-checkbox').is(':checked') == true){
        $('#workshop').val('1');
    }
    else{
        $('#workshop').val('0');;
    }
    if($('#other-checkbox').is(':checked') == true){
        $('#other').val('1');
    }
    else{
        $('#other').val('0');;
    }

}




// Bias the autocomplete object to the user's geographical location,
// as supplied by the browser's 'navigator.geolocation' object.
/*function geolocate() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(function(position) {
            var geolocation = {
                lat: position.coords.latitude,
                lng: position.coords.longitude
            };
            var circle = new google.maps.Circle({
                center: geolocation,
                radius: position.coords.accuracy
            });
            autocomplete.setBounds(circle.getBounds());
        });
    }
}
*/

var timepicker = new TimePicker('time', {
    lang: 'en',
    theme: 'dark'
});
timepicker.on('change', function(evt) {

    var value = (evt.hour || '00') + ':' + (evt.minute || '00');
    evt.element.value = value;

});