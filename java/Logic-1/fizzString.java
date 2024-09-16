// Given a string str, if the string starts with "f" 
// return "Fizz". If the string ends with "b" return 
// "Buzz". If both the "f" and "b" conditions are true, 
// return "FizzBuzz". In all other cases, return the 
// string unchanged. (See also: FizzBuzz Code)

// fizzString("fig") → "Fizz"
// fizzString("dib") → "Buzz"
// fizzString("fib") → "FizzBuzz"
public String fizzString(String str) {
  char f = str.charAt(0), b = str.charAt(str.length()-1);
  if(f == 'f' && b == 'b') {
    return "FizzBuzz";
  }else if(f == 'f' && !(b == 'b')) {
    return "Fizz";
  }else if(b == 'b') {
    return "Buzz";
  }
  return str;
}
