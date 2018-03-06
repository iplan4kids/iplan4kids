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
                        '<h4 align="center" style="font-weight:bold" class="eventTitle">%EVENT_TITLE%</h2>' +
                        '<div class="panel-thumbnail eventImage"><img src="%EVENT_IMAGE%" class="img-responsive img-rounded"></div>' +
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


    $.ajax({
        url: "/app/events/getEvents", // url where to submit the request
        type : "POST", // type of action POST || GET
        dataType : 'json', // data type
        contentType : 'json',
        data : {"filters":0}, // post data || get data
        success : function(result) {
            // you can see the result from the console
            // tab of the developer tools
            if(result.length != 0) {
                var parentDiv = $('#allEvents');
                for (var i = 0; i < result.length; i++) {
                    console.log(result[i]['price']);
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
                    var eventDate = dd + "/" + mm + "/" + yyyy;
                    var eventTime = hh + ":" + mi;
                    var ds = result[i]['description'];
                    if (ds.length> 33){
                        ds = ds.substring(0,30)+"...";
                    }
                    else{
                       // ds = ds.padEnd(33);
                    }
                    var divContent = templateTest.replace('%EVENT_TITLE%', result[i]['title'])
                        .replace('%EVENT_IMAGE%', result[i]['images'])
                        .replace('%EVENT_DATE%', eventDate)
                        .replace('%EVENT_DESCRIPTION%',ds )
                        .replace('%EVENT_PRICE%', result[i]['price'])
                        .replace('%EVENT_TIME%',eventTime );

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

