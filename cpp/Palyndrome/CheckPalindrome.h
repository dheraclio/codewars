#ifndef CHECKPALINDROME_H
#define CHECKPALINDROME_H

#include <algorithm>
#include <string>
#include <iostream>

using namespace std;

class CheckPalindrome {
public:
  CheckPalindrome();
  CheckPalindrome(const CheckPalindrome& orig);
  virtual ~CheckPalindrome();

  void PrintIsPalindrome(string input);
private:

  bool IsPalyndrome(string input);
};

#endif /* CHECKPALINDROME_H */

