function showText(){
    var text = document.querySelector("#desc");
    text.style.display = 'block';
    var button = document.querySelector("#open");
    button.style.display = 'none';
}
function hideText(){
    var text = document.querySelector("#desc");
    text.style.display = 'none';
    var button = document.querySelector("#open");
    button.style.display = 'block';
    
}