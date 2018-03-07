// min and max prices for slider 
var minPrice;
var maxPrice;

//mock json variable
var mockEvents = [{
    "id": 1,
    "name": "Θεατρο 1",
    "image": "../images/ourCompany_image.jpg",
    "date": "16/2/2018",
    "description": "σαδφασδφασ α αδσ φασδφ ασδ φασδφ ασδφ σδφ ασδφ ασδφασφρ ασςφ ασγασ γασγφσγσ γα σδασ δδσ σδφασδ φσ",
    "price": "19.5",
    "longtitude": "",
    "langtitude": ""
    }, {
    "id": 2,
    "name": "Θεατρο 2",
    "image": "../images/ourCompany_image.jpg",
    "date": "17/2/2018",
    "description": "σαδφασδφασ α αδσ φασδφ ασδ φασδφ ασδφ σδφ ασδφ ασδφασφρ ασςφ ασγασ γασγφσγσ γα σδασ δδσ σδφασδ φσ",
    "price": "21",
    "longtitude": "",
    "langtitude": ""
    }, {
    "id": 3,
    "name": "Θεατρο 3",
    "image": "images/ourCompany_image.jpg",
    "date": "18/2/2018",
    "description": "σαδφασδφασ α αδσ φασδφ ασδ φασδφ ασδφ σδφ ασδφ ασδφασφρ ασςφ ασγασ γασγφσγσ γα σδασ δδσ σδφασδ φσ",
    "price": "22",
    "longtitude": "",
    "langtitude": ""
    }, {
    "id": 4,
    "name": "Θεατρο 4",
    "image": "images/ourCompany_image.jpg",
    "date": "19/2/2018",
    "description": "σαδφασδφασ α αδσ φασδφ ασδ φασδφ ασδφ σδφ ασδφ ασδφασφρ ασςφ ασγασ γασγφσγσ γα σδασ δδσ σδφασδ φσ",
    "price": "23",
    "longtitude": "",
    "langtitude": ""
    }, {
    "id": 5,
    "name": "Θεατρο 5",
    "image": "images/ourCompany_image.jpg",
    "date": "20/2/2018",
    "description": "σαδφασδφασ α αδσ φασδφ ασδ φασδφ ασδφ σδφ ασδφ ασδφασφρ ασςφ ασγασ γασγφσγσ γα σδασ δδσ σδφασδ φσ",
    "price": "24",
    "longtitude": "",
    "langtitude": ""
    }, {
    "id": 6,
    "name": "Θεατρο 6",
    "image": "images/ourCompany_image.jpg",
    "date": "21/2/2018",
    "description": "σαδφασδφασ α αδσ φασδφ ασδ φασδφ ασδφ σδφ ασδφ ασδφασφρ ασςφ ασγασ γασγφσγσ γα σδασ δδσ σδφασδ φσ",
    "price": "149.5",
    "longtitude": "",
    "langtitude": ""
    }];

// event card template
var templateTest= '<div class="col-sm-4">' +
                    '<div class="panel eventCard">' +
                        '<a id="eventLink" href="/app/events/event/%EVENT_ID%"><h4 align="center" style="font-weight:bold" class="eventTitle">%EVENT_TITLE%</h4></a>' +
                        '<div class="panel-thumbnail eventImage"><a href="/app/events/event/%EVENT_ID_IM%"><img src="%EVENT_IMAGE%" class="img-responsive img-rounded"></a></div>' +
                        '<div class="panel-body eventDescription">' +
                           /* '<div class="eventDate">' +
                                '%EVENT_DATE%' +
                            '</div>' +*/
                            ' <div class="eventDate">' +
                                '%EVENT_TIME%' +
                            '</div>' +
                            '<div style="font-weight:bold; color:#333; margin-bottom:5px;">%EVENT_DATE% <br><br> Περιγραφή:</div>' +
                            '<div class="eventDescription">' +
                            '%EVENT_DESCRIPTION%' +
                            '</div>' +
                        '</div>' +
                        '<div class="panel-body eventPrice">' +
                            'Τιμή:%EVENT_PRICE%' +
                            '<span class="glyphicon glyphicon-eur"></span>' +
                            '<button class="btn submitButton pull-right" type="submit">Αγορά</button>' +
                        '</div>' +
                    '</div>' +
                '</div>';

$(document).ready(function() {
// -------------------------------------- EVENT CARD ------------------------------------------------------------

// https://github.com/uxitten/polyfill/blob/master/string.polyfill.js
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/padEnd
    if (!String.prototype.padEnd) {
        String.prototype.padEnd = function padEnd(targetLength,padString) {
            targetLength = targetLength>>0; //floor if number or convert non-number to 0;
            padString = String((typeof padString !== 'undefined' ? padString : ' '));
            if (this.length > targetLength) {
                return String(this);
            }
            else {
                targetLength = targetLength-this.length;
                if (targetLength > padString.length) {
                    padString += padString.repeat(targetLength/padString.length); //append to original to ensure we are longer than needed
                }
                return String(this) + padString.slice(0,targetLength);
            }
        };
    }

    //console.log($('#srch-term').val());
    $.ajax({
        url: "/app/events/getEvents", // url where to submit the request
        type : "POST", // type of action POST || GET
        dataType : 'json', // data type
        //contentType : 'json',
        data : $('#srch-term').serialize(), // post data || get data
        success : function(result) {
            // you can see the result from the console
            // tab of the developer tools
            if(result.length != 0) {
                var parentDiv = $('#allEvents');
                for (var i = 0; i < result.length; i++) {
                    //console.log(result[i]['price']);
                    var date = new Date(result[i]['date']);
                    var dd = date.getDate();
                    var mm = date.getMonth();
                    var yyyy = date.getFullYear();
                    var hh = date.getHours();
                    var mi = date.getMinutes();
                    if (dd<10){
                        dd = '0' + dd;
                    }
                    if (mm<10){
                        mm = '0' +mm;
                    }
                    if (hh<10){
                        hh = '0' + hh;
                    }
                    if (mi<10){
                        mi = '0' + mi;
                    }
                    var eventDate = dd + "/" + mm + "/" + yyyy;
                    var eventTime = hh + ":" + mi;
                    var ds = result[i]['description'];
                    if (ds.length> 33){
                        ds = ds.substring(0,30)+"...";
                    }
                    else{
                       ds = ds.padEnd(33);
                    }
                    console.log(result[i]['images']);
                    var divContent = templateTest.replace('%EVENT_TITLE%', result[i]['title'])
                        .replace('%EVENT_IMAGE%', result[i]['images'])
                        .replace('%EVENT_DATE%', eventDate)
                        .replace('%EVENT_DESCRIPTION%',ds )
                        .replace('%EVENT_PRICE%', result[i]['price'])
                        .replace('%EVENT_TIME%',eventTime )
                        .replace('%EVENT_ID%',result[i]['event_id'] )
                        .replace('%EVENT_ID_IM%',result[i]['event_id'] );

                    parentDiv.append(divContent);
                }
            }
        },
        error: function(xhr, resp, text) {
            alert("AJAX FAILED");
        }
    })


    /*var parentDiv = $('#allEvents');
    for (var i = 0; i < mockEvents.length; i++)
    {
        console.log(mockEvents[i]['price']);
        var divContent = templateTest.replace('%EVENT_TITLE%', mockEvents[i]['name'])
                                .replace('%EVENT_IMAGE%', mockEvents[i]['image'])  
                                .replace('%EVENT_DATE%', mockEvents[i]['date']) 
                                .replace('%EVENT_DESCRIPTION%', mockEvents[i]['description'])
                                .replace('%EVENT_PRICE%', mockEvents[i]['price']);

        parentDiv.append(divContent);
    }*/

});

$( function() {
    
    $( "#slider-range" ).slider({
      range: true,
      min: 0,
      max: 150,
      values: [0, 150],
      step:1,
      slide: function( event, ui ) {
        $( "#amount" ).val( "€" + ui.values[ 0 ] + " - €" + ui.values[ 1 ] );
      }
    });
    $( "#amount" ).val( "Εύρος Τιμών: €" + $( "#slider-range" ).slider( "values", 0 ) +
      " - €" + $( "#slider-range" ).slider( "values", 1 ) );
    } 

);




function applyFilters(){

    var succesful = function (position) {
        geoloc = {
            longitude: position.coords.longitude,
            latitude: position.coords.latitude
        };

    };


    var parentDiv = $('#allEvents');

    var filterDate = $("#filterdate").val();
    var sliderMin = $("#slider-range").slider("values") [0];
    var sliderMax = $("#slider-range").slider("values") [1];
    var selectedCategories = [];
    var lng,lat;
    var findAddress;

    if($('#category1').is(':checked') == true){
        selectedCategories.push($('#category1').val());
    }
    if($('#category2').is(':checked') == true){
        selectedCategories.push($('#category2').val());
    }
    if($('#category3').is(':checked') == true){
        selectedCategories.push($('#category3').val());
    }
    if($('#category4').is(':checked') == true){
        selectedCategories.push($('#category4').val());
    }
    if($('#category5').is(':checked') == true){
        selectedCategories.push($('#category5').val());
    }

    if($('#myLocation').is(':checked') == true){
        findAddress = 0;
    }
    if($('#currentLocation').is(':checked') == true){
        findAddress = 1;
        var getLocation = function(callback){
            navigator.geolocation.getCurrentPosition(function(pos){
                succesful(pos);
                typeof callback === 'function' && callback(geoloc);
            }, function(){
                alert("fail");
            });
        };
        getLocation(function(pos){
            console.log(pos.longitude, pos.latitude);
            lng = pos.longitude;
            lat = pos.latitude;
            var filtersJSON = {
                "categories":selectedCategories,
                "min":sliderMin,
                "max":sliderMax,
                "date":filterDate,
                "lng":lng,
                "lat":lat,
                "findAddr":findAddress
            }


            console.log(filtersJSON);
        });
    }




}


$(function() {
    $('#login1-form-link').click(function(e) {
        $("#login1-form").delay(100).fadeIn(100);
        $("#login-form").fadeOut(100);
        $("#login2-form").fadeOut(100);
        $('#login-form-link').removeClass('active');
        $('#login2-form-link').removeClass('active');
        $(this).addClass('active');
        e.preventDefault();
    });
    $('#login2-form-link').click(function(e) {
        $("#login2-form").delay(100).fadeIn(100);
        $("#login1-form").fadeOut(100);
        $("#login-form").fadeOut(100);
        $('#login-form-link').removeClass('active');
        $('#login1-form-link').removeClass('active');
        $(this).addClass('active');
        e.preventDefault();
    });
    $('#login-form-link').click(function(e) {
        $("#login-form").delay(100).fadeIn(100);
        $("#login1-form").fadeOut(100);
        $("#login2-form").fadeOut(100);
        $('#login1-form-link').removeClass('active');
        $('#login2-form-link').removeClass('active');
        $(this).addClass('active');
        e.preventDefault();
    });
});




