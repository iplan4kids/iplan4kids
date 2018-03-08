// !!! BELOW CODE WILL RUN ONCE THE PAGE IS READY FOR JAVASCRIPT CODE TO EXECUTE

$(document).ready(function() {

    $("#buy-form").submit(function(event) {

        /* stop form from submitting normally */
        event.preventDefault();

        // send ajax
        $.ajax({
            url: "/app/events/buyTheTickets", // url where to submit the request
            type : "POST", // type of action POST || GET
            dataType : 'json', // data type
            data : $("#buy-form").serialize(), // post data || get data
            success : function(result) {
                // you can see the result from the console
                // tab of the developer tools

                if (result.success) {
                    var parentDiv = $("#logregprof");
                    var text ='<span class="glyphicon glyphicon-piggy-bank"></span> Πορτοφόλι ('+result.balance.toFixed(2)+')';
                    $("#logged1").html(text);
                    alert("Η συναλλαγη ήταν επιτυχής. Αγοράσατε "+$("#ticketsnumber").val()+" εισητήρια για την παρούσα δραστηριότητα.")


                    $('#buyModal').modal('hide');
                }
                else {
                    $("#clientwrong").show();

                }
            },
            error: function(xhr, resp, text) {
                alert("Η συναλλαγή δεν ήταν επιτυχής. Εάν είστε σίγουροι οι πόντοι σας επαρκούν, πιθανώς να μην υπάρχουν όσα εισητήρια επιθυμείτε. Σε κάθε περίπτωση δοκιμάστε ξανά!!! ");
            }
        })

    });

    //---------------------------------------- CLIENT LOGIN -------------------------------------------

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
                        $("#icantBuy").hide();
                        $("#icanBuy").show();


								
                        $('#myModal').modal('hide');
                    }
                    else {
                        $("#clientwrong").show();

					}
                },
                error: function(xhr, resp, text) {
                    alert("AJAX FAILED");
                }
            })

    });



        //---------------------------------------- ADMIN LOGIN -------------------------------------------


    /* attach a submit handler to the form */
        $("#login2-form").submit(function(event) {

            /* stop form from submitting normally */
            event.preventDefault();

                // send ajax
                $.ajax({
                    url: "/app/login/admin", // url where to submit the request
                    type : "POST", // type of action POST || GET
                    dataType : 'json', // data type
                    data : $("#login2-form").serialize(), // post data || get data
                    success : function(result) {
                        // you can see the result from the console
                        // tab of the developer tools

                        if (result) {
    						var href = "/app/admin"
							window.location = href;
    					}
    					else {
                            $("#adminwrong").show();
    					}
                    },
                    error: function(xhr, resp, text) {
                        alert("AJAX FAILED");
                    }
                })
        });



        //---------------------------------------- PROVIDER LOGIN -------------------------------------------

    /* attach a submit handler to the form */
        $("#login-form").submit(function(event) {

            /* stop form from submitting normally */
            event.preventDefault();
			
                // send ajax
                $.ajax({
                    url: "/app/login/provider", // url where to submit the request
                    type : "POST", // type of action POST || GET
                    dataType : 'json', // data type
                    data : $("#login-form").serialize(), // post data || get data
                    success : function(result) {
                        // you can see the result from the console
                        // tab of the developer tools

                        if (result) {
							var href = "/app/provider/"
							window.location = href;
    					}
    					else {
                            $("#providerwrong").show();
    					}
                    },
                    error: function(xhr, resp, text) {
                        alert("AJAX FAILED");
                    }
                })
        });

    //---------------------------------------- LOGIN FORM -------------------------------------------

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


//-------------------------------- BUY POINTS -----------------------------------------

    $("#points-form").submit(function(event) {

        /* stop form from submitting normally */
        event.preventDefault();
        event.stopPropagation();

        // send ajax
        $.ajax({
            url: "/app/buyPoints/buy", // url where to submit the request
            type : "POST", // type of action POST || GET
            dataType : 'json', // data type
            data : $("#points-form").serialize(), // post data || get data
            success:function(result) {
                // you can see the result from the console
                // tab of the developer tools

                if (result.success){

                    var text ='<span class="glyphicon glyphicon-piggy-bank"></span> Πορτοφόλι ('+result.balance.toFixed(2)+')';
                    $("#logged1").html(text);

                    alert("Oι πόντοι προστέθηκαν στο πορτοφόλι σας! Ευχαριστούμε πολύ!")
                }
                else {
                    alert("Υπήρξε πρόβλημα και η συναλλαγή δεν ολοκληρώθηκε! Προσπαθήστε ξανά!")
                }
            },
            error: function(xhr, resp, text) {
                alert("AJAX FAILED");
            }
        })
    });



    //--------------------------------RENEW SUBSCRIPTION------------------------------------------

    $("#renew-form").submit(function(event) {

        /* stop form from submitting normally */
        event.preventDefault();

        // send ajax
        $.ajax({
            url: "/app/provider/buySub/renew", // url where to submit the request
            type : "POST", // type of action POST || GET
            dataType : 'json', // data type
            data : $("#renew-form").serialize(), // post data || get data
            success : function(result) {
                // you can see the result from the console
                // tab of the developer tools

                if (result) {
                    alert("Η συνδρομή σας ανανεώθηκε! Ευχαριστούμε πολύ!")
                }
                else {
                    alert("Υπήρξε πρόβλημα και η ανανέωση δεν πραγματοποιήθηκε! Προσπαθήστε ξανά!")
                }
            },
            error: function(xhr, resp, text) {
                alert("AJAX FAILED");
            }
        })
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
