var input = read('input');
var count = 0;
print('Processing' + input);
var i = input.length;
for (var i = 0; i < input.length && count!= -1; i++) {
  if(input[i] == '('){
    count++;
  } else {
    count--;
  }
}

print(i);