var num = 1;
function prevGallery(){
    num == 1 ? num = 7 : num--;
    document.getElementById("gallery").src= "images/img" + num + ".jpg";
}
function nextGallery(){
    num == 7 ? num = 1 : num++;
    document.getElementById("gallery").src= "images/img" + num + ".jpg";
}