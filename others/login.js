document.getElementById('login-form').addEventListener('submit', function(event) {
  event.preventDefault();
  let email = document.getElementById('email').value;
  let password = document.getElementById('password').value;
  console.log('Login with email:', email, 'and password:', password);
});

document.getElementById('signup-form').addEventListener('submit', function(event) {
  event.preventDefault();
  let email = document.getElementById('signup-email').value;
  let password = document.getElementById('signup-password').value;
  console.log('Sign Up with email:', email, 'and password:', password);
});