// !!! BELOW CODE WILL RUN ONCE THE PAGE IS READY FOR JAVASCRIPT CODE TO EXECUTE
$(document).ready(function() {

    //---------------------------------------- REGISTER FORM -------------------------------------------
    $(function() {    
        $('#register1-form-link').click(function(e) {
            $("#register1-form").delay(100).fadeIn(100);
            $("#register-form").fadeOut(100);
            $('#register-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
        $('#register-form-link').click(function(e) {
            $("#register-form").delay(100).fadeIn(100);
            $("#register1-form").fadeOut(100);
            $('#register1-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
    });

    // ---------------------------------- STICKY NAVIGATION BAR ----------------------------------------
    // grab the initial top offset of the navigation 
   	var stickyNavTop = $('.navbar').offset().top;
   	
   	// our function that decides weather the navigation bar should have "fixed" css position or not.
   	var stickyNav = function(){
	    var scrollTop = $(window).scrollTop(); // our current vertical position from the top
	         
	    // if we've scrolled more than the navigation, change its position to fixed to stick to top,
	    // otherwise change it back to relative
	    if (scrollTop > stickyNavTop) {
            $('.navbar').addClass('fixed-header');
	    } else {
            $('.navbar').removeClass('fixed-header');
	    }
	};

	stickyNav();
	// and run it again every time you scroll
	$(window).scroll(function() {
		stickyNav();
    });
    
    //------------------------------------------ TOOLTIP ------------------------------------------------
    $('[data-toggle="tooltip"]').tooltip();
	
	
	
	
	//------------------------------------------ ADMIN STUFF ABOUT USERS-PROVIDERS ------------------------------------------------
	
	   var mock_data_1 = [{
      "id": 1,
      "name": "Lorens",
      "username": "lbligh0",
      "email": "lhosburn0@msu.edu",
      "phone": "442-431-1318"
      }, {
      "id": 2,
      "name": "Mira",
      "username": "mhiley1",
      "email": "mgirardetti1@edublogs.org",
      "phone": "793-572-0484"
      }, {
      "id": 3,
      "name": "Seana",
      "username": "sackerman2",
      "email": "sbeamish2@acquirethisname.com",
      "phone": "639-100-8436"
      }, {
      "id": 4,
      "name": "Christy",
      "username": "cdoick3",
      "email": "cspellsworth3@bloglovin.com",
      "phone": "298-103-8921"
      }, {
      "id": 5,
      "name": "Rowland",
      "username": "ryaldren4",
      "email": "rskittle4@psu.edu",
      "phone": "187-897-9851"
      }, {
      "id": 6,
      "name": "Zahara",
      "username": "zside5",
      "email": "zgoodisson5@webnode.com",
      "phone": "250-827-5390"
      }, {
      "id": 7,
      "name": "Alexandra",
      "username": "aoldacres6",
      "email": "apoad6@uiuc.edu",
      "phone": "958-143-9517"
      }, {
      "id": 8,
      "name": "Robena",
      "username": "rtennet7",
      "email": "rhawkin7@cloudflare.com",
      "phone": "924-697-1846"
      }, {
      "id": 9,
      "name": "Raffaello",
      "username": "rrucklidge8",
      "email": "rdaffey8@noaa.gov",
      "phone": "861-538-3194"
      }, {
      "id": 10,
      "name": "Alane",
      "username": "abaudinet9",
      "email": "adoddrell9@ifeng.com",
      "phone": "735-727-9892"
      }, {
      "id": 11,
      "name": "Levi",
      "username": "lmaffettia",
      "email": "lpeschmanna@senate.gov",
      "phone": "635-758-8720"
      }, {
      "id": 12,
      "name": "Haze",
      "username": "hamdohrb",
      "email": "hyeomanb@cmu.edu",
      "phone": "426-931-1891"
      }, {
      "id": 13,
      "name": "Bernardine",
      "username": "bmaylerc",
      "email": "bshealc@hexun.com",
      "phone": "389-804-8090"
      }, {
      "id": 14,
      "name": "Derwin",
      "username": "dsquierd",
      "email": "diliffed@uol.com.br",
      "phone": "729-469-5926"
      }, {
      "id": 15,
      "name": "Anne-corinne",
      "username": "acreesee",
      "email": "adalesioe@webs.com",
      "phone": "278-866-6311"
      }, {
      "id": 16,
      "name": "Kary",
      "username": "kstockwellf",
      "email": "keasbyf@dot.gov",
      "phone": "330-760-0175"
      }, {
      "id": 17,
      "name": "Michele",
      "username": "mokieltg",
      "email": "mmotteg@vimeo.com",
      "phone": "411-290-8227"
      }, {
      "id": 18,
      "name": "Reinwald",
      "username": "rlombardoh",
      "email": "rcoulth@godaddy.com",
      "phone": "405-923-8391"
      }, {
      "id": 19,
      "name": "Tabbi",
      "username": "tnestori",
      "email": "tgowari@scribd.com",
      "phone": "145-655-5217"
      }, {
      "id": 20,
      "name": "Ceil",
      "username": "cthumannj",
      "email": "cchessunj@howstuffworks.com",
      "phone": "586-193-0476"
      }, {
      "id": 21,
      "name": "Harlene",
      "username": "hcampagnek",
      "email": "hjeroschk@archive.org",
      "phone": "243-758-3577"
      }, {
      "id": 22,
      "name": "Ernst",
      "username": "estrondl",
      "email": "epassfieldl@csmonitor.com",
      "phone": "829-305-9328"
      }, {
      "id": 23,
      "name": "Darsie",
      "username": "doldfieldm",
      "email": "djuaram@biblegateway.com",
      "phone": "635-110-2385"
      }, {
      "id": 24,
      "name": "Aridatha",
      "username": "akennyn",
      "email": "ahaddockn@marriott.com",
      "phone": "517-440-0230"
      }, {
      "id": 25,
      "name": "Analise",
      "username": "acrystalo",
      "email": "afazackerleyo@shareasale.com",
      "phone": "314-299-4898"
      }, {
      "id": 26,
      "name": "Nicolas",
      "username": "norpwoodp",
      "email": "nvirginp@blogger.com",
      "phone": "606-353-1532"
      }, {
      "id": 27,
      "name": "Mose",
      "username": "mklawiq",
      "email": "moconnollyq@nymag.com",
      "phone": "630-993-1118"
      }, {
      "id": 28,
      "name": "Daisi",
      "username": "dtroppmannr",
      "email": "dsergeantr@vkontakte.ru",
      "phone": "381-138-5867"
      }, {
      "id": 29,
      "name": "Pat",
      "username": "pshorys",
      "email": "psuters@tmall.com",
      "phone": "543-121-2704"
      }, {
      "id": 30,
      "name": "Coral",
      "username": "cmcmickant",
      "email": "cjolint@blinklist.com",
      "phone": "668-403-7732"
    }];
	
	  //$.get( "https://cors.io/?http://www.dota2.com/play/", function( data ) {
      data = mock_data_1;
      for (var i = 0; i < data.length; i++) {
        var table_row = '<tr><td>'+data[i]['name']+'</td><td>'+data[i]['username']+'</td><td>'+data[i]['phone']+'</td><td>'+data[i]['email']+'</td><td><button type="button" class="btn btn-default">button</button></td></tr>';
        $( ".providers-table tbody" ).append( table_row );
      }
   // });

    $('.search').on('change, keyup',function() {
      var filter, tr, td, found;
      filter = $(this).val().toUpperCase();
      tr = $("tr");
      for (var i = 0; i < tr.length; i++) {
        found = false;
        for (var j = 0; j < tr[i].getElementsByTagName("td").length; j++) {
          td = tr[i].getElementsByTagName("td")[j];
          if (td && td.innerHTML.toUpperCase().indexOf(filter) > -1) {
            found = true;
          }
        }
        if (found) {
          tr[i].style.display = "";
        } else {
          tr[i].style.display = "none";
        }
      }
    });

	
	
	
	
	//------------------------------------------ ADMIN STUFF ABOUT USERS-PARENTS ------------------------------------------------
	
	
	
	  var mock_data_2 = [{
      "id": 1,
      "first_name": "Lorens",
	  "last_name": "Lorens",
      "username": "lbligh0",
      "email": "lhosburn0@msu.edu",
      "phone": "442-431-1318"
      }, {
      "id": 2,
      "first_name": "Mira",
	  "last_name": "Lorens",
      "username": "mhiley1",
      "email": "mgirardetti1@edublogs.org",
      "phone": "793-572-0484"
      }, {
      "id": 3,
      "first_name": "Seana",
	  "last_name": "Lorens",
      "username": "sackerman2",
      "email": "sbeamish2@acquirethisname.com",
      "phone": "639-100-8436"
      }, {
      "id": 4,
      "first_name": "Christy",
	  "last_name": "Lorens",
      "username": "cdoick3",
      "email": "cspellsworth3@bloglovin.com",
      "phone": "298-103-8921"
      }, {
      "id": 5,
      "first_name": "Rowland",
	  "last_name": "Lorens",
      "username": "ryaldren4",
      "email": "rskittle4@psu.edu",
      "phone": "187-897-9851"
      }, {
      "id": 6,
      "first_name": "Zahara",
	  "last_name": "Lorens",
      "username": "zside5",
      "email": "zgoodisson5@webnode.com",
      "phone": "250-827-5390"
      }, {
      "id": 7,
      "first_name": "Alexandra",
	  "last_name": "Lorens",
      "username": "aoldacres6",
      "email": "apoad6@uiuc.edu",
      "phone": "958-143-9517"
      }, {
      "id": 8,
      "first_name": "Robena",
	  "last_name": "Lorens",
      "username": "rtennet7",
      "email": "rhawkin7@cloudflare.com",
      "phone": "924-697-1846"
      }, {
      "id": 9,
      "first_name": "Raffaello",
	  "last_name": "Lorens",
      "username": "rrucklidge8",
      "email": "rdaffey8@noaa.gov",
      "phone": "861-538-3194"
      }, {
      "id": 10,
      "first_name": "Alane",
	  "last_name": "Lorens",
      "username": "abaudinet9",
      "email": "adoddrell9@ifeng.com",
      "phone": "735-727-9892"
      }, {
      "id": 11,
      "first_name": "Levi",
	  "last_name": "Lorens",
      "username": "lmaffettia",
      "email": "lpeschmanna@senate.gov",
      "phone": "635-758-8720"
      }, {
      "id": 12,
      "first_name": "Haze",
	  "last_name": "Lorens",
      "username": "hamdohrb",
      "email": "hyeomanb@cmu.edu",
      "phone": "426-931-1891"
      }, {
      "id": 13,
      "first_name": "Bernardine",
	  "last_name": "Lorens",
      "username": "bmaylerc",
      "email": "bshealc@hexun.com",
      "phone": "389-804-8090"
      }, {
      "id": 14,
      "first_name": "Derwin",
	  "last_name": "Lorens",
      "username": "dsquierd",
      "email": "diliffed@uol.com.br",
      "phone": "729-469-5926"
      }, {
      "id": 15,
      "first_name": "Anne-corinne",
	  "last_name": "Lorens",
      "username": "acreesee",
      "email": "adalesioe@webs.com",
      "phone": "278-866-6311"
      }, {
      "id": 16,
      "first_name": "Kary",
	  "last_name": "Lorens",
      "username": "kstockwellf",
      "email": "keasbyf@dot.gov",
      "phone": "330-760-0175"
      }, {
      "id": 17,
      "first_name": "Michele",
	  "last_name": "Lorens",
      "username": "mokieltg",
      "email": "mmotteg@vimeo.com",
      "phone": "411-290-8227"
      }, {
      "id": 18,
      "first_name": "Reinwald",
	  "last_name": "Lorens",
      "username": "rlombardoh",
      "email": "rcoulth@godaddy.com",
      "phone": "405-923-8391"
      }, {
      "id": 19,
      "first_name": "Tabbi",
	  "last_name": "Lorens",
      "username": "tnestori",
      "email": "tgowari@scribd.com",
      "phone": "145-655-5217"
      }, {
      "id": 20,
      "first_name": "Ceil",
	  "last_name": "Lorens",
      "username": "cthumannj",
      "email": "cchessunj@howstuffworks.com",
      "phone": "586-193-0476"
      }, {
      "id": 21,
      "first_name": "Harlene",
	  "last_name": "Lorens",
      "username": "hcampagnek",
      "email": "hjeroschk@archive.org",
      "phone": "243-758-3577"
      }, {
      "id": 22,
      "first_name": "Ernst",
	  "last_name": "Lorens",
      "username": "estrondl",
      "email": "epassfieldl@csmonitor.com",
      "phone": "829-305-9328"
      }, {
      "id": 23,
      "first_name": "Darsie",
	  "last_name": "Lorens",
      "username": "doldfieldm",
      "email": "djuaram@biblegateway.com",
      "phone": "635-110-2385"
      }, {
      "id": 24,
      "first_name": "Aridatha",
	  "last_name": "Lorens",
      "username": "akennyn",
      "email": "ahaddockn@marriott.com",
      "phone": "517-440-0230"
      }, {
      "id": 25,
      "first_name": "Analise",
	  "last_name": "Lorens",
      "username": "acrystalo",
      "email": "afazackerleyo@shareasale.com",
      "phone": "314-299-4898"
      }, {
      "id": 26,
      "first_name": "Nicolas",
	  "last_name": "Lorens",
      "username": "norpwoodp",
      "email": "nvirginp@blogger.com",
      "phone": "606-353-1532"
      }, {
      "id": 27,
      "first_name": "Mose",
	  "last_name": "Lorens",
      "username": "mklawiq",
      "email": "moconnollyq@nymag.com",
      "phone": "630-993-1118"
      }, {
      "id": 28,
      "first_name": "Daisi",
	  "last_name": "Lorens",
      "username": "dtroppmannr",
      "email": "dsergeantr@vkontakte.ru",
      "phone": "381-138-5867"
      }, {
      "id": 29,
      "first_name": "Pat",
	  "last_name": "Lorens",
      "username": "pshorys",
      "email": "psuters@tmall.com",
      "phone": "543-121-2704"
      }, {
      "id": 30,
      "first_name": "Coral",
	  "last_name": "Lorens",
      "username": "cmcmickant",
      "email": "cjolint@blinklist.com",
      "phone": "668-403-7732"
    }];
	
	
	
	
	//$.get( "https://cors.io/?http://www.dota2.com/play/", function( data ) {
      data = mock_data_2;
      for (var i = 0; i < data.length; i++) {
        var table_row = '<tr><td>'+data[i]['first_name']+'</td><td>'+data[i]['last_name']+'</td><td>'+data[i]['username']+'</td><td>'+data[i]['email']+'</td><td><button type="button" class="btn btn-default">button</button></td></tr>';
        $( ".parents-table tbody" ).append( table_row );
      }
   // });

    $('.search').on('change, keyup',function() {
      var filter, tr, td, found;
      filter = $(this).val().toUpperCase();
      tr = $("tr");
      for (var i = 0; i < tr.length; i++) {
        found = false;
        for (var j = 0; j < tr[i].getElementsByTagName("td").length; j++) {
          td = tr[i].getElementsByTagName("td")[j];
          if (td && td.innerHTML.toUpperCase().indexOf(filter) > -1) {
            found = true;
          }
        }
        if (found) {
          tr[i].style.display = "";
        } else {
          tr[i].style.display = "none";
        }
      }
    });

	
	
	

    //-------------------------------------- FOOTER SCROLLING ---------------------------------
    $("footer a[href='#myPage']").on('click', function(event) {
    
      // Make sure this.hash has a value before overriding default behavior
      if (this.hash !== "") {
    
        // Prevent default anchor click behavior
        event.preventDefault();
    
        // Store hash
        var hash = this.hash;
    
        // Using jQuery's animate() method to add smooth page scroll
        // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
        $('html, body').animate({
          scrollTop: $(hash).offset().top
        }, 900, function(){
    
          // Add hash (#) to URL when done scrolling (default click behavior)
          window.location.hash = hash;
          });

          // Removes focus on the button
          $(this).blur();

        } // End if 
      });
});