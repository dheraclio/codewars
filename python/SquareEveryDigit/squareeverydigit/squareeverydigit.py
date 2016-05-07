
def square_digits(num):
  result = ''
  for digit in str(num):
    result += str(int(digit) * int(digit))
  return int(result)

if __name__ == "__main__":
  print("9119 -> %d") % (square_digits(9119))