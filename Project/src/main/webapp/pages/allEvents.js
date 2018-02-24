// min and max prices for slider 
var minPrice = Number.POSITIVE_INFINITY;
var maxPrice = Number.NEGATIVE_INFINITY;

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
                            '<div class="eventDate">' +
                                '%EVENT_DATE%' +
                            '</div>' +
                            '<div style="font-weight:bold; color:#333; margin-bottom:5px;">Περιγραφή</div>' +
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
 

    var parentDiv = $('#allEvents');
    for (var i = 0; i < mockEvents.length; i++)
    {
        console.log(mockEvents[i]['price']);
        var divContent = templateTest.replace('%EVENT_TITLE%', mockEvents[i]['name'])
                                .replace('%EVENT_IMAGE%', mockEvents[i]['image'])  
                                .replace('%EVENT_DATE%', mockEvents[i]['date']) 
                                .replace('%EVENT_DESCRIPTION%', mockEvents[i]['description'])
                                .replace('%EVENT_PRICE%', mockEvents[i]['price']);
        

        // Finding min and max prices to limit the slider range between those
        if( parseFloat(mockEvents[i]['price']) < minPrice ){
            minPrice = parseFloat(mockEvents[i]['price']);
        }

        if( parseFloat(mockEvents[i]['price']) > maxPrice ){
            maxPrice = parseFloat(mockEvents[i]['price']);
        }
        console.log(maxPrice, minPrice);
        parentDiv.append(divContent);
    }

});

$( function() {
    
    $( "#slider-range" ).slider({
      range: true,
      min: Math.floor(minPrice),
      max: Math.ceil(maxPrice),
      values: [Math.floor(minPrice), Math.ceil(maxPrice)],
      step:1,
      slide: function( event, ui ) {
        $( "#amount" ).val( "€" + ui.values[ 0 ] + " - €" + ui.values[ 1 ] );
      }
    });
    $( "#amount" ).val( "€" + $( "#slider-range" ).slider( "values", 0 ) +
      " - €" + $( "#slider-range" ).slider( "values", 1 ) );
    } 

);

function myFunction(){
    $("#allEvents").empty();

    var parentDiv = $('#allEvents');
    for (var i = 0; i < mockEvents.length; i++)
    {
        var divContent = templateTest.replace('%EVENT_TITLE%', mockEvents[i]['name'])
                                .replace('%EVENT_IMAGE%', mockEvents[i]['image'])  
                                .replace('%EVENT_DATE%', mockEvents[i]['date']) 
                                .replace('%EVENT_DESCRIPTION%', mockEvents[i]['description'])
                                .replace('%EVENT_PRICE%', mockEvents[i]['price']);
        
        if((mockEvents[i]['price'] >= $("#slider-range").slider("values") [0]) && (mockEvents[i]['price'] <= $("#slider-range").slider("values") [1])){
            console.log("hellos");
            parentDiv.append(divContent);
        }
    }
}
