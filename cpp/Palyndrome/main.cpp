#include <cstdlib>
#include "CheckPalindrome.h"

using namespace std;

/*
 *
 */
int main(int argc, char** argv) {
  string input = "";

  CheckPalindrome checker;


  input = "ovo";
  checker.PrintIsPalindrome(input);

  input = "Amor";
  checker.PrintIsPalindrome(input);

  input = "A man, a plan, a canal, Panama!";
  checker.PrintIsPalindrome(input);
  input = "Roma";
  checker.PrintIsPalindrome(input);
  input = "race car";
  checker.PrintIsPalindrome(input);
  input = "stack cats";
  checker.PrintIsPalindrome(input);
  input = "step on no pets";
  checker.PrintIsPalindrome(input);
  input = "taco cat";
  checker.PrintIsPalindrome(input);
  input = "put it up";
  checker.PrintIsPalindrome(input);
  input = "Was it a car or a cat I saw?";
  checker.PrintIsPalindrome(input);
  input = "No ‘x’ in Nixon";
  checker.PrintIsPalindrome(input);

  return 0;
}



