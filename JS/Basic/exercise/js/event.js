var img = document.querySelector("#birdpic");
img.addEventListener("mouseover", overpic);
img.addEventListener("mouseout", originpic);
function overpic(){
    img.src = "images/bird2.jpg"
}
function originpic(){
    img.src = "images/bird1.jpg"
}