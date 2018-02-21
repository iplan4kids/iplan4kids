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

today = yyyy + '-' + mm + '-' + yyyy;



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

