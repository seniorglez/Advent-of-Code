package main

import (
	"fmt"
    "os"
)

func main(){
	input := os.Args[1]
	fmt.Println("Processing ", input)
	floor :=0
	for i := 0; i < len(input); i++  {
		if input[i] == ')' {
			floor++
		} else {
			floor--
		}
	}
	fmt.Println(floor)
}