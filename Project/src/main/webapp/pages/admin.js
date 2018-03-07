//------------------------------------------ ADMIN STUFF ABOUT USERS-PROVIDERS ------------------------------------------------

$(document).ready(function() {

    $.ajax({
        url: "/app/admin/clients", // url where to submit the request
        type : "GET", // type of action POST || GET
        dataType : 'json', // data type
        //contentType : 'json',
        success : function(result) {
            // you can see the result from the console
            // tab of the developer tools
            if(result.length != 0) {
                data = result;

                for (var i = 0; i < data.length; i++) {
                    if (data[i]['blocked']){
                        var disable = "none";
                        var enable = "inline";
                    }
                    else{
                        var disable = "inline";
                        var enable = "none";
                    }
                    var table_row = '<tr><td>'+data[i]['first_name']+'</td><td>'+data[i]['last_name']+'</td><td>'+data[i]['username']+'</td><td>'+data[i]['email']+'</td><td>'+data[i]['m_phone']+'</td><td>'+data[i]['wallet']+'</td><td><button onclick="location.href ='+"'" +' /app/admin/clients/reset/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-success">Reset</button><button style="display:'+enable+' " onclick="location.href ='+"'" +' /app/admin/clients/enable/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-warning">Enable</button><button style="display:'+disable+' " onclick="location.href ='+"'" +' /app/admin/clients/block/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-danger">Disable</button><button onclick="location.href ='+"'" +' /app/admin/clients/delete/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-default">Remove</button></td></tr>';
                    $( ".parents-table tbody" ).append( table_row );
                }

            }
        },
        error: function(xhr, resp, text) {
            alert("AJAX FAILED");
        }
    })


	


});

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


$(function() {
    $('#users').click(function(e) {

        $('#admins').removeClass('active');
        $(this).addClass('active');
        $('#usprovTable').empty();

        var addUs= '<h3 style="text-align: center; font-weight: bold; margin-bottom:20px;">Λίστα Γονέων</h3>\n' +
            '        <table class="parents-table table table-striped table-bordered">\n' +
            '          <thead>\n' +
            '            <tr>\n' +
            '              <th>Όνομα</th>\n' +
            '              <th>Επώνυμο</th>\n' +
            '              <th>Username</th>\n' +
            '              <th>Email</th>\n' +
            '              <th>Τηλέφωνο</th>\n' +
            '              <th>Πορτοφόλι</th>\n' +
            '              <th>Ενέργειες</th>\n' +
            '            </tr>\n' +
            '          </thead>\n' +
            '          <tbody>\n' +
            '\t\t\t\n' +
            '          </tbody>\n' +
            '        </table>' ;
        $('#usprovTable').append(addUs);
        $.ajax({
            url: "/app/admin/clients", // url where to submit the request
            type : "GET", // type of action POST || GET
            dataType : 'json', // data type
            //contentType : 'json',
            success : function(result) {
                // you can see the result from the console
                // tab of the developer tools
                if(result.length != 0) {
                    data = result;

                    for (var i = 0; i < data.length; i++) {
                        if (data[i]['blocked']){
                            var disable = "none";
                            var enable = "inline";
                        }
                        else{
                            var disable = "inline";
                            var enable = "none";
                        }
                        var table_row = '<tr><td>'+data[i]['first_name']+'</td><td>'+data[i]['last_name']+'</td><td>'+data[i]['username']+'</td><td>'+data[i]['email']+'</td><td>'+data[i]['m_phone']+'</td><td>'+data[i]['wallet']+'</td><td><button onclick="location.href ='+"'" +' /app/admin/clients/reset/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-success">Reset</button><button style="display:'+enable+' " onclick="location.href ='+"'" +' /app/admin/clients/enable/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-warning">Enable</button><button style="display:'+disable+' " onclick="location.href ='+"'" +' /app/admin/clients/block/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-danger">Disable</button><button onclick="location.href ='+"'" +' /app/admin/clients/delete/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-default">Remove</button></td></tr>';
                        $( ".parents-table tbody" ).append( table_row );
                    }

                }
            },
            error: function(xhr, resp, text) {
                alert("AJAX FAILED");
            }
        })
        e.preventDefault();
    });
    $('#admins').click(function(e) {

        $('#users').removeClass('active');
        $(this).addClass('active');
        $('#usprovTable').empty();
        var parentDiv = $('#usprovTable');
        var addAdm ='<h3 style="text-align: center; font-weight: bold; margin-bottom:20px;">Λίστα Παρόχων</h3>\n'+
            '         <table class="providers-table table table-striped table-bordered">\n' +
            '          <thead>\n' +
            '            <tr>\n' +
            '              <th>Όνομα</th>\n' +
	    '              <th>Πόλη</th>\n' +
	    '              <th>Οδός</th>\n' +
	    '              <th>Αριθμός Οδού</th>\n' +
	    '              <th>Τ.Κ</th>\n' +
            '              <th>Username</th>\n' +
            '              <th>Τηλέφωνο</th>\n' +
            '              <th>Email</th>\n' +
	    '              <th>A.Φ.Μ</th>\n' +
            '              <th>IBAN</th>\n' +
	    '              <th>Όνομα Υπεύθυνου</th>\n' +
            '              <th>Επώνυμο Υπεύθυνου</th>\n' +
	    '              <th>Tηλέφωνο Υπεύθυνου</th>\n' +
	    '              <th>Συνδρομή</th>\n' +
	    '              <th>Χρέος</th>\n' +
            '              <th>Ενέργειες</th>\n' +
            '            </tr>\n' +
            '          </thead>\n' +
            '          <tbody>\n' +
            '\t\t\t\n' +
            '          </tbody>\n' +
            '        </table>';
        $('#usprovTable').append(addAdm);
        $.ajax({
            url: "/app/admin/providers", // url where to submit the request
            type : "GET", // type of action POST || GET
            dataType : 'json', // data type
            //contentType : 'json',
            success : function(result) {
                // you can see the result from the console
                // tab of the developer tools
                if(result.length != 0) {
                    data = result;
                    for (var i = 0; i < data.length; i++) {
			var date = new Date(data[i]['subscription']);
                	var dd = date.getDate();
                    	var mm = date.getMonth();
                    	var yyyy = date.getFullYear();
		    	if (dd<10){
                       	 dd = '0' + dd;
                    	}
                    	if (mm<10){
                         mm = '0' +mm;
                     	}
                if (data[i]['blocked']){
		    	    var disable = "none";
		    	    var enable = "inline";
                }
                else{
                    var disable = "inline";
                    var enable = "none";
                }

		    	var subDate = dd + "/" + mm + "/" + yyyy;
                        var table_row = '<tr><td>'+data[i]['company_name']+'</td><td>'+data[i]['city']+'</td><td>'+data[i]['address']+'</td><td>'+data[i]['address_num']+'</td><td>'+data[i]['postal_code']+'</td><td>'+data[i]['username']+'</td><td>'+data[i]['phone']+'</td><td>'+data[i]['email']+'</td><td>'+data[i]['afm']+'</td><td>'+data[i]['iban']+'</td><td>'+data[i]['first_name']+'</td><td>'+data[i]['last_name']+'</td><td>'+data[i]['m_phone']+'</td><td>'+subDate+'</td><td>'+data[i]['dept']+'</td><td><button onclick="location.href ='+"'" +' /app/admin/providers/reset/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-success">Reset</button><button style="display:'+enable+' " onclick="location.href ='+"'" +' /app/admin/providers/enable/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-warning">Enable</button><button style="display:'+disable+' " onclick="location.href ='+"'" +' /app/admin/providers/block/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-danger">Disable</button><button onclick="location.href ='+"'" +' /app/admin/providers/delete/'+data[i]["id"]+"'"+';"  type="button" class="btn btn-default">Remove</button></td></tr>';
                        $( ".providers-table tbody" ).append( table_row );
                    }

                }
            },
            error: function(xhr, resp, text) {
                alert("AJAX FAILED");
            }
        })

        e.preventDefault();
    });
});
