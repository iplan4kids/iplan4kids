var select = "#register1-form";
var autoselect = "autocomplete";


//---------------------------------------- REGISTER FORM -------------------------------------------



    $(function() {
    $('#register1-form-link').click(function(e) {
        $("#register1-form").delay(100).fadeIn(100);
        $("#register-form").fadeOut(100);
        $("#register2-form").fadeOut(100);
        $('#register-form-link').removeClass('active');
        $('#register2-form-link').removeClass('active');
        select = "#register1-form";
        $(this).addClass('active');                         // HTAN PRIN STO SCRIPTS
        e.preventDefault();
    });
    $('#register-form-link').click(function(e) {
        $("#register-form").delay(100).fadeIn(100);
        $("#register1-form").fadeOut(100);
        $("#register2-form").fadeOut(100);
        $('#register1-form-link').removeClass('active');
        $('#register2-form-link').removeClass('active');
        select = "#register-form";
        $(this).addClass('active');
        e.preventDefault();
    });
});

var check = function() {
  if (document.getElementById('password').value == "" || document.getElementById('confirm_password').value == ""){
    
    document.getElementById('password').style.border = '1px solid #ddd';
    document.getElementById('password').style.backgroundColor = "white";
    document.getElementById('confirm_password').style.border = '1px solid #ddd';
    document.getElementById('confirm_password').style.backgroundColor = "white";
    document.getElementById('register1-submit').disabled = false;
  }
  else if (document.getElementById('password').value ==
    document.getElementById('confirm_password').value) {
    document.getElementById('password').style.border = '1px solid #ddd';
    document.getElementById('password').style.backgroundColor = "white";
    document.getElementById('confirm_password').style.border = '1px solid #ddd';
    document.getElementById('confirm_password').style.backgroundColor = "white";
    document.getElementById('register1-submit').disabled = false;
    //document.getElementById('message').innerHTML = 'matching';
  } else {
    document.getElementById('password').style.borderBottom = "3px solid red";
    document.getElementById('password').style.backgroundColor = "lightgrey";
    document.getElementById('confirm_password').style.borderBottom = "3px solid red";
    document.getElementById('confirm_password').style.backgroundColor = "lightgrey";
    document.getElementById('register1-submit').disabled = true;
    //document.getElementById('message').innerHTML = 'not matching';
  }
}

var check1 = function() {
  if (document.getElementById('password1').value == "" || document.getElementById('confirm_password1').value == ""){
    
    document.getElementById('password1').style.border = '1px solid #ddd';
    document.getElementById('password1').style.backgroundColor = "white";
    document.getElementById('confirm_password1').style.border = '1px solid #ddd';
    document.getElementById('confirm_password1').style.backgroundColor = "white";
    document.getElementById('register-submit').disabled = false;
  }
  else if (document.getElementById('password1').value ==
    document.getElementById('confirm_password1').value) {
    document.getElementById('password1').style.border = '1px solid #ddd';
    document.getElementById('password1').style.backgroundColor = "white";
    document.getElementById('confirm_password1').style.border = '1px solid #ddd';
    document.getElementById('confirm_password1').style.backgroundColor = "white";
    document.getElementById('register-submit').disabled = false;
    //document.getElementById('message').innerHTML = 'matching';
  } else {
    document.getElementById('password1').style.borderBottom = "3px solid red";
    document.getElementById('password1').style.backgroundColor = "lightgrey";
    document.getElementById('confirm_password1').style.borderBottom = "3px solid red";
    document.getElementById('confirm_password1').style.backgroundColor = "lightgrey";
    document.getElementById('register-submit').disabled = true;
    //document.getElementById('message').innerHTML = 'not matching';
  }
}


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
    autocomplete2 = new google.maps.places.Autocomplete(
        /** @type {!HTMLInputElement} */(document.getElementById('autocomplete2')),
        {types: ['geocode']});
    autocomplete2.setComponentRestrictions({'country': 'gr'});
    // When the user selects an address from the dropdown, populate the address
    // fields in the form.
    autocomplete2.addListener('place_changed', fillInAddress);


}

function fillInAddress() {
  alert(select);
    // Get the place details from the autocomplete object.
    if (select == "#register1-form") {
        var place = autocomplete.getPlace();
    }
    else{
        var place = autocomplete2.getPlace();
    }
    $(select).find("#locality").val('');
    $(select).find("#street_number").val('');
    $(select).find("#route").val('');
    $(select).find("#postal_code").val('');
    //document.getElementById('locality').value = "";
    //document.getElementById('route').value = "";
    //document.getElementById('street_number').value = "" ;
    //document.getElementById('postal_code').value = "" ;


    var location = place.geometry.location;
    var lang = location.lng();
    var lat = location.lat();

    $(select).find("#lat").val(lat);
    $(select).find("#lng").val(lang);
    //document.getElementById('lat').value = lat;
    //document.getElementById('lng').value = lang;

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
            $(select).find("#"+addressType).val(val);
            //document.getElementById(addressType).value = val;
        }
    }
    if (select == "#register1-form") {
        $("#geowrong").empty();
        var geoDiv = $("#geowrong");
        var msgwrong = "";
        if (!$(select).find("#locality").val()) {
            msgwrong += " Πόλη <br>";
        }
        if (!$(select).find("#route").val()) {
            msgwrong += " Οδό <br>";
        }
        if (!$(select).find("#street_number").val()) {
            msgwrong += " Αριθμό οδού <br>";
        }
        if (msgwrong != "") {
            msgwrong = "*Πρέπει να συμπεριλάβετε τα εξής: <br>" + msgwrong;
            geoDiv.html(msgwrong);

        }
        var codeb = $(select).find("#postal_code").val();
        var codea = codeb.replace(/\s/g, "");
        $(select).find("#postal_code").val(codea);
    }
    else{
        $("#geowrong2").empty();
        var geoDiv = $("#geowrong2");
        var msgwrong = "";
        if (!$(select).find("#locality").val()) {
            msgwrong += " Πόλη <br>";
        }
        if (!$(select).find("#route").val()) {
            msgwrong += " Οδό <br>";
        }
        if (!$(select).find("#street_number").val()) {
            msgwrong += " Αριθμό οδού <br>";
        }
        if (msgwrong != "") {
            msgwrong = "*Πρέπει να συμπεριλάβετε τα εξής: <br>" + msgwrong;
            geoDiv.html(msgwrong);

        }
        var codeb = $(select).find("#postal_code").val();
        var codea = codeb.replace(/\s/g, "");
        $(select).find("#postal_code").val(codea);
    }
}

