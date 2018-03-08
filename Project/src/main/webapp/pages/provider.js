$(document).ready(function() {

    $.ajax({
        url: "/app/provider/history", // url where to submit the request
        type: "GET", // type of action POST || GET
        dataType: 'json', // data type
        //contentType : 'json',
        success: function (result) {
            // you can see the result from the console
            // tab of the developer tools
            if (result.length != 0) {
                data = result;
                for (var i = 0; i < data.length; i++) {

                    var table_row = '<tr><td>' + data[i]['title'] + '</td><td><button onclick="location.href =' + "'" + ' /app/admin/clients/reset/' + data[i]["event_id"] + "'" + ';"  type="button" class="btn btn-success">Προβολή Δραστηριότητας</button></td></tr>';
                    $(".table tbody").append(table_row);

                }

            }
        },
        error: function (xhr, resp, text) {
            alert("AJAX FAILED");
        }
    })
   });


$(function() {
        $('#history').click(function(e) {
            $('#repo').removeClass('active');
            $(this).addClass('active');
	    $('#hisrepo').empty();
	    var histo = ' <h2 style="text-align:center;"> Ιστορικό </h2>' + '<table class="table">'
  +'          <thead>'
  +'            <tr>'
  +'              <th>Όλες οι δραστηριότητες μου</th>'
  +'              <th>Προβολή δραστηριότητας</th>'
  +'            </tr>'
  +'          </thead>'
	+'     <tbody>'
			
          +'</tbody>'
        +'  </table> ';
	    $('#hisrepo').append(histo);
            $.ajax({
                url: "/app/provider/history", // url where to submit the request
                type: "GET", // type of action POST || GET
                dataType: 'json', // data type
                //contentType : 'json',
                success: function (result) {
                    // you can see the result from the console
                    // tab of the developer tools
                    if (result.length != 0) {
                        data = result;
                        for (var i = 0; i < data.length; i++) {

                            var table_row = '<tr><td>' + data[i]['title'] + '</td><td><button onclick="location.href =' + "'" + ' /app/admin/clients/reset/' + data[i]["event_id"] + "'" + ';"  type="button" class="btn btn-success">Προβολή Δραστηριότητας</button></td></tr>';
                            $(".table tbody").append(table_row);

                        }

                    }
                },
                error: function (xhr, resp, text) {
                    alert("AJAX FAILED");
                }
            });
            e.preventDefault();
        });
        $('#repo').click(function(e) {
          $('#history').removeClass('active');
            $(this).addClass('active');
	    $('#hisrepo').empty();
	    	    var repos = ' <h2 style="text-align:center;"> Aναφορά </h2>' + '<table class="table">'
  +'          <thead>'
  +'            <tr>'
  +'              <th>Όλες οι δραστηριότητες μου</th>'
  +'              <th>Προβολή δραστηριότητας</th>'
  +'            </tr>'
  +'          </thead>'
	+'     <tbody>'
			
          +'</tbody>'
        +'  </table> ';
	    $('#hisrepo').append(repos);
            $.ajax({
                url: "/app/provider/history", // url where to submit the request
                type: "GET", // type of action POST || GET
                dataType: 'json', // data type
                //contentType : 'json',
                success: function (result) {
                    // you can see the result from the console
                    // tab of the developer tools
                    if (result.length != 0) {
                        data = result;
                        for (var i = 0; i < data.length; i++) {

                            var table_row = '<tr><td>' + data[i]['title'] + '</td><td><button onclick="location.href =' + "'" + ' /app/admin/clients/reset/' + data[i]["event_id"] + "'" + ';"  type="button" class="btn btn-success">Προβολή Δραστηριότητας</button></td></tr>';
                            $(".table tbody").append(table_row);

                        }

                    }
                },
                error: function (xhr, resp, text) {
                    alert("AJAX FAILED");
                }
            });
            e.preventDefault();
        });
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

