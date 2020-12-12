<?php
parse_str(implode('&', array_slice($argv, 1)), $_GET);
$input = $_GET['input'];
echo "Processing: {$input} \n";
$floor = 0;
$strlen = strlen( $input );
for( $i = 0; $i <= $strlen; $i++ ) {
    $char = substr( $input, $i, 1 );
    if(strcmp($char, "(") === 0) {
        ++$floor;
    } elseif(strcmp($char, ")") === 0) {
        --$floor;
    }
}
echo "{$floor} \n";
?>