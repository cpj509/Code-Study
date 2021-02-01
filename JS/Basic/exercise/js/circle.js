function Circle(radius){
    this.radius = radius;
    this.circumference = function(){
        return Math.floor(2 * Math.PI * this.radius);
    }
    this.circlearea = function(){
        return Math.floor(Math.PI * this.radius * this.radius);
    }
}
var radius = prompt("원의 반지름은? (cm)", "15");
var circle1 = new Circle(radius);

document.write("<b>" + circle1.radius + "cm일 때<br>");
document.write("원의 둘레 : 약 " + circle1.circumference() + "cm<br>");
document.write("원의 넓이 : 약 " + circle1.circlearea() + "cm<sup>2</sup></b>");
