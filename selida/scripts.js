// !!! BELOW CODE WILL RUN ONCE THE PAGE IS READY FOR JAVASCRIPT CODE TO EXECUTE
$(document).ready(function() {


    //---------------------------------------- LOGIN MODAL FORM -------------------------------------------

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