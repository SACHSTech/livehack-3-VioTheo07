class Problem1 extends ConsoleProgram {

  /**
  * Description
  * @author: Vio
  */
  
  public void run() {

    println("***** Student Account Registration ****");
    println("Enter your first name: ");
    println("Enter your last name: ");
    println("Enter your student number: ");
    println("Enter a new username: ");



  }

  public void validateUsername(username) {
    
    {

      // Step 1: Check if the username consists of only letters and digits

      for (let i = 0; i < username.length; i++) {
          charCode = username.charCodeAt(i);
          if (!((charCode >= 48 && charCode <= 57) || // Check if it's a digit
                (charCode >= 65 && charCode <= 90) || // Check if it's an uppercase letter
                (charCode >= 97 && charCode <= 122))) { // Check if it's a lowercase letter
              return false; // If any character is not a letter or digit, return false
          }
      }
      // Step 2: Check if the username has at least one digit
      let hasDigit = false;
      for (let i = 0; i < username.length; i++) {
          charCode = username.charCodeAt(i);
          if (charCode >= 48 && charCode <= 57) {
              hasDigit = true;
              break;
          }
      }
  

}

private string createPassword(String Str) {
  String createPassword() {
    // getting info

    String FirstName;
    String StudentNumber;
    String LastName;

    FirstName.charAt(0).toUpperCase();
    LastName.slice(0, 4).toLowerCase();
    StudentNumber.slice(3, 6);
    
    // reconstructing
    string password = firstName + lastName + studentNumber;
    
    return password;


  
  }
}

}

}
