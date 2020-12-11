input=$1
floor=0
echo "Processing: $1"
for (( i=0; i<${#input}; i++ )); do
  if [ "${input:$i:1}" == "(" ]
  then
    ((floor++))
  else
    ((floor--))
  fi
done
echo $floor