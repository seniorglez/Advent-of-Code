import Foundation

var floor: Int = 0

print("Processing: " + CommandLine.arguments[1]);

for char in CommandLine.arguments[1] {
    if char == "(" {
        floor += 1
    } else {
        floor -= 1
    }
}

print(floor)



