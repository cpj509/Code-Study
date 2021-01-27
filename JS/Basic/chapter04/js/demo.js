function myFunction(){
    var a = parseInt("10") + '<br>';
    var b = parseInt("12.34") + '<br>';
    var c = parseInt("010") + '<br>';
    var d = parseInt("10", 8) + '<br>';
    var e = parseInt("0x16") + '<br>';
    

    document.getElementById("demo").innerHTML = 
    a + b + c + d + e;
}