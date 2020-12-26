#include <stdio.h>
#include <string.h>

int
main (int argc, char* argv[])
{
    printf("Processing: %s \n", argv[1]);
    int floor = 0;
    int i;
    for (i = 0; i < strlen(argv[1]); ++i)
    {
        if(argv[1][i] == '(')
        {
            floor++;
        } else {
            floor--;
        }
    }
    printf("%d \n", floor);
    return 0;
}