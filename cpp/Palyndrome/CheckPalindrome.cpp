#include "CheckPalindrome.h"
#include <boost/algorithm/string/predicate.hpp>

CheckPalindrome::CheckPalindrome() {
}

CheckPalindrome::CheckPalindrome(const CheckPalindrome& orig) {
}

CheckPalindrome::~CheckPalindrome() {
}

void CheckPalindrome::PrintIsPalindrome(string input) {
  cout << input << ": ";
  if (IsPalyndrome(input)) {
    cout << "true";
  } else {
    cout << "false";
  }
  cout << "\n";
}

bool CheckPalindrome::IsPalyndrome(string input) {

  if (input.size() == 0) {
    return true;
  }

  int i = 0;
  int j = input.size() - 1;
  while (i < input.size() && j >-1) {
    //ignore non characters
    while (!isalpha(input[i]) && i < j) {
      i++;
    }

    //ignore non characters
    while (!isalpha(input[j]) && j > i) {
      j--;
    }

    if (i >= j) {
      break;
    }

    if (toupper(input[i++]) != toupper(input[j--])) {
      return false;
    }
  }
  return true;
}

