<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HTML files list V1.0</title>
    <link href="current.css" rel="stylesheet" type="text/css"></head>
<body>
    <h1 align="center">HTML files list</h1>

<?php
$dirName = $_GET['tournament'];
echo '<h1 align="center">' . $dirName . '</h1>';
$dir = opendir('./' . $dirName); 
?>

    <table align="center" class="simple">
        <th class="middle">HTML file name</th>

<?php

$nbFiles = 0;
$newLine = "\r\n";

while($file = readdir($dir)) {
    if($file != '.' && $file != '..' && end(explode('.', $file)) == 'html')
    {
        $nbFiles++;
        echo $newLine .'<tr>';
        $strPar = 'pair';
        if ($nbFiles % 2 == 1 ) $strPar = 'impair';
        
        echo $newLine .'<td class=' . $strPar . ' align=middle>' . '<a href="./' .$dirName . '/' . $file . '"> ' . $file . '&nbsp;</a></td>';
        
        echo $newLine .'</tr>';
    }
}
echo '</table>';

if ($nbFiles == 0) echo '<br><p align=center> No html file</p>';
closedir($dir);
?>
</body>
</html>