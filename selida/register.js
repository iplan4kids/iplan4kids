var check = function() {
  if (document.getElementById('password').value == "" || document.getElementById('confirm_password').value == ""){
    
    document.getElementById('password').style.border = '1px solid #ddd';
    document.getElementById('password').style.backgroundColor = "white";
    document.getElementById('confirm_password').style.border = '1px solid #ddd';
    document.getElementById('confirm_password').style.backgroundColor = "white";
    document.getElementById('register1-submit').disabled = false;
  }
  else if (document.getElementById('password').value ==
    document.getElementById('confirm_password').value) {
    document.getElementById('password').style.border = '1px solid #ddd';
    document.getElementById('password').style.backgroundColor = "white";
    document.getElementById('confirm_password').style.border = '1px solid #ddd';
    document.getElementById('confirm_password').style.backgroundColor = "white";
    document.getElementById('register1-submit').disabled = false;
    //document.getElementById('message').innerHTML = 'matching';
  } else {
    document.getElementById('password').style.borderBottom = "3px solid red";
    document.getElementById('password').style.backgroundColor = "lightgrey";
    document.getElementById('confirm_password').style.borderBottom = "3px solid red";
    document.getElementById('confirm_password').style.backgroundColor = "lightgrey";
    document.getElementById('register1-submit').disabled = true;
    //document.getElementById('message').innerHTML = 'not matching';
  }
}

var check1 = function() {
  if (document.getElementById('password1').value == "" || document.getElementById('confirm_password1').value == ""){
    
    document.getElementById('password1').style.border = '1px solid #ddd';
    document.getElementById('password1').style.backgroundColor = "white";
    document.getElementById('confirm_password1').style.border = '1px solid #ddd';
    document.getElementById('confirm_password1').style.backgroundColor = "white";
    document.getElementById('register-submit').disabled = false;
  }
  else if (document.getElementById('password1').value ==
    document.getElementById('confirm_password1').value) {
    document.getElementById('password1').style.border = '1px solid #ddd';
    document.getElementById('password1').style.backgroundColor = "white";
    document.getElementById('confirm_password1').style.border = '1px solid #ddd';
    document.getElementById('confirm_password1').style.backgroundColor = "white";
    document.getElementById('register-submit').disabled = false;
    //document.getElementById('message').innerHTML = 'matching';
  } else {
    document.getElementById('password1').style.borderBottom = "3px solid red";
    document.getElementById('password1').style.backgroundColor = "lightgrey";
    document.getElementById('confirm_password1').style.borderBottom = "3px solid red";
    document.getElementById('confirm_password1').style.backgroundColor = "lightgrey";
    document.getElementById('register-submit').disabled = true;
    //document.getElementById('message').innerHTML = 'not matching';
  }
}
