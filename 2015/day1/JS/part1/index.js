var  input = read('input');
var count = 0;
print('Processing' + input);
var i = input.length;
while (i--) {
  if(input[i] == '('){
    count++;
  } else {
    count--;
  }
}
print(count);