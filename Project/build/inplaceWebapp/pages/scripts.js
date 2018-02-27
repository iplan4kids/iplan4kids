// !!! BELOW CODE WILL RUN ONCE THE PAGE IS READY FOR JAVASCRIPT CODE TO EXECUTE

/*var notlogged = '<li ><a href="register.html"><span class="glyphicon glyphicon-user"></span> Εγγραφή </a></li>\n' +
    '                    <li class="notlogged"><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Σύνδεση </a></li>';

var logged = '<li class="dropdown">\n' +
    '        \t\t\t\t\t\t\t<a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> %USERNAME%' +
    '        \t\t\t\t\t\t\t<span class="caret"></span></a>\n' +
    '        \t\t\t\t\t\t\t\t  <ul class="dropdown-menu">\n' +
    '        \t\t\t\t\t\t\t\t\t <li><a id="profile" href="/app/myProfile"><span class="glyphicon glyphicon-file"></span>Τα στοιχεία μου</a></li>\n' +
    '        \t\t\t\t\t\t\t\t\t <li><a id="wallet" href="#"><span class="glyphicon glyphicon-piggy-bank"></span>Πορτοφίλι(%WALLET_POINTS%)</a></li>\n' +
    '        \t\t\t\t\t\t\t\t\t <li ><a  href="/app/logoutStrong"><span id="logout" class="glyphicon glyphicon-log-out"></span>Αποσύνδεση</a></li>\n' +
    '\n' +
    '        \t\t\t\t\t\t\t\t  </ul>\n' +
    '        \t\t\t\t\t\t</li>';

var show = false;
*/
//var userdata = {"username":"Gio","balance":"789"};
$(document).ready(function() {
    //---------------------------------------- MODAL FORM -------------------------------------------




    $(function() {
        $('#register1-form-link').click(function(e) {
            $("#register1-form").delay(100).fadeIn(100);
            $("#register-form").fadeOut(100);
            $("#register2-form").fadeOut(100);
            $('#register-form-link').removeClass('active');
            $('#register2-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
        $('#register2-form-link').click(function(e) {
            $("#register2-form").delay(100).fadeIn(100);
            $("#register1-form").fadeOut(100);
            $("#register-form").fadeOut(100);
            $('#register-form-link').removeClass('active');
            $('#register1-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
        $('#register-form-link').click(function(e) {
            $("#register-form").delay(100).fadeIn(100);
            $("#register1-form").fadeOut(100);
            $("#register2-form").fadeOut(100);
            $('#register1-form-link').removeClass('active');
            $('#register2-form-link').removeClass('active');
            $(this).addClass('active');
            e.preventDefault();
        });
    });




    /* attach a submit handler to the form */
    $("#login1-form").submit(function(event) {

        /* stop form from submitting normally */
        event.preventDefault();

            // send ajax
            $.ajax({
                url: "/app/loginClient", // url where to submit the request
                type : "POST", // type of action POST || GET
                dataType : 'json', // data type
                data : $("#login1-form").serialize(), // post data || get data
                success : function(result) {
                    // you can see the result from the console
                    // tab of the developer tools

                    if (result.success) {
                        var parentDiv = $("#logregprof");
						var text = parentDiv.html().replace('%USERNAME%', result.username).replace('%WALLET_POINTS%', result.balance.toFixed(2));
						parentDiv.html(text);
						$(".notlogged").hide();
						$("#logged1").show();
                        $("#logged2").show();
								
                        $('#myModal').modal('hide');
                    }
                    else {
                        $("#clientwrong").show();

						//na mhn kleisei to modal kai na vgei me alert to result.username pou 8a periexei to logo apotuxias
						//epishs ftia3e ena ajax post request gia to koumpi logout (url=/logout) kai onSuccess na gurnaei thn mpara me thn eggrafh kai to login
					}
                },
                error: function(xhr, resp, text) {
                    alert("AJAX FAILED");
                }
            })

    });

    //---------------------------------------- CLIENT LOGOUT -------------------------------------------
    $('#logout').click(function(e) {
        alert("SURPRISE MOTHAFUCKA!");
        e.preventDefault();
    });

    //---------------------------------------- REGISTER FORM -------------------------------------------

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
