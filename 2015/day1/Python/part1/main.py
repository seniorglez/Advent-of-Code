import sys
input = sys.argv[1]
def main():
    floor = 0
    print(f"Processing: {input}")
    for i in input:
        if i == "(":
            floor += 1
        else:
            floor -= 1
    print(floor)

if __name__ == '__main__':
    main()