function throwDice(){
    var num = Math.floor(Math.random()*6) + 1;
    document.getElementById("demo").innerHTML = num;
}